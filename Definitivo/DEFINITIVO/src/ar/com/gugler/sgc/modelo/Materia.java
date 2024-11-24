package ar.com.gugler.sgc.modelo;

public class Materia {
	private Integer Anios;
	
	
	
public Materia(Integer Anios) {
	this.Anios = Anios;
}

public Integer getAnios(){return Anios;}
public void setAnios(Integer Anios){this.Anios = Anios;}

public String toString() {return Anios+"//";}





@Override
public boolean equals(Object obj) {
    if (this == obj){return true;} 
    if (!(obj instanceof Persona)) {return false;}

        Materia aux = (Materia) obj;
        
        if (this.Anios != null && this.Anios.equals(aux.Anios))
        return true;
        else
        return false;
    }






}
