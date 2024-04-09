package clasesDerivadas;

public class Mamifero extends Animal {
	//Atributos
	private boolean esCarnivoro;
	
	//Constructores
	public Mamifero(String nombre,double peso,boolean esCarnivoro) {
		super();
		this.esCarnivoro = esCarnivoro;
		setPeso(peso);
	}
	
	@Override
	public void comer() {
		super.comer();
		System.out.println("He comido " + (esCarnivoro ? "carne" : "verdura"));
	}
}
