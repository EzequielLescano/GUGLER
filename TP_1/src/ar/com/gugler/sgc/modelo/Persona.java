package ar.com.gugler.sgc.modelo;
import java.time.LocalDate;

public abstract class Persona {
 String Documento;
 String Nombre;
 String Apellido;
 LocalDate FechaNacimiento;
 String Domicilio;
 String Telefono;
 String Correo;
     
 public Persona(String Documento, String Nombre, String Apellido, LocalDate FechaIngreso,String Domicilio,String Telefono, String Correo){
     this.Documento = Documento;
     this.Nombre = Nombre;
     this.Apellido = Apellido;
     this.FechaNacimiento = FechaIngreso;
     this.Telefono = Telefono;
     this.Domicilio = Domicilio;
     this.Correo = Correo;
    }
 public String getDocumento(){return Documento;}
 public void setDocumento(String Documento){this.Documento = Documento;}
 public String getNombre(){return Nombre;}
 public void setNombre(String Nombre){this.Nombre = Nombre;}
 public String getApellido(){return Apellido;}
 public void setApellido(String Apellido){this.Apellido = Apellido;}
 public LocalDate getFechaNacimiento(){return FechaNacimiento;}
 public void setFechaNacimiento(LocalDate FechaNacimiento){this.FechaNacimiento = FechaNacimiento;}
 public String getDomicilio(){return Domicilio;}
 public void setDomicilio (String Domicilio){this.Domicilio = Domicilio;}
 public String getTelefono(){return Telefono;}
 public void setTelefono(String Telefono){this.Telefono = Telefono;}
 public String getCorreo(){return Correo;}
 public void setCorreo(String Correo){this.Correo = Correo;}
 
 @Override
 public String toString() {return Documento+"/"+Nombre+"/"+Apellido+"/"+FechaNacimiento+"/"+Telefono+"/"+Domicilio+"/"+Correo;}

 
 @Override
    public boolean equals(Object obj) {
        if (this == obj){return true;} 
        if (!(obj instanceof Persona)) {return false;}

            Persona aux = (Persona) obj;
            
            if (this.Documento != null && this.Nombre!=null && this.Apellido != null && this.FechaNacimiento !=null
            && this.Domicilio !=null && this.Telefono != null && this.Correo!= null && 
            this.Documento.equals(aux.Documento) && this.Nombre.equals(aux.Nombre) && this.Apellido.equals(aux.Apellido)
            && this.FechaNacimiento.equals(aux.FechaNacimiento)&& this.Domicilio.equals(aux.Domicilio)&&
            this.Telefono.equals(aux.Telefono)&& this.Correo.equals(aux.Correo) );{return true;}
        }
 
 public abstract String MostrarInformacion();
}
