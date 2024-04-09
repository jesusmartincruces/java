package pruebaa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pruebaa prueba1 = new Pruebaa();
		Pruebaa prueba2 = new Pruebaa("hola",45);
		Pruebaa prueba3 = new Pruebaa(prueba2);
		
		System.out.println(prueba2);
		System.out.println("Constructor de copia: ");
		System.out.println(prueba3);
		
		
		int[] array = {
				1,2,3
		};
		
		try {
			int valor = array[3];
			System.out.println("El valor en la posición 3 es " + valor);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Hay un error, esa posición no existe en el array");
		}
		
		try {
			System.out.println(3/0);
		}catch(ArithmeticException ex) {
			System.out.println("No se puede dividir entre 0");
		}
	}

}
