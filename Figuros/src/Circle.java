public class Circle extends Figure2D implements Parameter{

    private double r;

    public Circle(double r) {
        if (r <= 0) {
            // rodyti klaida
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " radius must be higher than 0");
        }
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double parameter(double s) {
        return Math.sqrt(s/Math.PI);
    }
}
