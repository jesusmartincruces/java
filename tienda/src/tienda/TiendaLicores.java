package tienda;

public class TiendaLicores extends Tienda {
	@Override
	public void saludo() {
		super.saludo();
		System.out.println("Si eres menor de 18 años, fuera de aquí");
	}
}
