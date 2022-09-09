package lab8p2_alberthgodoy;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author godoy
 */
public class administradorUniversos {
    private ArrayList<Universos> adminUniversos = new ArrayList();
    private ArrayList<seresVivos> adminserVivo = new ArrayList();
     private File archivo;

    public administradorUniversos(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Universos> getAdminUniversos() {
        return adminUniversos;
    }

    public void setAdminUniversos(ArrayList<Universos> adminUniversos) {
        this.adminUniversos = adminUniversos;
    }

    public ArrayList<seresVivos> getAdminserVivo() {
        return adminserVivo;
    }

    public void setAdminserVivo(ArrayList<seresVivos> adminserVivo) {
        this.adminserVivo = adminserVivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administradorUniversos{" + "adminUniversos=" + adminUniversos + ", adminserVivo=" + adminserVivo + ", archivo=" + archivo + '}';
    }
    
    public void cargarArchivoSolistas() {
        try {
            adminUniversos = new ArrayList();
            Universos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Universos) objeto.readObject()) != null) {
                        System.out.println(temp);
                        adminUniversos.add(temp);

                    }
                } catch (EOFException e) {
                    System.err.printf(String.format("Hubo un error %s%n", e));
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     
}
