package test;
import java.util.ArrayList;
import java.util.Iterator;

public class partido {
	static private String fecha;
	static private String lugar;
	static private int hora;
	private int jugadoresEstandar=0;
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
				 { //recorro lista de jugadores para ver si hay 10 inscriptos de forma estandar
					 Iterator <jugador> it = partido.ListaDeJugadores.iterator();  
						
						while(it.hasNext())
						{
							if (it.next().getTipoDeJugador() == "Estandar" ) jugadoresEstandar++;
						}
			if (jugadoresEstandar < 10) {
						partido.ListaDeJugadores.add(cantidadDeJugadores, elJugador) ;
			 cantidadDeJugadores = cantidadDeJugadores + 1;
			}
			else {
				System.out.println("No hay mas lugar, hay que avisar a admin(parte 2 tp) ");
			}
			 
		//	partido.incribirA jugador;
		 
// self.mostrarPorPantallaYobtenerDatos($hora, $fecha, $lugarDelPartido, $persona)
//	 self.validarSiHayLugarYNoEsCondicional($persona.modo)
//		 self.listaDeJugadores.Agregar( $persona)}

			}


	}
	

}
