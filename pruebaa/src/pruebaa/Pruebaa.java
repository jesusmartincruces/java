package pruebaa;

public class Pruebaa {
	//Atributos
	private String texto;
	private int num;
	
	//Constructores
	public Pruebaa() {
		
	}
	
	public Pruebaa(String texto,int num) {
		this.texto = texto;
		this.num = num;
	}
	
	public Pruebaa(Pruebaa prueba) {
		this.texto = prueba.texto;
		this.num = prueba.num;
	}
	
	

	@Override
	public String toString() {
		return "Pruebaa [texto=" + texto + ", num=" + num + "]";
	}
	
	
}
