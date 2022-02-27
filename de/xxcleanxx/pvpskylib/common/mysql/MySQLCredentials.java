package de.xxcleanxx.pvpskylib.common.mysql;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnegative;

public class MySQLCredentials {
    private String _user;
    private String _password;
    private String _host;
    private String _database;
    private int _port;

    public MySQLCredentials(@Nullable String user, @Nullable String password, @NotNull String host, @Nullable String database, @Nonnegative int port) {
        this.setUser(user);
        this.setPassword(password);
        this.setHost(host);
        this.setPort(port);
        this.setDatabase(database);
    }

    public MySQLCredentials(@Nullable String user, @Nullable String password, @NotNull String host, @Nullable String database) {
        this(user, password, host, database, 25565);
    }

    public MySQLCredentials(@Nullable String user, @Nullable String password, @NotNull String host, @Nonnegative int port) {
        this(user, password, host, null, port);
    }

    public MySQLCredentials(@Nullable String user, @Nullable String password, @NotNull String host) {
        this(user, password, host, null, 25565);
    }

    @Nullable
    public String getUser() {
        return this._user;
    }

    public void setUser(@Nullable String user) {
        this._user = user;
    }

    @Nullable
    public String getPassword() {
        return this._password;
    }

    public void setPassword(@Nullable String password) {
        this._password = password;
    }

    @NotNull
    public String getHost() {
        return this._host;
    }

    public void setHost(@NotNull String host) {
        this._host = host;
    }

    @Nullable
    public String getDatabase() {
        return this._database;
    }

    public void setDatabase(@Nullable String database) {
        this._database = database;
    }

    public int getPort() {
        return this._port;
    }

    public void setPort(@Nonnegative int port) {
        this._port = port;
    }

    @NotNull
    public String getConnectionString() {
        return "jdbc:mysql://" + this.getHost() + ":" + this.getPort() + "?autoReconnect=false&allowMultiQueries=true";
    }
}