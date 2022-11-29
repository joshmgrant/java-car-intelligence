import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.ExampleStackOverflow;

class StackOverflowRecursion {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        ExampleStackOverflow underTest = new ExampleStackOverflow();

        underTest.fibonacci(data.consumeInt());
    }
}
