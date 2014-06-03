package test;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class admin {

	String nombre;
	public String nombre() {
		return nombre;
	}
	public void nombre(String nombre) {
		this.nombre = nombre;
	}

	
	public void armarPosibleEquipo(partido elPartido) {
		int limiteJugadores=0;
		Iterator <jugador> it = elPartido.ListaDeJugadores.iterator();  
		   //System.out.println(primerPartido.ListaDeJugadores.get(0).edad);
			
		System.out.println("Los jugadores anotados son: ");
			while(it.hasNext() & limiteJugadores<10)
			{
			    System.out.println("Jugador "+ (limiteJugadores+1) + ": " + it.next().getNombre() );
			    limiteJugadores++;
			}
		
			List<jugador> it2 = elPartido.ListaDeJugadores;
			int posicionJugadorSeleccionado=0;
//recorro lista de jugadores y agrego todos los estandar
			
			for(jugador elem : it2){
				if (elem.gettipoDeJugador() == "Estandar")
					elPartido.JugadoresSeleccionados.add(posicionJugadorSeleccionado, elem);
				
				posicionJugadorSeleccionado++;
			
			}
//recorro lista de jugadores y agrego solidarios
			List<jugador> it3 = elPartido.ListaDeJugadores;
			for (jugador elem : it3) {
				if (elem.gettipoDeJugador() == "Solidario" && elPartido.JugadoresSeleccionados.size() < 10)
					elPartido.JugadoresSeleccionados.add(posicionJugadorSeleccionado, elem);
				
				posicionJugadorSeleccionado++;
			}
			List<jugador> it4 = elPartido.ListaDeJugadores;
			for (jugador elem : it4) {
				if (elem.gettipoDeJugador() == "Solidario" && elPartido.JugadoresSeleccionados.size() < 10)
					elPartido.JugadoresSeleccionados.add(posicionJugadorSeleccionado, elem);
				posicionJugadorSeleccionado++;
			}
			
		//ver si poner atributo si esta en el equipo, o si conviene que devuelva una lista con
	//todos los objetos que juegan
		
	}
}
