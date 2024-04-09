package getAndSet;

public class Person {
	//Atributos
	private String name;
	
	//Constructor
	public Person(String name) {
		this.name = name;
	}
	
	//Getters y Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Métodos
	public void sayHello(){
		System.out.println("Hola soy " + this.name);
	}
}
