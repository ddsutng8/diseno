package test;


class jugadorEstandar extends jugador {

	int jugadorCondiReemplazado = 0;
	int jugadorSolidReemplazado = 0;

	public void inscribirmeA(partido elPartido) {
		elPartido.inscribirA(this);
//		// elPartido.inscribirA(this);
//		if (elPartido.cerrado == false) {
//			if (elPartido.ListaDeJugadores.size() < 10) {
//				elPartido.inscribirA(this);
//			} else {
//				if (elPartido.ListaDeJugadores.size() == 10) {
//					// hay jugadores solidarios o condicionales
//
//					Iterator<jugador> it = elPartido.ListaDeJugadores
//							.iterator();
//					// chequeo si hay condicionales
//					while (it.next().tipoDeJugador != "Condicional"
//							&& it.hasNext()) {
//						jugadorCondiReemplazado++;
//					}
//					if (it.hasNext()) {
//						// encontro jugador condicional porque no habia llegado
//						// al final de la lista
//						elPartido.inscribirA(this);
//					} else {
//						// no encontro jugador condicional, entonces hay
//						// jugadores solidarios
//						// reemplazo al primero
//						while (it.next().tipoDeJugador != "Solidario") {
//							jugadorSolidReemplazado++;
//						}
//						elPartido.inscribirA(this);
//					}
//
//				}
//			}
//
//		}
//
//		else {
//			// el partido esta cerrado, hay 10 estandar
//			// enviar mensaje a jugador diciendo q el partido ya esta cerrado
//		}
//
//	}
}
}
