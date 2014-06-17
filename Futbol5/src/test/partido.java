package test;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class partido {
	
	/*  recibo mock object o implementacion real  */
	public  partido(envioMensajes anenvioMensajes) {
		envioMensaje = anenvioMensajes;
	}
	String fecha;
	String lugar;
	String condicionPartido;
	boolean cerrado;
	private int hora;
	int jugadoresEstandar = 0;
	int cantidadDeJugadores = 0;
	envioMensajes envioMensaje;


	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String condicionPartido() {
		return lugar;
	}

	public void condicionPartido(String lugar) {
		this.lugar = lugar;
	}

	public String getNombre() {
		return fecha;
	}

	public void setNombre(String nombre) {
		this.fecha = nombre;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	

	ArrayList<jugador> ListaDeJugadores = new ArrayList<jugador>();
	List<jugador> JugadoresSeleccionados = new ArrayList<jugador>();

	
	
	
	
	public void inscribirA(jugador elJugador) {
		{ // recorro lista de jugadores para ver si hay 10 inscriptos de forma
			// estandar

			// if (this.ListaDeJugadores.size() <=10) {
			
			List<jugador> it = this.ListaDeJugadores;

			for(jugador elem : it) {
				if (elem.gettipoDeJugador() == "Estandar")
					jugadoresEstandar++;
			}
			if (jugadoresEstandar < 10) {
				this.ListaDeJugadores.add(cantidadDeJugadores, elJugador);
				cantidadDeJugadores++;
				if ( (jugadoresEstandar == 9) && (elJugador.tipoDeJugador== "Estandar")){
					// , se cierra el partido(10 jug estandar)
					this.cerrado=true;
					envioMensaje.enviarMensajeAAdmin();
				}
				if (cantidadDeJugadores >= 10 && this.cerrado==false ) {
//se le envia mensaje a admin, ya q se llego a los 10 inscriptos, pero no se cerro la inscripcion
					envioMensaje.partidoConfirmado(this);
				}

			} else {
				this.cerrado = true;
				// , se cierra el partido(10 jug estandar)
				envioMensaje.enviarMensajeAAdmin();
			}

			// partido.incribirA jugador;

			// self.mostrarPorPantallaYobtenerDatos($hora, $fecha,
			// $lugarDelPartido, $persona)
			// self.validarSiHayLugarYNoEsCondicional($persona.modo)
			// self.listaDeJugadores.Agregar( $persona)}

		}
	jugadoresEstandar=0;
	}
	
	//Calificacion de los jugadores --> Falta analizar que se ejecute cuando el partido finaliza
		
	public void calificacion_jugadores(){
				
		for(jugador elJugadorQueCalifica: ListaDeJugadores){
			for(jugador elJugadorCalificado: ListaDeJugadores){
				if(elJugadorQueCalifica.equals(elJugadorCalificado)){
							
					} else {
							
					elJugadorQueCalifica.calificar(elJugadorCalificado);
				}
			}
					
		}
				
	}
	
	// FIN Calificacion de jugadores

}
