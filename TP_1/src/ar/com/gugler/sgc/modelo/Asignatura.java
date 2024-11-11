package ar.com.gugler.sgc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Asignatura{
    Integer Codigo;
    String Nombre;
    List<Alumno> Alumno_;
    Profesor Profesor_;
    
    

    public Asignatura(Integer Codigo,String Nombre, Alumno Alumno_,Profesor Profesor_){
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Alumno_ = new ArrayList<>();
        this.Profesor_ = Profesor_;
    }

    public Integer getCodigo(){return Codigo;}
    public void setCodigo(Integer Codigo){this.Codigo = Codigo;}

    @Override
    public String toString() {return String.valueOf(Codigo)+"/"+Nombre+"/"+String.valueOf(Alumno_)+String.valueOf(Profesor_);}

    @Override
    public boolean equals(Object obj) {
        if (this == obj){return true;} 
        if (!(obj instanceof Asignatura)) {return false;}

            Asignatura aux = (Asignatura) obj;
            
            if (this.Codigo != null && this.Nombre !=null && this.Alumno_ != null && this.Profesor_ != null && 
            this.Codigo.equals(aux.Codigo) && this.Nombre.equals(aux.Nombre)&&this.Alumno_.equals(aux.Alumno_)&&
            this.Profesor_.equals(aux.Profesor_));{return true;}
        }
}    
