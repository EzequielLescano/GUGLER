package ar.com.gugler.sgc.modelo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Persona {
    private String Documento;
    private String Apellido;
    private String Nombre;
    private LocalDate FechaNacimiento;
    private String Domicilio;
    private String Telefono;
    private String Correo;
    
    public Persona(String Documento,String Apellido,String Nombre,LocalDate FechaNacimiento,String Domicilio,String Telefono,String Correo) {
    	this.Documento = Documento;
    	this.Apellido = Apellido;
    	this.Nombre = Nombre;
    	this.FechaNacimiento = FechaNacimiento;
    	this.Domicilio = Domicilio;
    	this.Telefono = Telefono;
    	this.Correo = Correo;
    }
    
    public String getDocumento(){return Documento;}
    public void setDocumento(String Documento){this.Documento = Documento;}
    public String getApellido(){return Apellido;}
    public void setApellido(String Apellido){this.Apellido = Apellido;}
    public String getNombre(){return Nombre;}
    public void setNombre(String Nombre){this.Nombre = Nombre;}
    public LocalDate getFechaNacimiento(){return FechaNacimiento;}
    public void setFechaNacimiento(LocalDate FechaNacimiento){this.FechaNacimiento = FechaNacimiento;}
    public String getDomicilio(){return Domicilio;}
    public void setDomicilio (String Domicilio){this.Domicilio = Domicilio;}
    public String getTelefono(){return Telefono;}
    public void setTelefono(String Telefono){this.Telefono = Telefono;}
    public String getCorreo(){return Correo;}
    public void setCorreo(String Correo){this.Correo = Correo;}
    
    
@Override
public String toString() {
	DateTimeFormatter Formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String FechaconFormato = FechaNacimiento.format(Formato);
    
	return Documento+"//"+Apellido+"//"+Nombre+"//"+FechaconFormato+"//"+Domicilio+"//"+Telefono+"//"+Correo;}


@Override
public boolean equals(Object obj) {
    if (this == obj){return true;} 
    if (!(obj instanceof Persona)) {return false;}

        Persona aux = (Persona) obj;
        
        if (this.Documento != null && this.Nombre!=null && this.Apellido != null && this.FechaNacimiento !=null
        && this.Domicilio !=null && this.Telefono != null && this.Correo!= null && 
        this.Documento.equals(aux.Documento) && this.Nombre.equals(aux.Nombre) && this.Apellido.equals(aux.Apellido)
        && this.FechaNacimiento.equals(aux.FechaNacimiento)&& this.Domicilio.equals(aux.Domicilio)&&
        this.Telefono.equals(aux.Telefono)&& this.Correo.equals(aux.Correo)) 
        return true;
        else
        return false;
    }


















}

