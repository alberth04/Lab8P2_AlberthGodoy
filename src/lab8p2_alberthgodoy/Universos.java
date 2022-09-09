package lab8p2_alberthgodoy;

import java.util.ArrayList;

/**
 *
 * @author godoy
 */
public class Universos {
    private String nombre;
    private int cantSeresVivos;
    private ArrayList<seresVivos> seresVivos = new ArrayList();

    public Universos(String nombre, int cantSeresVivos) {
        this.nombre = nombre;
        this.cantSeresVivos = cantSeresVivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantSeresVivos() {
        return cantSeresVivos;
    }

    public void setCantSeresVivos(int cantSeresVivos) {
        this.cantSeresVivos = cantSeresVivos;
    }

    public ArrayList<seresVivos> getSeresVivos() {
        return seresVivos;
    }

    public void setSeresVivos(ArrayList<seresVivos> seresVivos) {
        this.seresVivos = seresVivos;
    }

    @Override
    public String toString() {
        return "Universos{" + "nombre=" + nombre + ", cantSeresVivos=" + cantSeresVivos + ", seresVivos=" + seresVivos + '}';
    }
    
    
}
