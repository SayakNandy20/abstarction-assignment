package appmainabs2;

import java.util.Scanner;
import java.lang.Math.*;

import parentandchild.Shape1;
import parentandchild.Sphere1;

public class appabs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		int radius=sc.nextInt();
		Sphere1 sphere=new Sphere1(radius);
		System.out.printf("Volume of sphere is %.1f",sphere.calculateVolume());

		

	}

}
