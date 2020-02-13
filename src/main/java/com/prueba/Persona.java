package com.prueba;

public class Persona {
    private String mi_nombre;
    private int mi_matricula;

    Persona(String nombre,int matricula){
        mi_nombre=nombre;
        mi_matricula=matricula;
    }

    String Getnombre(){
        return mi_nombre;
    }

    int Getmatricula(){
        return mi_matricula;
    }
}
