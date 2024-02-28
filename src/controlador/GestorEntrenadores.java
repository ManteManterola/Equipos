package controlador;

import java.util.Scanner;

import modelo.GestorBBDD;
import vista.Menu;

public class GestorEntrenadores {

	public static void run() {
		GestorBBDD gestorBBDD = new GestorBBDD();
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			Menu.mostrarMenuEntrenadores();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.SALIR:
				System.out.println("SALIENDO");
				break;

			case Menu.VISUALIZAR_ENTRENADORES:
				gestorBBDD.Conectar();
				
			default:
				break;
			}
		} while (opcion != Menu.SALIR);
		
	}

}
