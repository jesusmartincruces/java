package quintaClase;

public class QuintaClase {
	
	public static String nombre = "María";
	
	public static void saludo() {
		System.out.println("Hola desde el método estático");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(QuintaClase.nombre);
		QuintaClase.saludo();
	}

}
