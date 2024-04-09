package actividadExamen;

import java.util.Arrays;

public class Empresa {
	
	//Atributos
	private Direccion dir;
	private String nombreEm;
	private int numEm;
	private Empleado [] empleados;
	
	//Constructor
	public Empresa(String nombreEm,Direccion dir,int maxEm) {
		this.nombreEm = nombreEm;
		this.dir = dir;
		this.empleados = new Empleado[maxEm];
		this.numEm = 0;
	}
	
	//Constructor de copia
	public Empresa(Empresa emp) {
		this.nombreEm = emp.nombreEm;
		this.dir = new Direccion(emp.dir);
		this.empleados = new Empleado[emp.empleados.length];
		for(int i = 0;i<emp.numEm;i++) {
			this.empleados[i] = new Empleado(emp.empleados[i]);
		}
		this.numEm = emp.numEm;
	}
	
	
	
	//Gets y Sets
	public Direccion getDir() {
		return dir;
	}

	public void setDir(Direccion dir) {
		this.dir = dir;
	}

	public String getNombreEm() {
		return nombreEm;
	}

	public void setNombreEm(String nombreEm) {
		this.nombreEm = nombreEm;
	}

	public int getNumEm() {
		return numEm;
	}

	public void setNumEm(int numEm) {
		this.numEm = numEm;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}
	
	/*Creamos este get para poder recoger una posición existente en el array de empleado
	 * para después poder modificar dicjho elemento*/
	public Empleado getEmpleado(int pos) {
		if(pos >= numEm) 
			return null;
			return empleados[pos];
	}

	//Metodo para añadir un nuevo empleado
	public void añadirEmpleado(Empleado emp,String nom,double suel) {
		if(numEm < this.empleados.length && emp != null) {
			this.empleados[this.numEm] = new Empleado(nom,suel);
			numEm++;
		}
	}

	@Override
	public String toString() {
		return "La empresa " + nombreEm + " situada en " + dir + " con " + numEm + " empleados que son: " 
		+ Arrays.toString(empleados);
	}
	
	
	
	

	
	
	
	
}
