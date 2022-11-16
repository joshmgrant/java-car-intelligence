package fuzz;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.Car;
import org.example.CarDatabase;

import java.sql.SQLException;

public class CarInsertDataFuzzTest {

    @FuzzTest
    public void fuzzInsertData(FuzzedDataProvider data) throws SQLException {
        CarDatabase testDB = new CarDatabase();
        Car testCar = new Car(data.consumeString(100), data.consumeString(100), data.consumeInt());

        testDB.connect();
        testDB.insertNewCar(testCar);

    }
}
