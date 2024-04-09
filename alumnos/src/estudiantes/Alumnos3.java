package estudiantes;

public class Alumnos3 {
	public int expediente;
	public String nombre;
	public String dni;
	public String direccion;
	public int telefono;
	public static int numAlum;
	
	public Alumnos3(int ex,String nom,String dni,String dir,int tel) {
			this.expediente = ex;
			this.nombre = nom;
			this.dni = dni;
			this.direccion = dir;
			this.telefono = tel;
			numAlum++;
		}
	
	public void imprimirDatos() {
		System.out.println("El número de expediente es " + expediente);
		System.out.println("El nombre del alumno es " + nombre);
		System.out.println("El dni del alumno es " + dni);
		System.out.println("La dirección del alumno es " + direccion);
		System.out.println("El número de telefono es " + telefono);
	}
	
	public void direccionAlumno() {
		System.out.println("La dirección del alumno es " + direccion);
	}
	
	public static void incrementarNumAlum() {
		numAlum++;
	}
}
