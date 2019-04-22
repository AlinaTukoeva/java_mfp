package ru.stqa.mfp.sandbox;

public class MFP {
	public static void main(String[] args){
		hello("world");
		double l = 5;
		double a = 4;
		double b = 6;
		System.out.println(area2(a, b));
		System.out.println(area(l));
	}

	public static void hello(String s) {
		System.out.println("Hello, " + s);
	}

	public static double area (double l){
		return l * l;
	}

	public static double area2 (double a, double b){
		return a * b;
	}
}