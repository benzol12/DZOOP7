
/*Интерфейс содержит в себе методы калькутятора*/
public interface iCompCalc {
    iCompCalc sum(double realArg, double imaginaryPart);
    iCompCalc subtract(double realArg, double imaginaryPart);
    iCompCalc multi(double realArg, double imaginaryPart);
    iCompCalc divide(double realArg, double imaginaryPart);
    double compResult();

}
