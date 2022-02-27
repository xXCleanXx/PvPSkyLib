package de.xxcleanxx.pvpskylib.common.mysql;

import java.sql.SQLException;

public class MySQL {
	private ConnectionMethods _connectionMethods;

	public MySQL() {

	}

	public ConnectionMethods getConnectionMethods() {
		return this._connectionMethods;
	}

	private void setConnectionMethods(ConnectionMethods connectionMethods) {
		this._connectionMethods = connectionMethods;
	}

	public ConnectionMethods Connect() {
		this.setConnectionMethods(new ConnectionMethods());

		return this.getConnectionMethods();
	}

	public void close() {
		try {
			if (!this.getConnectionMethods().getConnection().isClosed()) this.getConnectionMethods().getConnection().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}