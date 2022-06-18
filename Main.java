class circ{
	private int radius;

	/**
	 * @param radius
	 */
	public circ(int radius) {
		super();
		this.radius = radius;
	} 
	public void circleArea() {
		double area = ((22/7)* this.radius*this.radius);
		System.out.println("area of the circle is " + area);
	}
}
class rect{
private int length;
private int width;
/**
 * @param length
 * @param width
 */
public rect(int length, int width) {
	super();
	this.length = length;
	this.width = width;
}
public void CalArea() {
	double ar = (this.length*this.width);
	System.out.println("Area of this rectangle is : " + ar);
}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		rect reg1 = new rect(5,6);
		reg1.CalArea();
		
		circ cir= new circ(8);
		cir.circleArea();
		System.out.println(" ");
		System.out.println(" new record for another circle & rectangle ");
		System.out.println(" ");
		
		circ cir2= new circ(9);
		cir2.circleArea();
		
		rect reg2 = new rect(7,6);
		reg2.CalArea();
	}

}
