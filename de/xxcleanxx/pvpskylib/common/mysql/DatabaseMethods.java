package de.xxcleanxx.pvpskylib.common.mysql;

import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseMethods {
	private Connection _connection;

	public DatabaseMethods(@NotNull Connection connection) {
		this.setConnection(connection);
	}

	@NotNull
	public Connection getConnection() {
		return this._connection;
	}

	private void setConnection(@NotNull Connection connection) {
		this._connection = connection;
	}

	public void close() {
		try {
			if (!this.getConnection().isClosed()) this.getConnection().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public DatabaseMethods executeNonQuery(String commandText, Object[] parameters) throws SQLException {
		if (commandText == null) throw new IllegalArgumentException("Command cannot be null!");
		if (commandText.trim().isEmpty()) throw new IllegalArgumentException("Command is empty or consists of white-spaces!");

		PreparedStatement statement = this.getConnection().prepareStatement(commandText);

		if (parameters != null && parameters.length > 0) {
			for (int i = 1; i <= parameters.length; i++) {
				statement.setObject(i, parameters[i - 1]);
			}
		}

		System.out.println("[MySQL][Execute]: " + commandText);

		statement.execute();
		statement.close();

		return this;
	}

	public DatabaseMethods executeNonQuery(String commandText) throws SQLException {
		return this.executeNonQuery(commandText, null);
	}

	public List<Map<String, Object>> executeQuery(String commandText, Object[] parameters) throws SQLException {
		if (commandText == null) throw new IllegalArgumentException("Command cannot be null!");
		if (commandText.trim().isEmpty()) throw new IllegalArgumentException("Command is empty or consists of white-spaces!");

		PreparedStatement statement = this.getConnection().prepareStatement(commandText);

		if (parameters != null && parameters.length > 0) {
			for (int i = 1; i <= parameters.length; i++) {
				statement.setObject(i, parameters[i - 1]);
			}
		}

		System.out.println("[MySQL][Execute]: " + commandText);

		ResultSet resultSet = statement.executeQuery();
		List<Map<String, Object>> list = toListMap(resultSet);

		resultSet.close();
		statement.close();

		return list;
	}

	public List<Map<String, Object>> executeQuery(String commandText) throws SQLException {
		return this.executeQuery(commandText, new Object[0]);
	}
	
	public DatabaseMethods executeQuery(String commandText, Object[] parameters, Holder<List<Map<String, Object>>> holder) throws SQLException {
		holder.setValue(executeQuery(commandText, parameters));

		return this;
	}
	
	public DatabaseMethods executeQuery(String commandText, Holder<List<Map<String, Object>>> holder) throws SQLException {
		return this.executeQuery(commandText, null, holder);
	}

	@SuppressWarnings("unchecked")
	public <T> T executeScalar(String commandText) throws SQLException {
		if (commandText == null) throw new IllegalArgumentException("Command cannot be null!");
		if (commandText.trim().isEmpty()) throw new IllegalArgumentException("Command is empty or consists of white-spaces!");

		System.out.println("[MySQL][Execute]: " + commandText);

		Statement statement = this.getConnection().createStatement();
		ResultSet resultSet = statement.executeQuery(commandText);
		Object obj = null;

		if (resultSet.first()) {
			resultSet.getObject(0);
		}

		resultSet.close();
		statement.close();

		return obj != null ? (T) obj : null;
	}

	public <T> DatabaseMethods executeScalar(String commandText, Holder<T> holder) throws SQLException {
		if (holder == null) throw new IllegalArgumentException("Holder cannot be null!");

		holder.setValue(this.executeScalar(commandText));

		return this;
	}

	public List<Map<String, Object>> toListMap(ResultSet resultSet) {
		try {
			if (!resultSet.isClosed()) {
				List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
				ResultSetMetaData metaData = resultSet.getMetaData();

				while (resultSet.next()) {
					Map<String, Object> row = new HashMap<String, Object>();

					for (int i = 1; i <= metaData.getColumnCount(); i++) {
						row.put(metaData.getColumnName(i), resultSet.getObject(i));
					}

					list.add(row);
				}

				return list;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}
}