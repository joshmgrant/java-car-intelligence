import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.BookDeserializer;

import java.io.ByteArrayInputStream;
import java.io.IOException;

class BookDeserializerFuzzTest {
    @FuzzTest
    void serializerTest(FuzzedDataProvider data) throws IOException {
        BookDeserializer fixture = new BookDeserializer();

        ByteArrayInputStream stream = new ByteArrayInputStream(data.consumeBytes(100));
        fixture.deserialize(stream);
    }
}
