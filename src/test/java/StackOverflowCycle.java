import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.DistanceCalculator;

class StackOverflowCycle {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        DistanceCalculator underTest = new DistanceCalculator("401");

        underTest.getRoadDistanceByLookup(data.consumeInt());
    }
}
