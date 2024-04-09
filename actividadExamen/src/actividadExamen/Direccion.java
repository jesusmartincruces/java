package actividadExamen;

public class Direccion {
	
	//Atributos
	private String nombreCalle;
	private int numeroCalle;
	
	//Constructor
	public Direccion(String nombreCalle,int numeroCalle) {
		this.nombreCalle = nombreCalle;
		this.numeroCalle = numeroCalle;
	}
	
	//Constructor de copia
	public Direccion(Direccion dir) {
		this.nombreCalle = dir.nombreCalle;
		this.numeroCalle = dir.numeroCalle;
	}

	//Gets y Sets
	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public int getNumeroCalle() {
		return numeroCalle;
	}

	public void setNumeroCalle(int numeroCalle) {
		this.numeroCalle = numeroCalle;
	}

	@Override
	public String toString() {
		return nombreCalle + " nº" + numeroCalle + "";
	}
	
	
	
}
