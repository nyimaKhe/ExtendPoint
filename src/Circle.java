
public class Circle extends Points{
	double radius;
	Circle(){
		
	}
	Circle(double r){
		radius = r;
	}
	Circle(int a, int b, double radius){
		super(a,b);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getArea() {
		
		return Math.PI*Math.pow(getRadius(), 2);
	}
	public double getDiameter() {
		return 2*radius;
	}
	public String toString() {
		return "center: ("+ super.getX() + super.getY() +")\n"+"radius:" +radius;
	}
}
