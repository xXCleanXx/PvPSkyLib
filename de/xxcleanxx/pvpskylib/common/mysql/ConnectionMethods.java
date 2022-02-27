<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.mysql;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnegative;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMethods {
	private MySQLCredentials _credentials;
	private Connection _connection;

	@NotNull
	public MySQLCredentials getCredentials() {
		return this._credentials;
	}

	@NotNull
	public Connection getConnection() {
		return this._connection;
	}
	
	private void setConnection(@NotNull Connection connection) {
		this._connection = connection;
	}
	
	private void setCredentials(@NotNull MySQLCredentials credentials) {
		this._credentials = credentials;
		
		try {
			this.setConnection(DriverManager.getConnection(this.getCredentials().getConnectionString()));
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public DatabaseMethods WithCredentials(@NotNull MySQLCredentials credentials) {
		this.setCredentials(credentials);
		
		return new DatabaseMethods(this.getConnection());
	}
	
	public DatabaseMethods WithCredentials(@Nullable String username, @Nullable String password, @NotNull String domain, @Nonnegative int port, @Nullable String database) {
		return this.WithCredentials(new MySQLCredentials(username, password, domain, database, port));
	}
	
	public DatabaseMethods WithCredentials(@Nullable String username, @Nullable String password, @NotNull String domain, @Nullable String database) {
		return this.WithCredentials(username, password, domain, 25565, database);
	}
	
	public DatabaseMethods WithCredentials(@Nullable String username, @Nullable String password, @NotNull String domain) {
		return this.WithCredentials(username, password, domain, "");
	}
=======
package de.xxcleanxx.pvpskylib.common.mysql;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnegative;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMethods {
	private MySQLCredentials _credentials;
	private Connection _connection;

	@NotNull
	public MySQLCredentials getCredentials() {
		return this._credentials;
	}

	@NotNull
	public Connection getConnection() {
		return this._connection;
	}
	
	private void setConnection(@NotNull Connection connection) {
		this._connection = connection;
	}
	
	private void setCredentials(@NotNull MySQLCredentials credentials) {
		this._credentials = credentials;
		
		try {
			this.setConnection(DriverManager.getConnection(this.getCredentials().getConnectionString()));
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public DatabaseMethods WithCredentials(@NotNull MySQLCredentials credentials) {
		this.setCredentials(credentials);
		
		return new DatabaseMethods(this.getConnection());
	}
	
	public DatabaseMethods WithCredentials(@Nullable String username, @Nullable String password, @NotNull String domain, @Nonnegative int port, @Nullable String database) {
		return this.WithCredentials(new MySQLCredentials(username, password, domain, database, port));
	}
	
	public DatabaseMethods WithCredentials(@Nullable String username, @Nullable String password, @NotNull String domain, @Nullable String database) {
		return this.WithCredentials(username, password, domain, 25565, database);
	}
	
	public DatabaseMethods WithCredentials(@Nullable String username, @Nullable String password, @NotNull String domain) {
		return this.WithCredentials(username, password, domain, "");
	}
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}