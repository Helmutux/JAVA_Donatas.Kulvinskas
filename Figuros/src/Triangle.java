public class Triangle extends Figure2D implements Parameter{
    private double a;

    public Triangle(double a) {
        if (a <= 0) {
            // rodyti klaida
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " parameter must be higher than 0");
        }
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return (a*a*Math.sqrt(3))/4;
    }

    @Override
    public double perimeter() {
        return 3*a;
    }
    @Override
    public double parameter(double s) {
        return 2*Math.sqrt(s)/Math.exp(Math.log(3)/4);
    }
}
