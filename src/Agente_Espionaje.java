import java.util.Arrays;

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
