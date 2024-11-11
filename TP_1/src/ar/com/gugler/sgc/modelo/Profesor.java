package ar.com.gugler.sgc.modelo;

import java.time.LocalDate;
import java.lang.String;

public class Profesor extends Persona {
    String Cuil;
    LocalDate FechaIngreso;

    public Profesor(String Cuil, LocalDate FechaIngreso,String Documento, String Nombre, String Apellido,String Domicilio,String Telefono, String Correo){
        super(Documento,Nombre,Apellido, FechaIngreso ,Domicilio,Telefono,Correo);
        this.Cuil = Cuil;
        this.FechaIngreso = FechaIngreso;
    }

    public String getCuil(){return Cuil;} 
    public void setCuil(String Cuil){this.Cuil=Cuil;}   
    public LocalDate getFechaIngreso(){return FechaIngreso;}
    public void setFechaIngreso(LocalDate FechaIngreso){this.FechaIngreso = FechaIngreso;}

    @Override
    public String toString() {return super.toString()+"/"+Cuil+"/"+FechaIngreso;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj){return true;} 
        if (!(obj instanceof Profesor)) {return false;}

            Profesor aux = (Profesor) obj;
            
            if (this.Nombre != null && this.Nombre.equals(aux.Nombre) &&
            this.Apellido != null && this.Apellido.equals(aux.Apellido) &&
            this.Cuil != null && this.Cuil.equals(aux.Cuil));{return true;}
        }

    @Override
    public String MostrarInformacion(){return Nombre.toUpperCase()+"/"+Apellido.toUpperCase()+"/"+Cuil;}
       
}       

