package ar.com.gugler.sgc.modelo;
import java.util.ArrayList;
import java.util.List;

public class Asignatura {
	private Integer Codigo;
	private String Nombre;
	private List<Alumno> Alumno_;
	private Profesor Profesor_;


public Asignatura(Integer Codigo,String Nombre,Alumno Alumno_,Profesor Profesor_) {
	this.Codigo = Codigo;
	this.Nombre = Nombre;
	this.Alumno_ = new ArrayList<>();
	this.Profesor_ = Profesor_;
	
}


public Integer getCodigo(){return Codigo;}
public void setCodigo(Integer Codigo){this.Codigo = Codigo;}
public String getNombre(){return Nombre;}
public void setNombre(String Nombre){this.Nombre = Nombre;}
public List<Alumno> getAlumnos(){return Alumno_;}
public void setAlumno(List<Alumno> Alumno_){this.Alumno_ = Alumno_;}
public Profesor getLegajo(){return Profesor_;}
public void setLegajo(Profesor Profesor_){this.Profesor_ = Profesor_;}



public String toString() {return String.valueOf(Codigo)+"//"+Nombre+"//"+Alumno_.toString()+"//"+Profesor_.toString();}

@Override
public boolean equals(Object obj) {
    if (this == obj){return true;} 
    if (!(obj instanceof Persona)) {return false;}

        Asignatura aux = (Asignatura) obj;
        
        if (this.Codigo != null && this.Nombre != null && this.Alumno_ != null && this.Profesor_ != null &&
        	this.Codigo.equals(aux.Codigo) && this.Nombre.equals(aux.Nombre) && this.Alumno_.equals(aux.Alumno_) && 
        	this.Profesor_.equals(aux.Profesor_))
        return true;
        else
        return false;
    }





}
