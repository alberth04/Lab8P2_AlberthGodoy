package lab8p2_alberthgodoy;

import javax.swing.JProgressBar;

/**
 *
 * @author godoy
 */
public class progressBar {
    private boolean vive;
    private JProgressBar jProgressBar;

    public progressBar(JProgressBar jProgressBar) {
        this.jProgressBar = jProgressBar;
        this.vive = true;
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

    @Override
    public String toString() {
        return "progressBar{" + "vive=" + vive + ", jProgressBar=" + jProgressBar + '}';
    }
    
    
}
