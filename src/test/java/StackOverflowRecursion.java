import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.DistanceCalculator;
import org.example.ExploreMe;

class StackOverflowRecursion {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        ExploreMe underTest = new ExploreMe();

        underTest.fibonacci(data.consumeInt());
    }
}
