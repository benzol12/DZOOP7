public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        iCalculable calcOld = new Calculator(0);
        /*Добавлен complexCalc*/
        iCalculable decorator = new Decorator(new Calculator(0), new Logger(), new complexCalc(0, 0, 0));
        ViewCalculator view = new ViewCalculator(decorator);
        view.run();

    }
}
