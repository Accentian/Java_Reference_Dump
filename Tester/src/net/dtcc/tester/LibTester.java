
/*
* Brandon Ma/Sarah Moninger
* CSC 253 Advanced Java
* LibTester Tester
*
*/

package net.dtcc.tester;

import net.dtcc.lib.AllInOne;

public class LibTester {

	public static void main(String[] args) {
		AllInOne n = new AllInOne();
		
		System.out.println(n.areaRectangle(3, 4));
		System.out.println(n.areaSquare(4));
		System.out.println(n.areaTriangle(3, 8));
		System.out.println(n.areaCircle(4));
		System.out.println(n.areaTrapezoid(4, 6, 5));
		System.out.println(n.areaEllipse(3, 6));
		System.out.println(n.areaPentagon(9));
		System.out.println(n.areaParallelogram(4, 5));
		System.out.println(n.areaRhombus(4, 7));
		System.out.println(n.areaHexagon(5));
		System.out.println(n.areaPolygon(4, 10));
		System.out.println(n.addTwoFractions(1, 4, 2, 6));
		System.out.println(n.subtractTwoFractions(1, 4, 2, 6));
		System.out.println(n.multiplyTwoFractions(1, 4, 3, 4));
		System.out.println(n.divideTwoFractions(1, 4, 2, 4));
		
		// Sarah's Print Statements:
	    System.out.println(n.binaryToDecimal(101));
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
