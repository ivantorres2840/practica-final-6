
public class Jefazo extends Agente {
	private int A�os;

	public Jefazo(String nombre, int edad, String direccion, double salario, int a�os) {
		super(nombre, edad, direccion, salario);
		A�os = a�os;
	}

	public int getA�os() {
		return A�os;
	}

	public void setA�os(int a�os) {
		A�os = a�os;
	}

	@Override
	public String toString() {
		return super.toString()+
				 "A�os de mandato:"+this.A�os;
	}

	
	
}
