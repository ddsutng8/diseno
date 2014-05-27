package test;
import java.util.ArrayList;

public class partido {
	static private String fecha;
	static private String lugar;
	static private int hora;
	private int cantidadDeJugadores=0;
	
	public String getLugar() {
		return lugar;
	}
public void setLugar(String lugar) {
	this.lugar = lugar;
}
	public String getNombre() {
		return fecha;
	}
	public void setNombre(String nombre) {
		this.fecha = nombre;
	}
	
	public int getEdad(){
		return hora;
	}
	public void setEdad(int edad) {
		this.hora = edad;
	}
	public int cantidadDeJugadores(){
		return cantidadDeJugadores;
	}
	public void cantidadDeJugadores(int edad) {
		this.cantidadDeJugadores = edad;
	}
	
	
	static ArrayList<jugador> ListaDeJugadores = new ArrayList<jugador>();

	public void inscribirA(jugador elJugador) {
				 {
			 
			 partido.ListaDeJugadores.add(cantidadDeJugadores, elJugador) ;
			 cantidadDeJugadores = cantidadDeJugadores + 1;
			 
		//	partido.incribirA jugador;
		 
// self.mostrarPorPantallaYobtenerDatos($hora, $fecha, $lugarDelPartido, $persona)
//	 self.validarSiHayLugarYNoEsCondicional($persona.modo)
//		 self.listaDeJugadores.Agregar( $persona)}

			}


	}

}
