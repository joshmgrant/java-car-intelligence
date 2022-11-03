import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.NumberStringConverter;

class NumberConverterFuzzTest {

    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
       Double input = data.consumeDouble();

       String output = NumberStringConverter.doubleToString(input);
    }
}
