package persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] persona = {
		new Persona("79845621J","Manu",32),
		new Persona("98985651X","Mari",26),
		new Persona("78445617P","Jose",34),
		new Persona("48556762H","Leo",21),
		};
		
		try {
			Persona copiaPersona = new Persona(persona[3]);
			copiaPersona.setNombre("Pepe");
			copiaPersona.mismoDni(persona,copiaPersona);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No existe esa posición del array");
		}
		
	}

}
