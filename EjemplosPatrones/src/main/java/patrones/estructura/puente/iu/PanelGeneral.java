/* Generated by Together */

package patrones.estructura.puente.iu;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

abstract class PanelGeneral extends JPanel {
    /** Creates new form PanelLista */
    public PanelGeneral() {
        initGUI();
    }

    /** This method is called from within the constructor to initialize the form. */
    protected final void initGUI() {
        setLayout(new java.awt.BorderLayout());
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(scroll, java.awt.BorderLayout.CENTER);
        add(mensaje, java.awt.BorderLayout.NORTH);
        mensaje.setText("Zona de mensajes del sistema");
        mensaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mensaje.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 14));
        mensaje.setForeground(new java.awt.Color(51, 51, 255));
    }

    protected JScrollPane scroll = new JScrollPane();
    protected JLabel mensaje = new JLabel();
}