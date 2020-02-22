import java.util.Scanner;

/**
 * 
 * 
 * @author Ivan Torres
 * @version 1.0.0
*/


public class Main {

	/**
	 *Metodo que utilizamos para añadir un agente al vector, en este pediremos si es jefazo o si es espia o si es agente007
	 * 
	 * @param Agente[] vAgente
	 */

	
	public static void añadirAgentes(Agente[] vAgente) {
		Scanner leer= new Scanner(System.in);
		Scanner leer2= new Scanner(System.in);
		String nombre="";
		int edad=0;
		String direccion="";
		double salario=0;
		int años =0;
		int contador =0;
		int opc=Menu.PintaMenuAgente();
		switch(opc) {
		case 1:
			for (int i = 0; i < vAgente.length; i++) {
				System.out.println("introduce el nombre");
				nombre=leer.nextLine();
				System.out.println("introduce la edad");
				edad=leer2.nextInt();
				System.out.println("introduce la direccion");
				direccion=leer.nextLine();
				System.out.println("introduce su salario");
				salario=leer2.nextDouble();
				System.out.println("introduce años de mandato");
				años=leer2.nextInt();
				Agente a = new Jefazo(nombre,edad,direccion,salario,años);
				if(vAgente[i]==null) {
					vAgente[i]=a;
					break;
				}
			}
			
			break;
		case 2:
			for (int i = 0; i < vAgente.length; i++) {
				System.out.println("introduce el nombre");
				nombre=leer.nextLine();
				System.out.println("introduce la edad");
				edad=leer2.nextInt();
				System.out.println("introduce la direccion");
				direccion=leer.nextLine();
				System.out.println("introduce su salario");
				salario=leer2.nextDouble();
				Agente a = new Agente_Espionaje(nombre,edad,direccion,salario);
				if(vAgente[i]==null) {
					vAgente[i]=a;
					break;
				}
			}
			break;
		case 3: 
			for (int i = 0; i < vAgente.length; i++) {
				System.out.println("introduce el nombre");
				nombre=leer.nextLine();
				System.out.println("introduce la edad");
				edad=leer2.nextInt();
				System.out.println("introduce la direccion");
				direccion=leer.nextLine();
				System.out.println("introduce su salario");
				salario=leer2.nextDouble();
				System.out.println("introduce el contador de victimas");
				contador=leer2.nextInt();
				Agente a = new Agente007(nombre,edad,direccion,salario,contador);
				if(vAgente[i]==null) {
					vAgente[i]=a;
					break;
				}
			}
			break;
			}
	}
	/**
	 *Metodo donde muestra toda la informacion de los agentes guardadas en el vector sin que nos muestre los que son nulos
	 * 
	 * @param Agente[] vAgente
	 */	

	
	public static void mostrarAgentes(Agente[] vAgente) {
		for (int i = 0; i < vAgente.length; i++) {
			if(vAgente[i]!=null) {
				System.out.println(vAgente[i].toString());
			}
		}
	}
	/**
	 *Metodo donde muestra toda la informacion de los agentes guardadas en el vector sin que nos muestre los que son nulos buscando los que son menores del salario pedido
	 * 
	 * @param Agente[] vAgente
	 */
	
	public static void mostrarAgentessalario(Agente[] vAgente) {
		Scanner leer = new Scanner(System.in);
		double salario=0;
		System.out.println("introduce el salario a buscar");
		salario=leer.nextDouble();
		for (int i = 0; i < vAgente.length; i++) {
			if (vAgente[i]!=null && salario<vAgente[i].getSalario()) {
				System.out.println(vAgente[i].toString());
			}
		}
	}
	/**
	 *Metodo que se encarga de dar vida a nuestro proyecto y donde creamos el vector de los agentes donde guardaremois su informacion
	 * 
	 * @param String[] args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agente [] vAgente = new Agente[10];
		
		int opc=0;	
		do {
		 opc=Menu.PintaMenu();
		switch(opc) {
		case 1:
			mostrarAgentes(vAgente);
			break;
		case 2:
			mostrarAgentessalario(vAgente);
			break;
		case 3:
			IoDatos.guardarPiso();
			break;
		case 4 : 
			IoDatos.guardararma();
			break;
		case 5:
			añadirAgentes(vAgente);
			IoDatos.guardarAgente(vAgente);
			break;
		case 6:
		//	IoDatos.encriptarAgente(vAgente);
			//IoDatos.encriptarPisos();
			IoDatos.encriptarArmas();
			break;
		case 7:
			break;
		case 8:
			System.out.println("Adios");
			break;
		}
		}while(opc!=8);
		
	}

}
