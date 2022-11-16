package fuzz;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.CarDatabase;

import java.sql.SQLException;

public class CarQueryFuzzTest {

    @FuzzTest
    public void fuzzDataByModel(FuzzedDataProvider data) {
        CarDatabase fixture = new CarDatabase();

        try {
            fixture.connect();
            fixture.getDataByModel(data.consumeAsciiString(100));
        } catch (SQLException e){
            throw new AssertionError("SQL Connection exception:" + e);
        }

    }
}
