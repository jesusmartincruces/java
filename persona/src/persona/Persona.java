package persona;

public class Persona {
	//Atributos
	private String dni;
	private String nombre;
	private int edad;
	
	//Constructores
	public Persona(String dni,String nombre,int edad){
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(Persona persona) {
		this.dni = persona.dni;
		this.nombre = persona.nombre;
		this.edad = persona.edad;
	}

	//Gets y Sets
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

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
	
	//metodo
	public void mismoDni(Persona[]persona,Persona person) {
		
		for(int i = 0;i < persona.length;i++) {
			if(persona[i].dni == person.dni ) {
				System.out.printf("Persona encontrada en la posición " + (i+1) + "\n" + persona[i]);
			}
		}
		
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
}
