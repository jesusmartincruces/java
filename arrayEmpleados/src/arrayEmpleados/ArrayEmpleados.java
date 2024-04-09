package arrayEmpleados;

public class ArrayEmpleados {
	//Atributos
	private String nombre;
	private int edad;
	private double sueldo;
	
	//Constructor
	public ArrayEmpleados(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	//Gets y Sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "ArrayEmpleados [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	
	
}
