package test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class partido {

	/*  recibo mock object o implementacion real  */
	public  partido(envioMensajes anenvioMensajes) {
		envioMensaje = anenvioMensajes;
	}
	Date fecha;
	String lugar;
	String condicionPartido;
	int hora;
	boolean cerrado=false;	
	int jugadoresEstandar = 0;
	int cantidadDeJugadores = 0;
	envioMensajes envioMensaje;


	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCondicionPartido() {
		return condicionPartido;
	}
	public void setCondicionPartido(String condicionPartido) {
		this.condicionPartido = condicionPartido;
	}

	public int getCantidadDeJugadores(){
		return ListaDeJugadores.size();
	}
	public int getJugadoresEstandar(){
		return jugadoresEstandar;
	}
	List<jugador> ListaDeJugadores = new ArrayList<jugador>();
	List<jugador> JugadoresSeleccionados = new ArrayList<jugador>();
	List<infraccion> ListaInfracciones = new ArrayList<infraccion>();
	
	public void inscribirA(jugador elJugador) { 
		// Agrego si la inscripcio no esta cerrada
		if (this.cerrado==false) {
			if (jugadoresEstandar < 10) {
				this.ListaDeJugadores.add(elJugador);
				if (elJugador instanceof jugadorEstandar) {
					jugadoresEstandar++;
				}
				if ( (jugadoresEstandar == 10)){
					// Se cierra el partido(10 jugadores estandar)
					this.cerrado=true;
					envioMensaje.enviarMensajeAAdmin();
				}
				if (this.getCantidadDeJugadores() >= 10 && this.cerrado==false ) {
					//se le envia mensaje a admin, ya q se llego a los 10 inscriptos, pero no se cerro la inscripcion
					envioMensaje.partidoConfirmado(this);
				}
			}
		} else {
			//informo qe el partido esta cerrado
			System.out.println("La inscripcion al partido esta cerrada");
		}
	}
	public void penalizar(jugador elJugador){
		infraccion infraccion = new infraccion();
		infraccion.setJugador(elJugador);
		infraccion.setMotivo("No indico reemplazo");
		ListaInfracciones.add(infraccion);
	}
	
//	public void calificacion_jugadores(){
//		
//		for(jugador elJugadorQueCalifica: JugadoresSeleccionados){
//			for(jugador elJugadorCalificado: JugadoresSeleccionados){
//				if(elJugadorQueCalifica.equals(elJugadorCalificado)){
//							
//					} else {
//							
//					elJugadorQueCalifica.calificar(elJugadorCalificado);
//				}
//			}
//					
//		}
//				
//	}
	
}