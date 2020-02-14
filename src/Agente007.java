import java.util.Arrays;

public class Agente007 extends Agente {
	
	private int contador;
	private String [] armas;
	public Agente007(String nombre, int edad, String direccion, double salario, int contador) {
		super(nombre, edad, direccion, salario);
		this.contador = contador;
		this.armas=IoDatos.leerArma();
	}
	@Override
	public String toString() {
		return super.toString()
				+ "contador" + contador + 
				"armas" + Arrays.toString(armas);
	}

	
}
