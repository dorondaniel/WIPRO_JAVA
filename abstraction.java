abstract class Areas{
    double dim1;
    double dim2;
    Areas(double x, double y){
        dim1 = x;
        dim2 = y;
    }
    abstract double calc_area();
}

class Rectangle extends Areas{
    Rectangle(double x, double y){
        super(x,y);
    }
    double calc_area(){
        System.out.println("Area of Rectangle: ");
        return dim1 * dim2;
    }
}
class FindArea{
    public static void main(String[] args) {
        Areas ar;
        Rectangle r = new Rectangle(9.43,8.32);
        ar = r;
        System.out.println(ar.calc_area());
    }
}
