package com.mycompany.estadistica;
import java.util.ArrayList;
import java.util.Scanner;

public class Estadistica {

    public static void main(String[] args) {
        //Variables
        String nombre;
        int num, semestre;
        float nota;
        //Lee los datos solicitados
        Scanner leer = new Scanner(System.in);
        ArrayList estudiante = new ArrayList<>();
        System.out.print("Ingrese el nombre del Curso: ");
        nombre = leer.next();
        System.out.print("Ingrese el numero de estudiantes matriculados en "+nombre+": ");
        num = leer.nextInt();
        System.out.println("Informacion recibida!");
        
        //Ingreso de notas y semestre 
        for(int i=0; i<num; i++){
            System.out.print("Ingrese la nota del estudiante "+(i+1)+": ");
            nota = leer.nextFloat();
            System.out.print("Semestre del estudiante "+(i+1)+": ");
            semestre = leer.nextInt();
            Estudiante student = new Estudiante(nota, semestre);
            estudiante.add(student);
        }
        System.out.println("Informacion recibida!");
        //Objeto Curso
        Curso curso  = new Curso(nombre, estudiante);
        float notaProm = curso.notaPromedio();
        int aprobados = curso.aprobados();
        int reprobados = curso.reprobados();
        int semestreProm = curso.modaSemestre();
        //Imprimir
        System.out.println("-------------------------------------");
        System.out.println("Nota promedio del curso: "+notaProm);
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Reprobados: "+reprobados);
        System.out.println("Semestre Promedio: "+semestreProm);
    }
}
