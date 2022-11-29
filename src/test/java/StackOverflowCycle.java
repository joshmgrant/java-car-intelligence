import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.ExampleStackOverflow;

class StackOverflowCycle {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        ExampleStackOverflow underTest = new ExampleStackOverflow();

        underTest.fuzzerTestOneInput(data.consumeAsciiString(10));
    }
}
