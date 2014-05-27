package test;

public class jugador {

	private String nombre;
	int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
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
