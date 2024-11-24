package ar.com.gugler.sgc.modelo;

import java.time.LocalDate;

public class Alumno extends Persona {
	private String Legajo;
	
	
	
public Alumno(String Documento, String Apellido,String Nombre,LocalDate FechaNacimiento,String Domicilio,String Telefono,String Correo, String Legajo) {
	super(Documento,Apellido,Nombre,FechaNacimiento,Domicilio,Telefono,Correo);
	this.Legajo = Legajo;
	}


public String getLegajo(){return Legajo;}
public void setLegajo(String Legajo){this.Legajo = Legajo;}


public String toString() {return Legajo+"//";}
	
@Override
public boolean equals(Object obj) {
    if (this == obj){return true;} 
    if (!(obj instanceof Persona)) {return false;}

    Alumno aux = (Alumno) obj;
        
        if (this.Legajo != null && this.Legajo.equals(aux.Legajo)) 
        return true;
        else
        return false;
    }

	
public void MostrarInformacion() {System.out.println("...::::Informacion del Alumno::::...");
		System.out.println("Nombre: "+ getNombre());
		System.out.println("Apellido: "+getApellido());
		System.out.println("Documento: "+getDocumento());
		System.out.println("...::::Informacion del Alumno::::...");}
	
public void MostrarInformacionCompleta() {System.out.println("...::::Informacion del Alumno-COMPLETA::::...");
System.out.println("Documento: "+ getDocumento());
System.out.println("Apellido: "+getApellido());
System.out.println("Nombre: "+getNombre());
System.out.println("FechaNacimiento: "+getFechaNacimiento());
System.out.println("Domicilio: "+getDomicilio());
System.out.println("Telefono: "+getTelefono());
System.out.println("Correo: "+getCorreo());
System.out.println("Legajo: "+getLegajo());
System.out.println("...::::Informacion del Alumno-COMPLETA::::...");}

}
