package test;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void  main(String args[]) {
		admin admin=new admin();
		
		jugador pepito=new jugadorEstandar();
		pepito.setEdad(30);
	    pepito.setNombre("Pepito");
	    pepito.settipodeJugador("Estandar");
	    
	    jugador franco=new jugadorEstandar();
	    franco.setEdad(30);
	    franco.setNombre("Franco");
	    franco.settipodeJugador("Estandar");	    
		
	    jugador german=new jugadorEstandar();
	    german.setEdad(30);
	    german.setNombre("German");
	    german.settipodeJugador("Estandar");
	    
	    jugador luis=new jugadorEstandar();
		luis.setEdad(30);
	    luis.setNombre("luis");
	    luis.settipodeJugador("Estandar");
	    
	    jugador marcelo=new jugadorEstandar();
		marcelo.setEdad(30);
		marcelo.setNombre("marcelo");
		marcelo.settipodeJugador("Estandar");
	    
	    jugador gato=new jugadorEstandar();
		gato.setEdad(30);
		gato.setNombre("gato");
		gato.settipodeJugador("Estandar");
	    
	    jugador cacho=new jugadorEstandar();
	    cacho.setEdad(30);
	    cacho.setNombre("cacho");
	    cacho.settipodeJugador("Estandar");
	    
	    jugador gay=new jugadorEstandar();
		gay.setEdad(30);
		gay.setNombre("gay");
		gay.settipodeJugador("Estandar");
	    
	    jugador facu=new jugadorEstandar();
		facu.setEdad(30);
		facu.setNombre("facu");
		facu.settipodeJugador("Estandar");
	    
		jugador carlitos=new jugadorEstandar();
		carlitos.setEdad(88);
		carlitos.setNombre("Carlitos");
		carlitos.settipodeJugador("Estandar");

		partido primerPartido=new partido();
		
		pepito.inscribirmeA(primerPartido);
		carlitos.inscribirmeA(primerPartido);
		facu.inscribirmeA(primerPartido);
		gay.inscribirmeA(primerPartido);
		cacho.inscribirmeA(primerPartido);
		gato.inscribirmeA(primerPartido);
		marcelo.inscribirmeA(primerPartido);
//		luis.inscribirmeA(primerPartido);
		german.inscribirmeA(primerPartido);
//		franco
		
		
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
