import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IoDatos {
	
	public static String [] leerArma() {
		File fichero = new File("./recursos/armas.txt");
		Scanner leer;
		String [] armas = new String[10];
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			leer = new Scanner(fichero);
			while(leer.hasNextLine()) {
				for (int i = 0; i < armas.length; i++) {
					if(armas[i]!=null) {
						armas[i]=leer.nextLine();
					}
					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return armas;
			
	}
	
	public static String [] leerPisos() {
		File fichero = new File("./recursos/pisos.txt");
		Scanner leer;
		String [] vPisos = new String[10];
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			leer = new Scanner(fichero);
			while(leer.hasNextLine()) {
				for (int i = 0; i < vPisos.length; i++) {
					if(vPisos!=null) {
						vPisos[i]=leer.nextLine();
					}
					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vPisos;
			
	}
	
	public static void guardararma() {
		File fichero = new File("./recursos/armas.txt");
		Scanner leer;
		String arma ="";
		Scanner leer2 = new Scanner(System.in);
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fi = new FileWriter(fichero,true);
			PrintWriter pw = new PrintWriter(fi);
			System.out.println("Introduce una arma");
			arma=leer2.nextLine();
				pw.println(arma);
				pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
	public static void guardarPiso() {
		File fichero = new File("./recursos/pisos.txt");
		Scanner leer;
		String piso ="";
		Scanner leer2 = new Scanner(System.in);
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fi = new FileWriter(fichero,true);
			PrintWriter pw = new PrintWriter(fi);
			System.out.println("Introduce la direccion del piso");
			piso=leer2.nextLine();
			
			pw.println(piso);
			pw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void guardarAgente(Agente [] vAgente) {
		File fichero = new File("./recursos/agentes.txt");
		
		try {
			FileWriter fi = new FileWriter(fichero,true);
			PrintWriter pw = new PrintWriter(fi);
			
			for (int i = 0; i < vAgente.length; i++) {
				if(vAgente[i]!=null) {
					pw.println(vAgente[i]);
					pw.close();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String [] leerAgente() {
		File fichero = new File("./recursos/agentes.txt");
		Scanner leer;
		String [] vAgentes = new String[10];
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			leer = new Scanner(fichero);
			while(leer.hasNextLine()) {
				for (int i = 0; i < vAgentes.length; i++) {
					if(vAgentes!=null) {
						vAgentes[i]=leer.nextLine();
					}
					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vAgentes;
			
	}
	
	public static void encriptarAgente(Agente[] vAgente) {
		File fichero = new File("./recursos/agentes.dat");
		FileOutputStream fo=null;
		DataOutputStream escribir=null;
		
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			fo=new FileOutputStream(fichero,true);
			escribir= new DataOutputStream(fo);
			for (int i = 0; i < vAgente.length; i++) {
				if(vAgente[i]!=null) {
					escribir.writeUTF(vAgente[i].toString());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fo.close();
				escribir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public static void encriptarPisos() {
		File fichero = new File("./recursos/pisos.txt");
		File fichero2 = new File ("./recursos/pisos.dat");
		FileOutputStream fo = null;
		DataOutputStream escribir = null;
		String [] vPisos = new String[10];
		Scanner leer;
		
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(!fichero2.exists()) {
			try {
				fichero2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			leer=new Scanner(fichero);
			while(leer.hasNextLine()) {
				for (int i = 0; i < vPisos.length; i++) {
						vPisos[i]=leer.nextLine();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				escribir.close();
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	public static void encriptarArmas() {
		File fichero = new File("./recursos/armas.txt");
		File fichero2 = new File ("./recursos/armas.dat");
		FileOutputStream fo = null;
		DataOutputStream escribir = null;
		String [] vArmas = new String[10];
		Scanner leer;
		
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(!fichero2.exists()) {
			try {
				fichero2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			leer=new Scanner(fichero);
			fo= new FileOutputStream(fichero2,true);
			escribir = new DataOutputStream(fo);
			while(leer.hasNextLine()) {
				for (int i = 0; i < vArmas.length; i++) {
					if(vArmas[i]!=null) {
						vArmas[i]=leer.nextLine();
						escribir.writeUTF(vArmas[i]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fo.close();
				escribir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
	
	}
	
	

