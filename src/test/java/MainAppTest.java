import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.MainApp;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainAppTest {

    @Test
    public void happyPathTest() {
        MainApp app = new MainApp();

        String expected = "id:12345abc";
        String actual = app.retrieveSystemRequest(123);

        Assert.assertEquals(expected, actual);
    }

    @FuzzTest
    public void fuzzTest(FuzzedDataProvider data){
        MainApp app = new MainApp();

        String expected = "id:12345abc";
        String actual = app.retrieveSystemRequest(data.consumeInt());

        Assert.assertEquals(expected, actual);
    }

}