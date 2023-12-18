package com.mycompany.estadistica;

public class Estudiante {
    //Atributos
    private float nota;
    private int semestre;
    
    public Estudiante(float nota, int semestre){
        this.nota = nota;
        this.semestre = semestre;
    }
    
    //Getters
    public float getNota() {
        return nota;
    }

    public int getSemestre() {
        return semestre;
    }
    //Setters

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}
