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
			Iterator<jugador> it3 = elPartido.ListaDeJugadores.iterator();
			while (it3.hasNext()) {
				if (it3.next().gettipoDeJugador() == "Solidario" && elPartido.JugadoresSeleccionados.size() < 10)
					elPartido.JugadoresSeleccionados.add(posicionJugadorSeleccionado, it3.next());
				posicionJugadorSeleccionado++;
			}
			Iterator<jugador> it4 = elPartido.ListaDeJugadores.iterator();
			while (it4.hasNext()) {
				if (it4.next().gettipoDeJugador() == "Solidario" && elPartido.JugadoresSeleccionados.size() < 10)
					elPartido.JugadoresSeleccionados.add(posicionJugadorSeleccionado, it4.next());
				posicionJugadorSeleccionado++;
			}
			
		//ver si poner atributo si esta en el equipo, o si conviene que devuelva una lista con
	//todos los objetos que juegan
		
	}
}
