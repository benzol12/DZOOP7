
public class Decorator implements iCalculable, iCompCalc {

    private Calculator oldCalculator;
    private Logger logger;
    private complexCalc complexCalc;
    public Decorator(Calculator oldCalculator, Logger logger, complexCalc complexCalc ) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
        this.complexCalc = complexCalc;
    }
    
    @Override
    public iCalculable sum(int arg) {
        int firstArg = oldCalculator.getResult();

        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, arg));
        iCalculable result = oldCalculator.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));

        return result;
    }
    @Override
    public iCalculable multi(int arg) {
        int firstArg = oldCalculator.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        iCalculable result = oldCalculator.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }
    @Override
    public int getResult() {
        int result = oldCalculator.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

    /* Ниже пркдставлены переопеределенные методы калькулятора комплексных чисел*/
    @Override
    public iCompCalc sum(double realArg, double imaginaryPart) {
        // TODO Auto-generated method stub
        double compResult = complexCalc.compResult();
        logger.log(String.format("Реальное значение калькулятора %d. Мнимое значение калькулятора %d. Начало вызова метода sum", realArg, imaginaryPart));
        iCompCalc result = complexCalc.sum(realArg, imaginaryPart);
        logger.log(String.format("Вызова метода sum комплексных чисел произошел"));
        return result;
    }

    @Override
    public iCompCalc subtract(double realArg, double imaginaryPart) {
        // TODO Auto-generated method stub
        double compResult = complexCalc.compResult();
        logger.log(String.format("Реальное значение калькулятора %d. Мнимое значение калькулятора %d. Начало вызова метода subtract", realArg, imaginaryPart));
        iCompCalc result = complexCalc.subtract(realArg, imaginaryPart);
        logger.log(String.format("Вызова метода sum комплексных чисел произошел"));
        return result;
    }

    @Override
    public iCompCalc multi(double realArg, double imaginaryPart) {
        // TODO Auto-generated method stub
        double compResult = complexCalc.compResult();
        logger.log(String.format("Реальное значение калькулятора %d. Мнимое значение калькулятора %d. Начало вызова метода multi", realArg, imaginaryPart));
        iCompCalc result = complexCalc.multi(realArg, imaginaryPart);
        logger.log(String.format("Вызова метода sum комплексных чисел произошел"));
        return result;
    }

    @Override
    public iCompCalc divide(double realArg, double imaginaryPart) {
        double compResult = complexCalc.compResult();
        logger.log(String.format("Реальное значение калькулятора %d. Мнимое значение калькулятора %d. Начало вызова метода divide", realArg, imaginaryPart));
        iCompCalc result = complexCalc.divide(realArg, imaginaryPart);
        logger.log(String.format("Вызова метода sum комплексных чисел произошел"));
        return result;
    }

    @Override
    public double compResult() {
        double compResult = complexCalc.compResult();
        logger.log(String.format("Получение результата %d", compResult));
        return compResult;
    }

    
    
}
