package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.h2.jdbcx.JdbcDataSource;

import javax.xml.transform.Result;


public class CarDataQuery {
    private Connection conn;

    public void connect() throws SQLException {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:database.db");
        conn = ds.getConnection();

        // A dummy database is dynamically created
        conn.createStatement().execute("CREATE TABLE IF NOT EXISTS cars (id IDENTITY PRIMARY KEY, carModel VARCHAR(50), manufacturer VARCHAR(50), carYear VARCHAR(50))");
        conn.createStatement().execute("INSERT INTO cars (carModel, manufacturer, carYear) VALUES ('Jetta', 'Volkwagen', '2020')");
        conn.createStatement().execute("INSERT INTO cars (carModel, manufacturer, carYear) VALUES ('i8', ' BMW', '2018')");
    }

    public ResultSet insertNewCar(Car car) throws SQLException {
        String query = String.format("INSERT INTO cars (carModel, manufacturer, carYear) VALUES (%s, %s, %s)", car.getModel(), car.getManufacturer(), car.getYear().toString());
        return conn.createStatement().executeQuery(query);
    }

    public ResultSet getDataByModel(String username) throws SQLException {
        if (username.isEmpty()) {
            return null;
        }

        // Using String.format instead of passing parameters through a PreparedStatement
        // will lead to a SQL injection
        String query = String.format("SELECT * FROM cars WHERE carModel='%s'", username);
        return conn.createStatement().executeQuery(query);
    }

    public String getVolkwagenData(String message) throws SQLException {
        ResultSet temp;
        String query = "SELECT * FROM cars where carModel = 'Volkwagen'";
        temp = conn.createStatement().executeQuery(query);
        return String.format("VW Results - %s: %s ", temp.toString(), message);
    }
}