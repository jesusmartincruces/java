package alumno01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Alumno[] alumno = {new Alumno("",0,0,""),new Alumno("",0,0,""),new Alumno("",0,0,"")};
		for(int i = 0;i < alumno.length;i++) {
			System.out.println("Introduca el nombre del alumno " + (i+1));
			alumno[i].setNombre(sc.nextLine());
			System.out.println("Introduca la matricula del alumno " + (i+1));
			alumno[i].setMatricula(sc.nextInt());
			System.out.println("Introduca el grupo del alumno " + (i+1));
			alumno[i].setGrupo(sc.nextInt());
			System.out.println("Introduca la clase del alumno " + (i+1));
			sc.nextLine();
			alumno[i].setClase(sc.nextLine());
		}
		for(int i = 0;i < alumno.length;i++) {
			System.out.println("\n" + alumno[i] + "\n");
		}
	}

}
