public class Circle {
 private double pie=3.14;
private double area=0;
private double parameter=0;

    public double calculateArea(double radius){
        area=pie*radius*radius;
        return area;
    }

    public double calculateParameter(double radius){
        parameter=2*pie*radius;
        return parameter;
    }
}
