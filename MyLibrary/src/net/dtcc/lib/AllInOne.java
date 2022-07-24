package net.dtcc.lib;

/*
* Brandon Ma/Sarah Moninger
* CSC 253 Advanced Java
* AllInOne Library
*
*/

public class AllInOne {
	
	public double areaRectangle(double rectangleWidth, double rectangleHeight){
		return rectangleWidth * rectangleHeight;
	}
	
	public double areaSquare(double squareLength){
		return squareLength * squareLength;
	}
	
	public double areaTriangle(double triangleHeight, double triangleBase){
		return ((triangleHeight * triangleBase) / 2);
	}
	
	public double areaCircle(double radius){
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double areaTrapezoid(double firstBase, double secondBase, double trapezoidHeight){
		return ((firstBase + secondBase) / 2) * trapezoidHeight;
	}
	
	public double areaEllipse(double firstAxis, double secondAxis){
		return Math.PI * firstAxis * secondAxis;
	}
	
	public double areaPentagon(double pentagonSide){
		return ((5 * (Math.pow(pentagonSide, 2)) / (4 *(Math.sqrt(5-(2 *(Math.sqrt(5))))))));	
	}
	
	public double areaParallelogram(double parallelBase, double parallelHeight){
		return parallelBase * parallelHeight;
	}
	
	public double areaRhombus(double firstDiagonal, double secondDiagonal){
		return ((firstDiagonal * secondDiagonal) / 2);
	}
	
	public double areaHexagon(double hexagonSide){
		return (3 * (Math.sqrt(3)) / 2) * Math.pow(hexagonSide, 2);
	}
	
	public double areaPolygon(double numSides, double side) {
	    return (numSides * (side * side)) / (4 * (Math.tan((Math.PI / numSides))));
	}
	
	// Fractions:
	public double addTwoFractions(double aNom1, double aNom2, double aDenom1, double aDenom2){
		if(aDenom1 == aDenom2){
			return (aNom1 + aNom2) / aDenom1;
		} else {
			return (((aNom1 * aDenom2) + (aNom2 * aDenom1)) / (aDenom1 * aDenom2));
		}
	}
	
	public double subtractTwoFractions(double sNom1, double sNom2, double sDenom1, double sDenom2){
		if(sDenom1 == sDenom2){
			return (sNom1 - sNom2) / sDenom1;
		} else {
			return (((sNom1 * sDenom2) - (sNom2 * sDenom1)) / (sDenom1 * sDenom2));
		}
	}
	
	public double multiplyTwoFractions(double mNom1, double mNom2, double mDenom1, double mDenom2){
		return ((mNom1 * mNom2) / (mDenom1 * mDenom2));
	}
	
	public double divideTwoFractions(double dNom1, double dNom2, double dDenom1, double dDenom2){
		return ((dNom1 * dDenom2) / (dNom2 * dDenom1));
	}
	
	// Sarah's Method:
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
	
}
