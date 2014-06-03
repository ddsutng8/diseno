package test;

public class jugador {

	private String nombre;
	 String tipoDeJugador;
	 String condicionRequeridaPartido;
	int edad;
	public String getcondicionRequeridaPartido() {
		return condicionRequeridaPartido;
	}
	public void setcondicionRequeridaPartido(String condicionRequeridaPartido) {
		this.condicionRequeridaPartido = condicionRequeridaPartido;
	}
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

}
