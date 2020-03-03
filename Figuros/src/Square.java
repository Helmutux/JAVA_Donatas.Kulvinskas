public class Square extends Rectangular implements Parameter{

    public Square(double width) {
        super(width, width);
    }

    @Override
    public double parameter(double s) {
        return Math.sqrt(s);
    }

//    public double belenkas() {
//        return 4.56789;
//    }
}
