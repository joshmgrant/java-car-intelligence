import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.ExploreMe;

class ExploreMeFuzzed {
    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
       int a = data.consumeInt();
       int b = data.consumeInt();
       String c = data.consumeString(100);

       ExploreMe temp = new ExploreMe();

       temp.exploreMe(a, b, c);
    }
}
