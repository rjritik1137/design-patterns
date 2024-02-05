package factorymethod.BatchProcessorBad;

import java.io.File;
import java.util.List;

public class BatchProcessorBad {
    public void processBatch(String fileName, String type) {
        File file = openFile(fileName);
        TextParser parser = new TextParser(file);

        // this is the creation code which can mess up many thing that different clients are expecting. It's not closed for modification.
        // it also doesn't depend on abstraction but depending on concrete classes.
        if (type.equals("text")) {
            parser = new TextParser(file);
        }else if(type.equals("xml")) {
            parser = new XMLParser(file);
        }else if(type.equals("csv")) {
            parser = new CSVParser(file);
        }


        List<Record> records = parser.parse();
        processRecords(records);
        writeSummary();
        closeFile(file);
    }

    private void processRecords(List<Record> records) {
        System.out.println("Processing the records");
    }


    private void writeSummary() {
        System.out.println("Writing the summary");
    }

    private void closeFile(File file) {
        System.out.println("Closing the file");
    }

    private File openFile(String fileName) {
        System.out.println("Opening file... " + fileName);
        return null;
    }
}
