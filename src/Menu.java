import java.util.Scanner;
/**
 * 
 * 
 * @author Ivan Torres
 * @version 1.0.0
*/
public class Menu {
	
	
	/**
	*Metodo que nos devuelve un entero y donde pintaremos el menu principal que se lo mandaremos al programa para que este peuda elegir una opcion del menu
	*
	*/
	
	public static int PintaMenu() {
		
		int opc=0;
			do {
				Scanner leer = new Scanner(System.in);
				System.out.println("1- Ver todos los agentes con su información");
				System.out.println("2- Ver los agentes que ganen más de una cantidad X");
				System.out.println("3- Dar de alta un nuevo piso");
				System.out.println("4- Dar de alta una nueva arma");
				System.out.println("5- Dar de alta un nuevo agente");
				System.out.println("6- Encriptar toda la información");
				System.out.println("7- Desencriptar toda la información");
				System.out.println("8- Salir");
				opc=leer.nextInt();
			}while(opc<1 || opc>8);

		
		return opc;
	}
	
	/**
	*Metodo que nos devuelve un entero y donde pintaremos el menu de los agentes que se lo mandaremos al programa para que este pueda elegir una opcion del menu
	*
	*/
	public static int PintaMenuAgente() {
		
		int opc2=0;
		do {
			Scanner leer = new Scanner(System.in);
			System.out.println("1- Es Jefazo");
			System.out.println("2- Es Agente Espionaje");
			System.out.println("3- Es Agente007");
			opc2=leer.nextInt();
		}while(opc2<1 || opc2>3);

		return opc2;
	}
	
}
