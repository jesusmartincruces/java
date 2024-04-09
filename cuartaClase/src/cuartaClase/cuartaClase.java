package cuartaClase;

import java.util.Arrays;
import java.util.Scanner;

public class cuartaClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int arrNum[] = new int [20];
		arrNum[19] = 777;
		System.out.println(arrNum[arrNum.length-1]);
		*/
		Scanner sc = new Scanner(System.in);
		/*
		double notas [] = new double [10];
		double total=0.0;
		for(int i =0;i<notas.length;i++) {
			System.out.println("Escriba una nota");
			notas[i] = sc.nextDouble();
			total += notas[i];
			if(i == notas.length-1) {
				System.out.println("La media es " + (total/i));
				for(int x =0;x<notas.length;x++) {
					System.out.println(notas[x] + 1.0);
				}
			}
		}*/
		/*
		double total=0.0;
		System.out.println("Escriba el número de alumnos");
		int nAlum = sc.nextInt();
		double[] notas = new double[nAlum];
		double media = 0.0;
		for(int i =0;i<nAlum;i++) {
			System.out.println("Escriba una nota");
			notas[i] = sc.nextDouble();
			total += notas[i];
			if(i == nAlum-1) {
				media = total/nAlum;
				System.out.println("La media es " + media);
				for(int x =0;x<nAlum;x++) {
					if(notas[x] > media) {
						System.out.println("El alumno " + (x+1) + " ha sacado un " + notas[x] 
								+ " y es superior a la media");
					}
				}
			}
		}
		*/
		/*
		char[] vocales = {'a','e','i','o','u'};
		System.out.println(vocales);
		String str = new String(vocales);
		System.out.println(str);
		String text = "Ordenador";
		char[] palabra = text.toCharArray();
		System.out.println(palabra);
		*/
		String [] pal = new String[5];
		for(int i = 0;i<pal.length;i++) {
			System.out.println("Introduce una palabra");
			pal[i] = sc.nextLine();
			
		}
		for(int i =0;i<pal.length;i++) {
			if(pal[i].equalsIgnoreCase("Eclipse")) {
				pal[i] = pal[i].replace("Eclipse", "NetBeans");
			}
		}
		for(int i = 0;i<pal.length;i++) {
			System.out.println(pal[i]);
		}
		
	}
}
