package factorymethod.BatchProcessorGood;

public class RefactoredApp {
    public static void main(String[] args) {
        BatchProcessor processor = createBatchProcessor(args[1]);
        if(processor != null) processor.processBatch(args[0]);
        else System.out.println("Invalid parser");
    }

    private static BatchProcessor createBatchProcessor(String type) {
        // here is our separated code, which is decoupled from processor logic.
        // any new requirement can be added independently inside the app which is given to the client.
        if (type.equals("text")) return new TextBatchProcessor();
        else if(type.equals("xml")) return new XMLBatchProcessor();
        else if(type.equals("csv")) return new CSVBatchProcessor();
        return null;
    }
}
