package test;
import java.util.ArrayList;
import java.util.Date;

import java.util.Iterator;
import java.util.List;
//import java.sql.Date;
import java.util.Scanner;

public class admin {

	List<rechazados> ListaDeRechazados = new ArrayList<rechazados>();


	public void armarPosibleEquipo(partido elPartido) {
		int limiteJugadores=0;
		Iterator <jugador> it = elPartido.ListaDeJugadores.iterator();  
		System.out.println("Los jugadores anotados son: ");
		while(it.hasNext())
		{
			System.out.println("Jugador "+ (limiteJugadores+1) + ": " + it.next().getNombre() );
			limiteJugadores++;
		}
		//Si hay 10 jugadores estandar, la lista de jugadores seleccionados es de los 10 jugadores estandar
		if (elPartido.jugadoresEstandar==10) {		
			for(jugador elem : elPartido.ListaDeJugadores){
				if (elem instanceof jugadorEstandar && elPartido.JugadoresSeleccionados.size()<10){
					elPartido.JugadoresSeleccionados.add(elem);
				}			
			}
		}else {
			//Si no hay 10 jugadores estandar..
			//Lleno con jugadores Estandar
			List<jugador> it2 = elPartido.ListaDeJugadores;
			for(jugador elem : it2){
				if (elem instanceof jugadorEstandar){
					elPartido.JugadoresSeleccionados.add(elem);
				}
			}//Si no llene, agrego jugadores solidarios mientras que la lista no este llena
			for(jugador elem : elPartido.ListaDeJugadores){
				if (elem instanceof jugadorSolidario && elPartido.JugadoresSeleccionados.size()<10){
					elPartido.JugadoresSeleccionados.add(elem);
				}
			}
			//Lleno el resto con jugadores condicionales si la lista no esta llena siempre que sea misma cond
			for(jugador elem : elPartido.ListaDeJugadores){
				if (elem instanceof jugadorCondicional && elPartido.JugadoresSeleccionados.size()<10 
						&& ((jugadorCondicional) elem).getCondicionParaPartido() == elPartido.getCondicionPartido()){
					elPartido.JugadoresSeleccionados.add(elem);
				}
			}

		}
	}

	//amigos como nuevos jugadores
	public boolean aprobarRechazarNuevoJugador(jugador unAmigo){
		boolean resultado=false;
		System.out.println("Por favor confirme al jugador : " + unAmigo.getNombre() );
		System.out.println("Para confirmar escriba 'confirmo', para rechazar escriba 'rechazo'");
		Scanner keyboard = new Scanner(System.in);
		String respuesta= keyboard.next();
		keyboard.close();
		if (respuesta.equals("confirmo"))
		resultado = true;
		if(respuesta.equals("rechazo"))
		resultado = false; //apruebo o rechazo segun motivo del admin, no se cual es
		return resultado;
	}

	public void justificarRechazo(jugador unAmigo){

		rechazados rechazo=new rechazados();
		rechazo.setFecha(new Date());
		rechazo.setRechazado(unAmigo);
		rechazo.setMotivo("Este Motivo");

		System.out.println(unAmigo.getNombre() + " rechazado por " + rechazo.getMotivo());
		this.ListaDeRechazados.add(rechazo);
	}


}
