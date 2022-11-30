import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.NameLookup;

class StackOverflowCycleSimple {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        NameLookup underTest = new NameLookup();

        underTest.getName(data.consumeInt());
    }
}
