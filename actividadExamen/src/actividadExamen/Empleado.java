package actividadExamen;

public class Empleado {
	
	//Atributos
	private String nombre;
	private double sueldo;
	
	//Constructor
	public Empleado(String nombre,double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
		
	//Constructor de copia
	public Empleado(Empleado emp) {
		this.nombre = emp.nombre;
		this.sueldo = emp.sueldo;
	}

	//Gets y Sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return nombre + " que cobra " + sueldo + "€/mes ";
	}
		
		
		
		

}
