import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.Car;
import org.example.CarDataQuery;

import java.sql.SQLException;

public class CarInsertDataFuzzTest {

    @FuzzTest
    public void fuzzInsertData(FuzzedDataProvider data) {
        CarDataQuery testDB = new CarDataQuery();
        Car testCar = new Car(data.consumeString(100), data.consumeString(100), data.consumeInt());

        try {
            testDB.connect();
            testDB.insertNewCar(testCar);
        } catch (SQLException e){
            throw new AssertionError("SQL Connection exception:" + e);
        }

    }
}
