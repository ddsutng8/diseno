package test;

import java.util.ArrayList;

import java.util.List;


public class jugador {

	String nombre;
	String tipoDeJugador;
	jugador unReemplazante;
	int edad;
	
	List<calificaciones> ListaDeCalificaciones = new ArrayList<calificaciones>();
	
	
	/*	String condicionRequeridaPartido;

	public String getcondicionRequeridaPartido() {
		return condicionRequeridaPartido;
	}
	public void setcondicionRequeridaPartido(String condicionRequeridaPartido) {
		this.condicionRequeridaPartido = condicionRequeridaPartido;
	}*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String gettipoDeJugador() {
		return tipoDeJugador;
	}
	public void settipodeJugador(String tipoDeJugador) {
		this.tipoDeJugador = tipoDeJugador;
	}

	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void inscribirmeA(partido elPartido) {
		elPartido.inscribirA(this);
	}

	public void darmeDeBaja(partido elPartido) {
		if (elPartido.ListaDeJugadores.remove(this)) {
			System.out.println(this.getNombre()+"fue eliminado del partido" );
			if (this.unReemplazante==null) {
				elPartido.penalizar(this);
			}else{
				this.unReemplazante.inscribirmeA(elPartido);
			}
			
		} else {
			System.out.println(this.getNombre()+" no esta inscripto al partido" );
		}
	}
	
	public void notificarAmigos(){
		//se notifica a los amigos
	}

	//Calificacion De Jugadores
	public void calificar(jugador elJugadorCalificado) {
		
		calificaciones calificacion = new calificaciones();
		calificacion.setComentario("Comentario De Prueba");
		calificacion.setCalificacion(7);
		calificacion.setCalificador(this);
		calificacion.setCalificado(elJugadorCalificado);
		
		elJugadorCalificado.ListaDeCalificaciones.add(calificacion);
		System.out.println(this.getNombre() + " califica a " + elJugadorCalificado.getNombre() + " con nota " + calificacion.calificacion + " y critica " + calificacion.getComentario());
		
	}
	
	//Proponer un amigo
	public void proponerAmigo(jugador unAmigo, admin elAdmin, partido elPartido){
		if (elAdmin.aprobarRechazarNuevoJugador(unAmigo)){
			elPartido.inscribirA(unAmigo);
		} else {
			elAdmin.justificarRechazo(unAmigo);
		}
		
	}
	
}

