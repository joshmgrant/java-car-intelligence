import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.CarDatabase;

import java.sql.SQLException;

class CarVWQueryFuzzTest {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        CarDatabase fixture = new CarDatabase();

        try {
            fixture.connect();
            fixture.getVolkwagenData("test message");
        } catch (SQLException e){
            throw new AssertionError("SQL Connection exception:" + e);
        }
    }
}
