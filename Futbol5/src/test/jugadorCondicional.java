package test;

class jugadorCondicional extends jugador {
	
	String condicionParaPartido;
	public String getCondicionParaPartido() {
		return condicionParaPartido;
	}
	public void setCondicionParaPartido(String condicionParaPartido) {
		this.condicionParaPartido = condicionParaPartido;
	}

	public void inscribirmeA(partido elPartido) {
		// TODO Auto-generated method stub
		if (this.condicionParaPartido == elPartido.condicionPartido) {
			elPartido.inscribirA(this);
		} 
		else{
			System.out.println("No hay partido con la condicion que requiere el jugador " + this.getNombre() );
		}
	}
}


	