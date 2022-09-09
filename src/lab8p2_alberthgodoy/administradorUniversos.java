package lab8p2_alberthgodoy;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author godoy
 */
public class administradorUniversos {

    private ArrayList<Universos> adminUniversos = new ArrayList();
    private ArrayList<seresVivos> adminserVivo = new ArrayList();
    private ArrayList<Universos> adminUniversosIndividual = new ArrayList();
    private ArrayList<seresVivos> adminserVivoIndividual = new ArrayList();
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

    public ArrayList<Universos> getAdminUniversosIndividual() {
        return adminUniversosIndividual;
    }

    public void setAdminUniversosIndividual(ArrayList<Universos> adminUniversosIndividual) {
        this.adminUniversosIndividual = adminUniversosIndividual;
    }

    public ArrayList<seresVivos> getAdminserVivoIndividual() {
        return adminserVivoIndividual;
    }

    public void setAdminserVivoIndividual(ArrayList<seresVivos> adminserVivoIndividual) {
        this.adminserVivoIndividual = adminserVivoIndividual;
    }
    
    

    @Override
    public String toString() {
        return "administradorUniversos{" + "adminUniversos=" + adminUniversos + ", adminserVivo=" + adminserVivo + ", archivo=" + archivo + '}';
    }

    public void cargarArchivoUniverso() {
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
                    System.err.printf(String.format("Se encontro un fin de linea", e));
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivoUniversos() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Universos t : adminUniversos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    public void cargarArchivoSerVivo() {
        try {
            adminserVivo = new ArrayList();
            seresVivos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (seresVivos) objeto.readObject()) != null) {
                        System.out.println(temp);
                        adminserVivo.add(temp);

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

    public void escribirArchivoserVivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (seresVivos t : adminserVivo) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    public void cargarArchivoUniversoIndividual() {
        try {
            adminUniversosIndividual = new ArrayList();
            Universos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Universos) objeto.readObject()) != null) {
                        System.out.println(temp);
                        adminUniversosIndividual.add(temp);

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

    public void escribirArchivoUniversoIndividual() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Universos t : adminUniversosIndividual) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
                adminUniversosIndividual = new ArrayList();

            } catch (Exception ex) {
            }
        }
    }

    public void cargarArchivoSerVivoIndividual() {
        try {
            adminserVivoIndividual = new ArrayList();
            seresVivos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (seresVivos) objeto.readObject()) != null) {
                        System.out.println(temp);
                        adminserVivoIndividual.add(temp);

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
    
    public void escribirArchivoserVivoIndividual() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (seresVivos t : adminserVivoIndividual) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
                adminUniversosIndividual = new ArrayList();
            } catch (Exception ex) {
            }
        }
    }
}
