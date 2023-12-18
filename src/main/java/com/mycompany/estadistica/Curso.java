package com.mycompany.estadistica;
import java.util.ArrayList;

public class Curso {
    // ATRIBUTOS
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    private int notaProm;
    private int aprobados;
    private int reprobados;
    private int semestreProm;

    public Curso(String nombre, ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
        this.nombre = nombre;
        this.notaProm = notaProm;
        this.aprobados = aprobados;
        this.reprobados = reprobados;
        this.semestreProm = semestreProm;
    }

    public float notaPromedio() {
        float sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        return sumaNotas / estudiantes.size();
    }
    
    public int aprobados(){
        int aprobados = 0;
        for(Estudiante estudiante : estudiantes){
            if(estudiante.getNota()>=14){
                aprobados++;
            }
        }
        return aprobados;
    }
    
   public int reprobados() {
    int reprobados = 0;
    for (Estudiante estudiante : estudiantes) {
        if (estudiante.getNota() < 14) {
            reprobados++;
        }
    }
    return reprobados;
    }
   
   public int modaSemestre(){
       int[] frecSemestre = new int[8];
    //Se cuenta 
    for(Estudiante estudiante : estudiantes){
        int semestreCursado  = estudiante.getSemestre();
        frecSemestre[semestreCursado]++;
    }
    int moda = 0;
    int maxSemestre = 0;
    for(int i=1; i<frecSemestre.length; i++){
        if(frecSemestre[i] > maxSemestre){
            moda = i;
            maxSemestre = frecSemestre[i];
        }
    }
    return moda;
   }
  
}
