import java.util.*;

class Circle{

	double radiusInMm; // radius declaration

	Circle(double radiusInMm){
		this.radiusInMm = radiusInMm; // creation of constructor for radius value initialisation
	}

	double Circumference(){
		return  2 * radiusInMm * Math.PI; // method for calculating cit=rcumference value
	}

	double getArea(){
		return Math.PI * Math.pow(radiusInMm , 2); // method for calculatimg area
	}

	public String toString() {
		return "Circle values: Radius(mm): " + radiusInMm + " , Circumference(mm): " + Circumference() + ", Area(mm): " + getArea();
	} // used toString to print everything



	public static void main(String[] args){
		Scanner input = new Scanner(System.in);// scanner for taking input
		System.out.println("Enter your radius: ");
		double radius = input.nextDouble();//user input of radius
		Circle circle = new Circle(radius);// object creatin  of the class Circle
		System.out.println(circle);// for printing output
	}
}
