
/*Класс калькулятора с имплементированным интерфейсом iCompcalc*/
public class complexCalc implements iCompCalc{

    private double primaryArg;
    private double imagArg;
    private double realArg;


    public complexCalc(double realArg, double imagArg, double primaryArg) {
        this.realArg = realArg;
        this.imagArg = imagArg;
        this.primaryArg = primaryArg;
    }

    @Override
    public iCompCalc sum(double realArg, double imagArg) {
        double primaryArg = (this.realArg + realArg) + (this.imagArg + imagArg);
        return this;
    }

    @Override
    public iCompCalc subtract(double realArg, double imaginaryPart) {
        double primaryArg = (this.realArg + realArg) - (this.imagArg + imagArg);
        return this;
    }

    @Override
    public iCompCalc multi(double realArg, double imaginaryPart) {
        double primaryArg = (this.realArg * realArg) - (this.imagArg * imagArg);
        return this;
    }

    @Override
    public iCompCalc divide(double realArg, double imaginaryPart) {
            double primaryArg = (this.realArg + realArg) / (this.imagArg + imagArg);
            return this;
    }

    @Override
    public double compResult() {
    return primaryArg;
    }


}
