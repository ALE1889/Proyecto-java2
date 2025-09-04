package presentacion;

import java.util.Scanner;
import persistencia.Estudiante;

public class Colegio {
    public static void main(String[] args) {
        Scanner objEs=new Scanner(System.in);
        String nombre="", matricula="";
        int calP1=0;
        System.out.print("Escribe la matricula:");
        matricula=objEs.nextLine();
        System.out.print("Escribe el nombre del estudiante:");
        nombre=objEs.nextLine();
        System.out.print("Escribe la calificación del parcial 1:");
        calP1=objEs.nextInt();
        
        Estudiante objE=new Estudiante(matricula,nombre, calP1,7,7);
        System.out.println("El estudiante "+objE.getNombre()+" tiene como promedio inicial:"+objE.getObjNotas().getPromedio());
        
        objE.getObjNotas().setParcial1(10);
        objE.getObjNotas().setParcial2(10);
        objE.getObjNotas().setParcial3(10);
        System.out.println("El estudiante "+objE.getNombre()+" tiene como promedio final:"+objE.getObjNotas().getPromedio());
    }
    
}
