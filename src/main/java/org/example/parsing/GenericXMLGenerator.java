package org.example.parsing;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.JsonParserDelegate;

import java.io.File;
import java.io.IOException;

public class GenericXMLGenerator {

   JsonParser jsonParser;
   JsonGenerator jsonGenerator;
   File jsonIn = new File("fuzz.json");

    public void readXML() throws IOException {
        jsonParser = new JsonFactory().createParser(jsonIn);
    }

    public void writeXML() throws IOException {
        jsonGenerator.writeString(jsonParser.toString());
    }

}
