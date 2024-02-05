package factorymethod.BatchProcessorBad;

public class BadApp {
    public static void main(String[] args) {
        BatchProcessorBad processor = new BatchProcessorBad();
        processor.processBatch(args[0], args[1]);
    }
}
