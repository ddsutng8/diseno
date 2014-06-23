package test;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Iterator;

public class Main {

	public static void  main(String args[]) {
		admin admin=new admin();

		jugador pepito=new jugadorEstandar();
		pepito.setEdad(30);
		pepito.setNombre("Pepito");
		

		jugador franco=new jugadorEstandar();
		franco.setEdad(30);
		franco.setNombre("Franco");
			    

		jugador german=new jugadorEstandar();
		german.setEdad(30);
		german.setNombre("German");
		

		jugador luis=new jugadorEstandar();
		luis.setEdad(30);
		luis.setNombre("luis");
		

		jugador marcelo=new jugadorEstandar();
		marcelo.setEdad(30);
		marcelo.setNombre("marcelo");
		

		jugador Juan=new jugadorEstandar();
		Juan.setEdad(30);
		Juan.setNombre("Juan");
		

		jugador cacho=new jugadorEstandar();
		cacho.setEdad(30);
		cacho.setNombre("cacho");
		

		jugador pedro=new jugadorEstandar();
		pedro.setEdad(30);
		pedro.setNombre("pedro");
		

		jugador facu=new jugadorEstandar();
		facu.setEdad(30);
		facu.setNombre("facu");
		

		jugador carlitos=new jugadorEstandar();
		carlitos.setEdad(88);
		carlitos.setNombre("Carlitos");
		
		jugadorSolidario gerardo=new jugadorSolidario();
		gerardo.setEdad(88);
		gerardo.setNombre("Gerardo");
		

//		jugador nicolas=new jugadorEstandar();
//		nicolas.setEdad(88);
//		nicolas.setNombre("Nicolas");
//		nicolas.settipodeJugador("Estandar");
		/*creo mockobject*/
		mockEnvioMensajes envioMensaje = new mockEnvioMensajes();

		partido primerPartido=new partido(envioMensaje);


		pepito.inscribirmeA(primerPartido);
		facu.inscribirmeA(primerPartido);
		pedro.inscribirmeA(primerPartido);
		cacho.inscribirmeA(primerPartido);
		Juan.inscribirmeA(primerPartido);
		marcelo.inscribirmeA(primerPartido);
		gerardo.inscribirmeA(primerPartido); // solidario
		luis.inscribirmeA(primerPartido);
		german.inscribirmeA(primerPartido);
		franco.inscribirmeA(primerPartido);
		carlitos.inscribirmeA(primerPartido);

		//nicolas.inscribirmeA(primerPartido);

		System.out.println("La cantidad de jugadores postulados: " + primerPartido.ListaDeJugadores.size());

		admin.armarPosibleEquipo(primerPartido);

		System.out.println("La cantidad de jugadores inscriptos: " + primerPartido.JugadoresSeleccionados.size());
		Iterator <jugador> it2 = primerPartido.JugadoresSeleccionados.iterator();  		
		while(it2.hasNext())
		{
			System.out.println("Jugador "  + it2.next().getNombre());
		}
	
		
		primerPartido.calificacion_jugadores();
		
		pepito.proponerAmigo(carlitos, admin, primerPartido);
		
	}
}
