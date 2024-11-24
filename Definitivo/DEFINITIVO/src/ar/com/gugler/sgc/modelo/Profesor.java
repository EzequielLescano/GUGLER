package ar.com.gugler.sgc.modelo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Profesor extends Persona{
	private String Cuil;
	private LocalDate FechaIngreso;

	
public Profesor (String Documento,String Apellido,String Nombre,LocalDate FechaNacimiento,String Domicilio,String Telefono,String Correo,String Cuil,LocalDate FechaIngreso) {
	super( Documento, Apellido, Nombre, FechaNacimiento, Domicilio, Telefono, Correo);
	this.Cuil = Cuil;
	this.FechaIngreso = FechaIngreso;
}

public String getCuil(){return Cuil;}
public void setCuil(String Cuil) {this.Cuil = Cuil;}
public LocalDate getFechaIngreso() {return FechaIngreso;}
public void getFechaIngreso(LocalDate FechaIngreso){this.FechaIngreso = FechaIngreso;}

public String toString() {
    DateTimeFormatter Formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String FechaconFormato = FechaIngreso.format(Formato);
    
    return Cuil + "//" + FechaconFormato+"//";
}

public void MostrarInformacion() {System.out.println("...::::Informacion del Profesor::::...");
System.out.println("Nombre en mayuscula: "+ getNombre().toUpperCase());
System.out.println("Apellido en mayuscula: "+getApellido().toUpperCase());
System.out.println("Documento: "+getCuil());
System.out.println("...::::Informacion del Profesor::::...");}

public void MostrarInformacionCompleta() {
    System.out.println("...::::Información del Profesor-COMPLETA ::::...");
    System.out.println("Documento: " + getDocumento());
    System.out.println("Apellido: " + getApellido());
    System.out.println("Nombre: " + getNombre());
    System.out.println("Fecha de Nacimiento: " + getFechaNacimiento());
    System.out.println("Domicilio: " + getDomicilio());
    System.out.println("Teléfono: " + getTelefono());
    System.out.println("Correo: " + getCorreo());
    System.out.println("Cuil: " + Cuil);
    System.out.println("Fecha de Ingreso: " + FechaIngreso);
    System.out.println("...::::Información del Profesor-Completa::::...");
}

    @Override
public boolean equals(Object obj) {
    if (this == obj){return true;} 
    if (!(obj instanceof Persona)) {return false;}

        Profesor aux = (Profesor) obj;
        
        if (this.Cuil != null && this.Cuil.equals(aux.Cuil) &&
        	this.FechaIngreso != null && this.FechaIngreso.equals(aux.FechaIngreso)) 
        return true;
        else
        return false;
    }











}