package arrayEmpleados;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayEmpleados[]empleado = {new ArrayEmpleados("jesus",26,1567.89), new ArrayEmpleados("gala",37,617.78)};
		for(int i = 0; i< empleado.length;i++) {
			System.out.println("El/la empleado/a llamado/a " + empleado[i].getNombre() + " tiene " +
				empleado[i].getEdad() + " años y gana " + empleado[i].getSueldo() + "€ al mes.");
		}
		for(int i = 0; i< empleado.length;i++) {
			System.out.println(empleado[i]);
		}
	}

}
