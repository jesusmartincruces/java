package getAndSet2;

public class Car {
	//Atributos
	private String marca;
	private String modelo;
	private double cilindrada;
	private int potencia;
	
	//Constructor
	public Car(String marca,String modelo,double cilindrada,int potencia){
		this.marca = marca.toLowerCase();
		this.modelo = modelo.toLowerCase();
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}
	public Car() {
		
	}
	
	//Get y Set
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca.toLowerCase();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo.toLowerCase();
	}
	
	public double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	//Metodo
	public void mostrarDatos() {
		System.out.println("La marca es " + this.marca);
		System.out.println("El modelo es " + this.modelo);
		System.out.println("La cilindrada es " + this.cilindrada);
		System.out.println("La potencia es " + this.potencia);
	}
}
