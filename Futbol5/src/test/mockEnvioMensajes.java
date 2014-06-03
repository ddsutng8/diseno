package test;

public class mockEnvioMensajes
implements envioMensajes {
public void enviarMensajeAAdmin() {
System.out.println("el equipo esta completo( 10 jug estandar ), no se agregan más jugadores. se envia mensaje a Admin");
}

public void partidoConfirmado(partido ElPartido)
{
	System.out.println("el partido ha llegado a los 10 inscriptos, pero no se cerro la inscripcion");
}
}

