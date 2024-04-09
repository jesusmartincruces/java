package clasesDerivadas;

public class Main {

	public static void main(String[] args) {
		Ave pajaro = new Ave(true);
		pajaro.comer();
		pajaro.ponerHuevos();
		
		Mamifero leon = new Mamifero("leon",40.0,true);
		leon.comer();
		
	}

}
