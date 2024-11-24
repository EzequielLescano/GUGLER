package ar.com.gugler.sgc.modelo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	/* Documento/Apellido/Nombre/FechaNacimiento(Año/mes/día)/Domicilio/Telefono/Correo/Legajo */
        Alumno Alumno_1 = new Alumno("41907158", "Lescano", "Ricardo Ezequiel", LocalDate.of(1999, 8, 2),
                "Belgrano_292", "+54-3442-645120", "ezenostale@gmai.com", "AAAA00001");
        Alumno Alumno_2 = new Alumno("65748393", "Perez", "Juan", LocalDate.of(2000, 2, 15), "Callerandom",
                "+53-0800-000001", "gmailfalso@gmail.com", "AAAA00002");
        Alumno_1.MostrarInformacion();
        System.out.println("");
        Alumno_2.MostrarInformacionCompleta();
        System.out.println("");
        
        /* Documento / Apellido / Nombre / FechaNacimiento / Domicilio / Telefono / Correo /Cuil /Fecha de Ingreso */
        Profesor profesor1 = new Profesor("42018269", "González", "Mariano", LocalDate.of(1980, 6, 15),
                "Calle???", "+65-4553-756231", "correo???@gmail.com", "20-42018269-9", LocalDate.of(2010, 3, 1));
        profesor1.MostrarInformacion();
        System.out.println("");
        profesor1.MostrarInformacionCompleta();
        
        Curso curso = new Curso(101, "Programación en Java", null, profesor1, 2);

        System.out.println("Admite inscripcion (sin agragar): "+curso.admiteInscripciones()); 
         curso.agregarAlumno(Alumno_1);
        curso.agregarAlumno(Alumno_2);
        System.out.println("Admite inscripcion(agregado x2): " + curso.admiteInscripciones());
     
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        /* Documento+"//"+Apellido+"//"+Nombre+"//"+FechaconFormato+"//"+Domicilio+"//"+Telefono+"//"+Correo */
        Universidad.mostrarDatos(Alumno_1);
    
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Universidad.mostrarDatos(Alumno_2);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        Universidad.mostrarDatos(profesor1);
        
    }

	}
