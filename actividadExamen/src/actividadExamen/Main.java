package actividadExamen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciamos los objetos
		Empleado empl1 = new Empleado("nombre",23456);
		Direccion dir1 = new Direccion("Calle Luna nueva",53);
		Empresa empr1 = new Empresa("Mierdona",dir1,5);
		
		//Creamos 3 empleados en la empresa
		empr1.añadirEmpleado(empl1,"jesus",3500);
		empr1.añadirEmpleado(empl1,"maria",4000);
		empr1.añadirEmpleado(empl1,"manu",3000);
		
		
		/*Creamos una copia de la empresa y le cambiamos el nombre del primer empleado,
		*el nombre de la calle y añadimos un nuevo empleado a la empresa copia*/
		
		Empresa copiaEmpresa = new Empresa(empr1);
		copiaEmpresa.getEmpleado(0).setNombre("javi");
		copiaEmpresa.getDir().setNombreCalle("Avenida Leopoldo");
		copiaEmpresa.añadirEmpleado(empl1, "david", 2500);

		//Imprimimos los datos de las 2 empresas
		System.out.println(empr1);
		System.out.println();
		System.out.println(copiaEmpresa);
		
	}

}
