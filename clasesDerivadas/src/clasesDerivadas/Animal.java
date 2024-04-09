package clasesDerivadas;

import java.util.Random;

public class Animal {
	//Atributos
	private double peso;
	private String nombre;
	
	//Constructor
	public Animal() {
		this.peso = 1;
		this.nombre = "Animal desconocido";
	}

	//Gets y sets
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}
	
	//metodo
	public void comer() {
		peso += new Random().nextDouble()*0.5;
		System.out.printf("Ñam ñam. Ahora peso %.2f kilos\n",peso);
	}
	
	
}
