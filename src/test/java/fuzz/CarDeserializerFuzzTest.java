package fuzz;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.example.CarDeserializer;

import java.io.ByteArrayInputStream;
import java.io.IOException;

class CarDeserializerFuzzTest {
    @FuzzTest
    void serializerTest(FuzzedDataProvider data) throws IOException {
        CarDeserializer fixture = new CarDeserializer();

        ByteArrayInputStream stream = new ByteArrayInputStream(data.consumeBytes(100));
        fixture.deserialize(stream);
    }
}
