package lab9.task3;

public class Task3 {
    public static void main(String[] args) {
        StringProccessor proccessor = new StringProccessor(new StackReverser());
        proccessor.printResult(-511);
    }
}
