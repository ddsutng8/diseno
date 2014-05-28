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
		pepito.setEdad(30);
	    pepito.setNombre("Pepito");
		admin admin=new admin();
		
		jugador carlitos=new jugador();
		carlitos.setEdad(88);
		carlitos.setNombre("Carlitos");

		partido primerPartido=new partido();
		primerPartido.inscribirA(pepito);
		primerPartido.inscribirA(carlitos);
		
		Iterator <jugador> it = primerPartido.ListaDeJugadores.iterator();  
	   //System.out.println(primerPartido.ListaDeJugadores.get(0).edad);
		
		while(it.hasNext())
		{
		    System.out.println(it.next().edad);
		}
		
		System.out.println("La cantidad de jugadores es " + primerPartido.ListaDeJugadores.size());
		
      
		admin.armarPosibleEquipo(primerPartido);
		

	}

}
