package lab8p2_alberthgodoy;

import java.io.Serializable;

/**
 *
 * @author godoy
 */
public class seresVivos implements Serializable{
    private String nombre;
    private String iD;
    private int poderEscala;
    private int age;
    private String procedencia;
    private String raza;

    public seresVivos(String nombre, String iD, int poderEscala, int age, String procedencia, String raza) {
        this.nombre = nombre;
        this.iD = iD;
        this.poderEscala = poderEscala;
        this.age = age;
        this.procedencia = procedencia;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public int getPoderEscala() {
        return poderEscala;
    }

    public void setPoderEscala(int poderEscala) {
        this.poderEscala = poderEscala;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return String.format("Ser Vivo: %s%n", nombre);
    }
    
    
    
}
