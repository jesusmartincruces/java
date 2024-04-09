package alumno01;

public class Alumno {
	//Atributos
	private String nombre;
	private int matricula;
	private int grupo;
	private String clase;
	
	//Constructor
	public Alumno(String nombre,int matricula,int grupo,String clase) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.grupo = grupo;
		this.clase = clase;
	}

	//Get y Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	

	@Override
	public String toString() {
		return "El alumno se llama " + nombre + ", su matricula es " + matricula + " y es de la clase " 
				+ grupo + "" + clase;
	}
	
	
	
}
