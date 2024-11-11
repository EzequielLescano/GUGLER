package ar.com.gugler.sgc.modelo;

import java.util.List;
import java.util.ArrayList;

public class Curso extends Asignatura{
Integer Cupo;

public Curso(Integer Cupo, Integer Codigo, String Nombre, 
		List<Alumno>Alumno_, Profesor Profesor_) {
	
	this.Cupo = Cupo;	
	super(Codigo,Nombre,Alumno_,Profesor_);

}

public Integer getCupo(){return Cupo;}
public void setCupo(Integer Cupo){this.Cupo = Cupo;}

@Override
public String toString() {return String.valueOf(Cupo);}

@Override
public boolean equals(Object obj) {
    if (this == obj){return true;} 
    if (!(obj instanceof Curso)) {return false;}

        Curso aux = (Curso) obj;
        
        if (this.Cupo != null && this.Cupo.equals(aux.Cupo)  );{return true;}
    }

}

