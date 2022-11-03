import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.Car;
import org.example.CarDataQuery;

import java.sql.SQLException;

public class CarQueryFuzzTest {

    @FuzzTest
    public void fuzzDataByModel(FuzzedDataProvider data) {
        CarDataQuery fixture = new CarDataQuery();

        try {
            fixture.connect();
            fixture.getDataByModel(data.consumeAsciiString(100));
        } catch (SQLException e){
            throw new AssertionError("SQL Connection exception:" + e);
        }

    }
}
