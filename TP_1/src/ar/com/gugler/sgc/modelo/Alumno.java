package ar.com.gugler.sgc.modelo;
import java.time.LocalDate;

public class Alumno extends Persona {
String Legajo;

public Alumno(String legajo,String Documento, String Nombre, String Apellido, LocalDate FechaIngreso,
String Domicilio,String Telefono, String Correo){    
    super(Documento,Nombre,Apellido, FechaIngreso ,Domicilio,Telefono,Correo);
    this.Legajo = legajo;
}

public String getLegajo(){return Legajo;}
public void setLegajo(String legajo){this.Legajo =legajo;}

@Override
public String toString() {return Legajo;}

@Override
public String MostrarInformacion(){return Nombre+"/"+Apellido+"/"+Documento;}

@Override
public boolean equals(Object obj) {
    if (this == obj){return true;} 
    if (!(obj instanceof Alumno)) {return false;}

        Alumno aux = (Alumno) obj;
        
        if (this.Legajo !=null && this.Legajo.equals(aux.Legajo) );{return true;}
    }

}

