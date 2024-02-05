package factorymethod.BatchProcessorBad;

import java.io.File;
import java.util.List;

public class TextParser {
    public TextParser() {}
    public TextParser(File file) {
        System.out.println("Created text parser");
    }
    public List<Record> parse() {
        System.out.println("Parsing text file");
        return null;
    }
}
