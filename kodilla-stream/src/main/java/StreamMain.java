import lambda.ExecuteSaySomething;
import lambda.Processor;
import lambda.SaySomething;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
    }
}
