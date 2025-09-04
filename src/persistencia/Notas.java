
package persistencia;

public class Notas {
    private int parcial1;
    private int parcial2;
    private int parcial3;
    private int promedio;
    
public Notas(int parcial1, int parcial2, int parcial3){
    this.parcial1 = parcial1;
    this.parcial2 = parcial2;
    this.parcial3 = parcial3;
    }

    public void setParcial1(int parcial1) {
        this.parcial1 = parcial1;
    }

    public void setParcial2(int parcial2) {
        this.parcial2 = parcial2;
    }

    public void setParcial3(int parcial3) {
        this.parcial3 = parcial3;
    }

    public int getPromedio() {
        return promedio;
    }
public void calculatPromedio(){
    this.promedio=(this.parcial1*this.parcial2*this.parcial3)/3;
    
}
}
