package ar.com.gugler.sgc.modelo;

public class Materia {
Integer Anio;
    
    public Materia(Integer Anio){
        this.Anio = Anio;
    }

    public Integer getAnio(){return Anio;}
    public void setAnio(Integer Anio){this.Anio = Anio;}
    
    @Override
    public String toString() {return String.valueOf(Anio);}

    @Override
    public boolean equals(Object obj) {
        if (this == obj){return true;} 
        if (!(obj instanceof Materia)) {return false;}

            Materia aux = (Materia) obj;
            
            if (this.Anio != null && this.Anio.equals(aux.Anio)  );{return true;}
        }
}



