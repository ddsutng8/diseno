package test;

import java.util.ArrayList;
import java.util.Iterator;

public class admin {

	/**
	 * @param args
	 */
	

	
	public void armarPosibleEquipo(partido elPartido) {
		int limiteJugadores=0;
		Iterator <jugador> it = elPartido.ListaDeJugadores.iterator();  
		   //System.out.println(primerPartido.ListaDeJugadores.get(0).edad);
			
		System.out.println("Los jugadores anotados son ");
			while(it.hasNext() & limiteJugadores<10)
			{
			    System.out.println("Jugador "+ (limiteJugadores+1) + it.next().getNombre() );
			    limiteJugadores++;
			}
		
		//ver si poner atributo si esta en el equipo, o si conviene que devuelva una lista con
	//todos los objetos que juegan
		
	}
}
