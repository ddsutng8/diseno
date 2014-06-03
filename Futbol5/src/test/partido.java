package test;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class partido {
	String fecha;
	String lugar;
	String condicionPartido;
	boolean cerrado;
	private int hora;
	int jugadoresEstandar = 0;
	int cantidadDeJugadores = 0;
	envioMensajes envioMensaje;

	public void envio(envioMensajes anenvioMensajes) {
		envioMensaje = anenvioMensajes;
	}

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

	public int getEdad() {
		return hora;
	}

	public void setEdad(int edad) {
		this.hora = edad;
	}

	public int cantidadDeJugadores() {
		return cantidadDeJugadores;
	}

	public void cantidadDeJugadores(int edad) {
		this.cantidadDeJugadores = edad;
	}

	ArrayList<jugador> ListaDeJugadores = new ArrayList<jugador>();
	List<jugador> JugadoresSeleccionados = new ArrayList<jugador>();

	public void inscribirA(jugador elJugador) {
		{ // recorro lista de jugadores para ver si hay 10 inscriptos de forma
			// estandar

			// if (this.ListaDeJugadores.size() <=10) {
			Iterator<jugador> it = this.ListaDeJugadores.iterator();

			while (it.hasNext()) {
				if (it.next().gettipoDeJugador() == "Estandar")
					jugadoresEstandar++;
			}
			if (jugadoresEstandar < 10) {
				this.ListaDeJugadores.add(cantidadDeJugadores, elJugador);
				cantidadDeJugadores = cantidadDeJugadores + 1;
				if (cantidadDeJugadores >= 10) {
					System.out
							.println("avisar que el partido esta confirmado, no cerrado porque todavia se puede agregar gente");
					envioMensaje.enviarMensajeAAdmin();
				}

			} else {
				this.cerrado = true;
				System.out
						.println("No hay mas lugar, se cierra partido. hay que avisar a admin(parte 2 tp) ");
				envioMensaje.enviarMensajeAAdmin();
			}

			// partido.incribirA jugador;

			// self.mostrarPorPantallaYobtenerDatos($hora, $fecha,
			// $lugarDelPartido, $persona)
			// self.validarSiHayLugarYNoEsCondicional($persona.modo)
			// self.listaDeJugadores.Agregar( $persona)}

		}

	}

}
