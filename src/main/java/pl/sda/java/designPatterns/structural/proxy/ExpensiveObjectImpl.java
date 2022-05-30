package pl.sda.java.designPatterns.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    private static int counter;

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
        counter++;
    }

    @Override
    public String process() {
        return "processing";
    }

    public static int getCounter() {
        return counter;
    }

    private void heavyInitialConfiguration(){
        System.out.println("loading configuration");
    }
}
