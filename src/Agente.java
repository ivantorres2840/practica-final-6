import java.io.Serializable;

/**
 *
 * @author Ivan Torres
 * @version 1.0.0
 * 
 */



public abstract class Agente implements Serializable {
	private String nombre;
	private int edad;
	private String direccion;
	private double salario;
	
	public Agente(String nombre, int edad, String direccion, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "********************"
				+ "Nombre:"+this.nombre
				+ "Edad:" +this.edad
				+ "Direccion:" + this.direccion
				+ "Salario:" + this.salario
				+"********************";
	}
	
	
	
}
