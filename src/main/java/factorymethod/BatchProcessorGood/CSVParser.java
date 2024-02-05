package factorymethod.BatchProcessorGood;

import java.io.File;
import java.util.List;

public class CSVParser implements Parser {
    public CSVParser(File file) {
        System.out.println("CSV parser created");
    }

    @Override
    public List<Record> parse() {
        System.out.println("Parsing CSV content");
        return null;
    }
}
