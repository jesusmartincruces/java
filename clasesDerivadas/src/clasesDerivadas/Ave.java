package clasesDerivadas;

import java.util.Random;

public class Ave extends Animal {
	//Atributos
	private boolean puedeVolar;
	
	//Constructor
	public Ave(boolean puedeVolar) {
		this.puedeVolar = puedeVolar;
	}
	
	public Ave(String nombre,double peso,boolean puedeVolar) {
		super();
		this.puedeVolar = puedeVolar;
	}

	//gets
	public boolean getPuedeVolar() {
		return puedeVolar;
	}
	
	//metodo
	public void ponerHuevos() {
		int numHuevos = new Random().nextInt(1,7);
		setPeso(getPeso() - numHuevos * 0.05);
		System.out.printf("He puesto %d huevos y ahora peso %.2f kilos \n",numHuevos,getPeso());
		
	}
	
	@Override
	public void comer() {
		double pesoInicio = new Random().nextDouble();
		setPeso(getPeso() + pesoInicio * 1.005);
		System.out.printf("Pio pio, yo he comido. Ahora peso %.2f kilos\n",getPeso());
	}
}
