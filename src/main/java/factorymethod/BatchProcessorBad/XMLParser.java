package factorymethod.BatchProcessorBad;

import java.io.File;
import java.util.List;

public class XMLParser extends TextParser {
    public XMLParser(File file) {
        System.out.println("Created xml parser");
    }

    @Override
    public List<Record> parse() {
        System.out.println("Parsing XML content");
        return null;
    }
}
