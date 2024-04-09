package terceraClase;

import java.util.Scanner;

public class matematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		/*
		double num1 = 2.5;
		double num2 = 1.5;
		System.out.println(Math.ceil(num1));
		System.out.println(Math.floor(num2));
		System.out.println(Math.pow(num1,num2));
		System.out.println(Math.max(num1,num2));
		System.out.println(Math.sqrt(num1));
		*/
		System.out.println("Dime la longitud del primer cateto");
		double cateto1 = src.nextDouble();
		System.out.println("Dime la longitud del primer cateto");
		double cateto2 = src.nextDouble();
		//double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println("La longitud de la hipotenusa es " + Math.hypot(cateto1, cateto2));

	}

}
