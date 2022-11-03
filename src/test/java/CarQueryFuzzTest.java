import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.CarDataQuery;

import java.sql.SQLException;

class CarQueryFuzzTest {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        CarDataQuery fixture = new CarDataQuery();

        try {
            fixture.connect();
            fixture.getUserByUsername(data.consumeString(100));
        } catch (SQLException e){
            throw new AssertionError("SQL Connection exception:" + e);
        }

    }
}
