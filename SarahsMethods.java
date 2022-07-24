public class SarahsMethods {
	
	public int binaryToDecimal(int binary) {
		int total = 0;
		int index = 7;
		int a[] = new int[8];
		
		while (binary > 0) {
			a[index] = binary % 10;
			binary = binary / 10;
			index -= 1;
		}
		for (int i = 0; i < a.length; i++) {
			total = (2*total) + a[i];
		}	
		return total;
	}
	
	public double celcuisToFahrenheit(double temp) {
		return (temp * 1.8) + 32;
	}
	
	public double celciusToKelvin(double temp) {
		return temp + 273.15;	
	}
	
	public double fahrenheitToCelcius(double temp) {
		return (temp - 32) * .5555555555555556;	
	}
	
	public double fahrenheitToKelvin(double temp) {
		return (temp + 459.67) * .5555555555555556;	
	}
	
	public double volumeOfCube(int edge) {
		return Math.pow(edge, 3);
	}
	
	public int volumeOfBox(int width, int length, int height) {
		return width * length * height;		
	}
	
	public double volumeOfCylinder(int radius, int height) {
		return (Math.PI * Math.pow(radius, 2) * height);
	}

	public double volumeOfCone(int radius, int height) {
		return Math.PI * Math.pow(radius, 2) * (height / 3);
	}
	
	public double volumeOfSphere(int radius) {
		return (1.33333333333) * Math.PI * Math.pow(radius, 3);
	}
	
	public int perimeterOfSquare(int side) {
		return side * 4;
	}
	
	public int perimeterOfRectangle(int length, int width) {
		return 2 * (length + width);
	}
	
	public double circumferenceOfCircle(int radius) {
		return 2 * (Math.PI * radius);
	}

	public double pythagorasTheorem(int side1, int side2) {
		return Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side2, 2)));
	}
	
public static void main(String args[]) {
	
	SarahsMethods n = new SarahsMethods();
        System.out.println(n.binaryToDecimal(1011));
	System.out.println(n.celcuisToFahrenheit(45));
	System.out.println(n.celciusToKelvin(88));
	System.out.println(n.fahrenheitToCelcius(-32));
	System.out.println(n.fahrenheitToKelvin(5));
	System.out.println(n.volumeOfCube(90));
	System.out.println(n.volumeOfBox(34, 6, 77));
	System.out.println(n.volumeOfCylinder(35, 77));
	System.out.println(n.volumeOfCone(56, 99));
	System.out.println(n.volumeOfSphere(3));
	System.out.println(n.perimeterOfSquare(25));
	System.out.println(n.perimeterOfRectangle(77, 45));
	System.out.println(n.circumferenceOfCircle(332));
	System.out.println(n.pythagorasTheorem(99, 234));
}
}
