package ar.com.gugler.sgc.modelo;

public class Curso extends Asignatura implements Administrable {
    private Integer Cupo;

    public Curso(Integer Codigo, String Nombre, Alumno Alumno_, Profesor Profesor_, Integer Cupo) {
        super(Codigo, Nombre, Alumno_, Profesor_);
        this.Cupo = Cupo;
    }

    public Integer getCupo() {return Cupo;}

    public void setCupo(Integer Cupo) {this.Cupo = Cupo;}

    @Override
    public String toString() {
        return super.toString() + "Cupo: " + Cupo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Curso)) return false;
        Curso aux = (Curso) obj;
        if (super.equals(obj) && this.Cupo.equals(aux.Cupo))return true;
        else 
        	return false;
    }

    public boolean agregarAlumno(Alumno Alumno) {
        if (getAlumnos().size() < this.Cupo) {
            return getAlumnos().add(Alumno);
        }
        return false;
    }

    public boolean eliminarAlumno(Alumno Alumno) {
        return getAlumnos().remove(Alumno);
    }

    @Override
    public boolean admiteInscripciones() {
        return getAlumnos().size() < this.Cupo;
    }
}
