
public class Jefazo extends Agente {
	private int Años;

	public Jefazo(String nombre, int edad, String direccion, double salario, int años) {
		super(nombre, edad, direccion, salario);
		Años = años;
	}

	public int getAños() {
		return Años;
	}

	public void setAños(int años) {
		Años = años;
	}

	@Override
	public String toString() {
		return super.toString()+
				 "Años de mandato:"+this.Años;
	}

	
	
}
