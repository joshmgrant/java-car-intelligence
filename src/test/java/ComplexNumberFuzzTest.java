import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.ComplexNumber;

class ComplexNumberFuzzTest {

    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
       Double fuzzedReal = data.consumeDouble();
       Double fuzzedImaginary = data.consumeDouble();

        ComplexNumber fuzzyNumber = new ComplexNumber(fuzzedReal, fuzzedImaginary);
    }
}
