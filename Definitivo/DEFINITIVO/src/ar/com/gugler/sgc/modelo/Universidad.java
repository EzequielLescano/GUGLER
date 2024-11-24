package ar.com.gugler.sgc.modelo;
	
	public class Universidad {

	    public static void mostrarDatos(Persona persona) {
	        if (persona != null) {
	            System.out.println("Datos de la Persona:");
	            System.out.println(persona.toString());
	        } else {
	            System.out.println("_//_ERROR_\\_");
	        }
	    }
	}
