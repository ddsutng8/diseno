package test;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void  main(String args[]) {
		
		jugador pepito=new jugadorEstandar();
		pepito.setEdad(30);
	    pepito.setNombre("Pepito");
	    pepito.settipodeJugador("Estandar");
		admin admin=new admin();
		
		jugador carlitos=new jugadorEstandar();
		carlitos.setEdad(88);
		carlitos.setNombre("Carlitos");
		carlitos.settipodeJugador("Estandar");

		partido primerPartido=new partido();
		pepito.inscribirmeA(primerPartido);
		carlitos.inscribirmeA(primerPartido);
		
//		Iterator <jugador> it = primerPartido.ListaDeJugadores.iterator();  
	   //System.out.println(primerPartido.ListaDeJugadores.get(0).edad);
		
				
		System.out.println("La cantidad de jugadores es " + primerPartido.ListaDeJugadores.size());
		
      
		admin.armarPosibleEquipo(primerPartido);
		
		System.out.println("La cantidad de jug inscriptos son " + primerPartido.JugadoresSeleccionados.size());
		Iterator <jugador> it2 = primerPartido.JugadoresSeleccionados.iterator();  
		   //System.out.println(primerPartido.ListaDeJugadores.get(0).edad);
			
			while(it2.hasNext())
			{
			    System.out.println("Jugador "  + it2.next().getNombre());
			}
			
		

	}

}
