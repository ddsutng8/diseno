package test;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class infraccion {
	
	String motivo;
	jugador unJugador;
	Date fecha;
	List<infraccion> ListaDeInfracciones = new ArrayList<infraccion>();
	
	public String getMotivo(){
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	public jugador getJugador(){
		return unJugador;
	}
	public void setJugador(jugador unJugador) {
		this.unJugador = unJugador;
	}
	
	public Date getFecha(){
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public void crearInfraccion (jugador unJugador, String unMotivo){
		infraccion infraccion = new infraccion();
		ListaDeInfracciones.add(infraccion);
	}
	
}
