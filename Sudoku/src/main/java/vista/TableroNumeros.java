package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TableroNumeros extends JPanel {
    
    //atributos txt
    private int txtAncho;
    private int txtAlto;
    private int txtMargen;
    private int txtTamañoLetra;
    
    //colores de los txt del tablero
    private Color panelBackground; //color del fondo
    private Color txtBackground1; //color inicial
    private Color txtForeground1;
    private Color txtBackground2; //color al pasar por encima
    private Color txtForeground2;

    private TableroSudoku tableroSudoku;

    public TableroNumeros() {
        iniciarComponentes();
        tableroSudoku = FromSudoku.tableroSudoku;
    }

    private void iniciarComponentes() {
        txtAncho = 1;
        txtAlto = 1;
        txtMargen = 1;
        txtTamañoLetra = 1;

        panelBackground = Color.black;
        txtBackground1 = Color.white;
        txtForeground1 = Color.black;
        txtBackground2 = Color.white;
        txtForeground2 = Color.black;
    }

    public void crearTablero() { //crea el tablero numeros
        this.setLayout(null);
        this.setSize((txtAncho * 3) + (txtMargen * 2), (txtAlto * 3) + (txtMargen * 2));
        this.setBackground(panelBackground);
        crearCamposTxt();
    }

    public void crearCamposTxt() { // crea los txt para los botones del tablero
        
        this.setLayout(null);
        int totalWidth = txtAncho * 3 + txtMargen * 4;
        int totalHeight = txtAlto * 3 + txtMargen * 4;
        this.setSize(totalWidth, totalHeight);
        this.setBackground(panelBackground);

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = i * 3 + j + 1;              // número 1..9
                JTextField txt = new JTextField(String.valueOf(valor), JTextField.CENTER);

               
                int x = txtMargen + j * (txtAncho + txtMargen);
                int y = txtMargen + i * (txtAlto + txtMargen);
                txt.setBounds(x, y, txtAncho, txtAlto);

                
                txt.setBackground(txtBackground1);
                txt.setForeground(txtForeground1);
                txt.setFont(new Font("Comic Sans MS", Font.BOLD, txtTamañoLetra));
                txt.setEditable(false);
                txt.setBorder(BorderFactory.createLineBorder(Color.black, 1));
                this.setCursor(new Cursor(Cursor.HAND_CURSOR));
                
                txt.setHorizontalAlignment(JTextField.CENTER);

                
                
                generarEventosTxt(txt);

                
                this.add(txt);
            }
        }
    }

    public void generarEventosTxt(JTextField txt) {
        MouseListener evento = new MouseListener() { //eventos del mouse
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) { //ingresa el numero precionado
                if (tableroSudoku.txtGenerado(tableroSudoku.getTxtSelected())) {
                    return;
                }
                
                String valor = txt.getText();
                tableroSudoku.setTxtSelectedText(valor);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) { //cambia el color al entrar
                txt.setBackground(txtBackground2);
                txt.setForeground(txtForeground2);
            }

            @Override
            public void mouseExited(MouseEvent e) { //cambia el color al salir
                txt.setBackground(txtBackground1);
                txt.setForeground(txtForeground1);
            }
        };
        txt.addMouseListener(evento);
    }
    


    public int getTxtAncho() {
        return txtAncho;
    }

    public void setTxtAncho(int txtAncho) {
        this.txtAncho = txtAncho;
    }

    public int getTxtAlto() {
        return txtAlto;
    }

    public void setTxtAlto(int txtAlto) {
        this.txtAlto = txtAlto;
    }

    public int getTxtMargen() {
        return txtMargen;
    }

    public void setTxtMargen(int txtMargen) {
        this.txtMargen = txtMargen;
    }

    public int getTxtTamañoLetra() {
        return txtTamañoLetra;
    }

    public void setTxtTamañoLetra(int txtTamañoLetra) {
        this.txtTamañoLetra = txtTamañoLetra;
    }

    public Color getPanelBackground() {
        return panelBackground;
    }

    public void setPanelBackground(Color panelBackground) {
        this.panelBackground = panelBackground;
    }

    public Color getTxtBackground1() {
        return txtBackground1;
    }

    public void setTxtBackground1(Color txtBackground1) {
        this.txtBackground1 = txtBackground1;
    }

    public Color getTxtForeground1() {
        return txtForeground1;
    }

    public void setTxtForeground1(Color txtForeground1) {
        this.txtForeground1 = txtForeground1;
    }

    public Color getTxtBackground2() {
        return txtBackground2;
    }

    public void setTxtBackground2(Color txtBackground2) {
        this.txtBackground2 = txtBackground2;
    }

    public Color getTxtForeground2() {
        return txtForeground2;
    }

    public void setTxtForeground2(Color txtForeground2) {
        this.txtForeground2 = txtForeground2;
    }

}
