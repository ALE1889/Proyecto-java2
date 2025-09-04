package persistencia;

public class Estudiante {
    private String matricula;
    private String nombre;
    private Notas objNotas;
    
    public Estudiante (String matricula, String nombre, int parcial1, int parcial2, int parcial3 ){
    this.matricula = matricula;
    this.nombre = nombre;
    this.objNotas = new Notas(parcial1, parcial2, parcial3);
}

    public Notas getObjNotas() {
        return objNotas;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }
   
}