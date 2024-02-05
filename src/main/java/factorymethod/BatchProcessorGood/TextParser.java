package factorymethod.BatchProcessorGood;


import java.io.File;
import java.util.List;

public class TextParser implements Parser {
    public TextParser(File file) {
        System.out.println("Created text parser");
    }
    @Override
    public List<Record> parse() {
        System.out.println("Parsing text file");
        return null;
    }
}
