package factorymethod.BatchProcessorGood;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
    public void processBatch(String fileName) {
        File file = openFile(fileName);
        Parser parser = createParser(file); // abstracted out the creation code, and let the subclasses decide which one to use.
        List<Record> records = parser.parse();
        processRecords(records);
        writeSummary();
        closeFile(file);
    }
    public abstract Parser createParser(File file);

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
