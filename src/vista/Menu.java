package vista;

public class Menu {

	//Final ints del menu principal
	public static final int SALIR = 0;
	public static final int GESTIONAR_JUGADORES = 1;
	public static final int GESTIONAR_ENTRENADORES = 2;
	
	//Final ints del menu entrenadores
	public static final int VISUALIZAR_ENTRENADORES = 1;
	
	public static void mostrarMenuPrincipal() {
		System.out.println("---Menu Principal---");
		System.out.println(SALIR + ". Salir");
		System.out.println(GESTIONAR_JUGADORES + ". Gestionar jugadores");
		System.out.println(GESTIONAR_ENTRENADORES + ". Gestionar entrenadores");
	}
	
	public static void mostrarMenuEntrenadores() {
		System.out.println("---Menu Entrenadores---");
		System.out.println(VISUALIZAR_ENTRENADORES + ". Visualizar entrenadores");
	}
	
}


