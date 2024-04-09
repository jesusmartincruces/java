package alumnos;

import estudiantes.Alumnos3;

public class Alumnos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumnos3 alumno1 = new Alumnos3(1234567,"Juan","12345678K","Calle Nueva 2, Málaga",463758845);
		//Alumnos3.incrementarNumAlum();
		alumno1.imprimirDatos();
		System.out.println("La cantidad de alumnos: " + Alumnos3.numAlum);
		
		Alumnos3 alumno2 = new Alumnos3(4682684,"Pepe","54123468L","Calle Cuarteles 7, Málaga",684256387);
		//Alumnos3.incrementarNumAlum();
		alumno2.imprimirDatos();
		System.out.println("La cantidad de alumnos: " + Alumnos3.numAlum);
		
		Alumnos3 alumno3 = new Alumnos3(5864132,"Carmen","86524831T","Avenida Ortega y Gasset 48, Málaga",952768412);
		//Alumnos3.incrementarNumAlum();
		alumno3.imprimirDatos();
		System.out.println("La cantidad de alumnos: " + Alumnos3.numAlum);
	}

}
