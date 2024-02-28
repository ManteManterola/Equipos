package modelo;

import java.util.Scanner;

import controlador.GestorEntrenadores;
import controlador.GestorJugadores;
import vista.Menu;

public class GestorEquipos {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			Menu.mostrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.SALIR:
				System.out.println("SALIENDO");
				break;
				
			case Menu.GESTIONAR_JUGADORES:
				GestorJugadores.run();
				break;
				
			case Menu.GESTIONAR_ENTRENADORES:
				GestorEntrenadores.run();
				break;

			default:
				System.out.println("OPCION NO DISPONIBLE");
				break;
			}
		} while (opcion != Menu.SALIR);
	}
	

}
