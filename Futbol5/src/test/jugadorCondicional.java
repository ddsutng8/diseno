package test;

class jugadorCondicional extends jugador {
	
	public void inscribirmeA(partido elPartido) {
		// TODO Auto-generated method stub
		if (this.condicionRequeridaPartido == elPartido.condicionPartido) {
			elPartido.inscribirA(this);
} 
else
{ System.out.println("No hay partido con la condicion que requiere el jugador " + this.getNombre() );
}
		}
	}


	