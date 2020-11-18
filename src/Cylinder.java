
public class Cylinder extends Circle{
	double height;
	Cylinder(){
		
	}
	Cylinder(double h){
		height = h;
	}

	Cylinder(double h, double r, int a, int b){
		super(a,b,r);
		height = h;
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double h) {
		height = h;
	}
	public double getVolume() {
		return getArea() *height;
	}
	
}
