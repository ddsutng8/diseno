package test;

class jugadorSolidario extends jugador {
	
	public void inscribirmeA(partido elPartido) {
		if (elPartido.ListaDeJugadores.size()<10) {
			elPartido.inscribirA(this);
		}		
	}
}
