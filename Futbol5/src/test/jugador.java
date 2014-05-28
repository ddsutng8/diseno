package test;

public class jugador {

	private String nombre;
	private String tipoDeJugador;
	int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoDeJugador() {
		return nombre;
	}
	public void setTipodeJugador(String nombre) {
		this.nombre = nombre;
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

}
