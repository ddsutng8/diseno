package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		jugador pepito=new jugador();
		jugador carlitos=new jugador();
		partido primerPartido=new partido();
		pepito.setEdad(30);
		carlitos.setEdad(88);
		primerPartido.inscribirA(pepito);
		primerPartido.inscribirA(carlitos);
		
		Iterator <jugador> it = primerPartido.ListaDeJugadores.iterator();  
	   //System.out.println(primerPartido.ListaDeJugadores.get(0).edad);
		
		while(it.hasNext())
		{
		    System.out.println(it.next().edad);
		}
		
		System.out.println("La cantidad de jugadores es " + primerPartido.ListaDeJugadores.size());
		


	}

}
