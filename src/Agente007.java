import java.util.Arrays;
/**
 * Esta clase es una herencia de la calse agente
 * 
 * @author Ivan Torres
 * @version 1.0.0
*/

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
