package lab8p2_alberthgodoy;

import javax.swing.JProgressBar;

/**
 *
 * @author godoy
 */
public class progressBar extends Thread{
    private boolean vive;
    private boolean avanzar;
    private JProgressBar jProgressBar;

    public progressBar(JProgressBar jProgressBar) {
        this.jProgressBar = jProgressBar;
        this.vive = true;
        this.avanzar = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getjProgressBar() {
        return jProgressBar;
    }

    public void setjProgressBar(JProgressBar jProgressBar) {
        this.jProgressBar = jProgressBar;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    @Override
    public String toString() {
        return "progressBar{" + "vive=" + vive + ", jProgressBar=" + jProgressBar + '}';
    }
    
      @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                jProgressBar.setValue(jProgressBar.getValue() + 1);
 
                jProgressBar.setString(Integer.toString(jProgressBar.getValue()));

            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
            }
        }

    }
    
    
}
