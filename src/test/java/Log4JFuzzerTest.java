import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4JFuzzerTest {

    private final static Logger log = LogManager.getLogger(Log4JFuzzerTest.class.getName());

    @FuzzTest
    public void log4jExample(FuzzedDataProvider data){
        log.error(data.consumeRemainingAsString());
    }
}
