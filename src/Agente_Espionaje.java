import java.util.Arrays;
/**
 * Esta clase es una herencia de la calse agente
 * 
 * @author Ivan Torres
 * @version 1.0.0
*/
public class Agente_Espionaje extends Agente {
	private String [] piso;

	public Agente_Espionaje(String nombre, int edad, String direccion, double salario) {
		super(nombre, edad, direccion, salario);
		this.piso = IoDatos.leerPisos();
	}

	@Override
	public String toString() {
		return super.toString()+
				 "piso:" + Arrays.toString(piso) ;
	}


	
}
