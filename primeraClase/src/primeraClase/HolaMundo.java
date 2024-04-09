package primeraClase;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** 
		 * Aplicación que imprime un saludo generico
		 * @author profesor
		 * @variable texto*/
		//int result = 12;
		int num1 = 9;
		int num2 = 8;
		float media =(num1 + num2)/2.0f;
		double num3 = 3.1415926;
		double num4 = 1.25036;
		int num5 = 10;
		double num6 = 123.4567;
		double num7 = 50.2342354;
		//System.out.printf("El numero es %2d", num1);
		//System.out.println("Mi primer número entero es  " + result);
		//System.out.printf("El número es %d", result);
		System.out.printf("El promedio de %d y %d es %01.2f %n", num1, num2, media);
		System.out.printf("El numero %6.3f %n", num3);
		System.out.printf("%.2f %n", num4);
		System.out.printf("%.3f %n", num4);
		System.out.printf("%+d %n", num5);
		System.out.printf("num4 = %2$d num5 = %1$.2f %n", num4, num5);
		System.out.printf("El cuadrado de %.2f es %.2f\n", num6, num6*num6);
		System.out.printf("La división de %.2f por si mismo es es %.2f\n", num6, num6/num6);
		System.out.printf("%010.3f %n", num7);
		System.out.printf("%2$s %1$s %n", "HOLA", "ADIÓS");
	}

}
