package vista;

import controlador.ControladorInterfaz;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TableroSudoku extends JPanel {

    private JTextField[][] listaTxt;  //matriz que va a almacenar los datos del sudoku
    //atributos del txt
    private int txtAncho;
    private int txtAlto;
    private int txtMargen;
    private int txtTamañoLetra;

    private Color panelBackground; //color del fondo del tablero sudoku
    
    //colores de fondo y letra del txt segun situacion
    private Color txtBackground1; //color inicial
    private Color txtForeground1;
    private Color txtBackground2; //cuadrante
    private Color txtForeground2;
    private Color txtBackground3; //txt seleccionado
    private Color txtForeground3;
    private Color txtBackground4; //filas y columnas
    private Color txtForeground4;
    private Color txtBackground5; //txt generados
    private Color txtForeground5;

    private ArrayList<JTextField> listaTxtAux;

    private ArrayList<JTextField> listaTxtGenerados;

    private final ControladorInterfaz controlador;

    private JTextField txtSelected;

    public TableroSudoku(ControladorInterfaz controlador) {
        this.controlador = controlador;
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        listaTxt = new JTextField[9][9];

        txtAncho = 1;
        txtAlto = 1;
        txtMargen = 1;
        txtTamañoLetra = 1;

        panelBackground = Color.BLACK;

        txtBackground1 = Color.BLACK;
        txtForeground1 = Color.BLACK;
        txtBackground2 = Color.BLACK;
        txtForeground2 = Color.BLACK;
        txtBackground3 = Color.BLACK;
        txtForeground3 = Color.BLACK;
        txtBackground4 = Color.BLACK;
        txtForeground4 = Color.BLACK;
        txtBackground5 = Color.BLACK;
        txtForeground5 = Color.BLACK;

        listaTxtAux = new ArrayList<>();//ArrayList para guardar momentaeamente el txt seleccionado y vorrar los colores al seleccionar otro
        listaTxtGenerados = new ArrayList<>();

        txtSelected = new JTextField();
    }

    public void crearSudoku() { //crea el tablero
        this.setLayout(null);
        this.setSize(txtAncho * 9 + (txtMargen * 4), txtAlto * 9 + (txtMargen * 4));
        this.setBackground(panelBackground);
        crearCamposTxt();

    }

    void crearCamposTxt() { //crea los campos txt de la matriz del tablero
        int x = txtMargen;
        int y = txtMargen;

        for (int i = 0; i < listaTxt.length; i++) {
            for (int j = 0; j < listaTxt[0].length; j++) {

                JTextField txt = new JTextField();
                this.add(txt);
                txt.setBounds(x, y, txtAncho, txtAlto);
                txt.setBackground(txtBackground1);
                txt.setForeground(txtForeground1);
                txt.setFont(new Font("Comic Sans MS", Font.BOLD, txtTamañoLetra));
                txt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                txt.setHorizontalAlignment(JTextField.CENTER);

                
                txt.setEditable(false);
                txt.setCursor(new Cursor(Cursor.HAND_CURSOR));

                txt.setVisible(true);
                x += txtAncho;
                if ((j + 1) % 3 == 0) {
                    x += txtMargen;
                }
                listaTxt[i][j] = txt;
                generarEventos(txt);
            }
            x = txtMargen;
            y += txtAlto;
            if ((i + 1) % 3 == 0) {
                y += txtMargen;
            }
        }
    }

    public void generarEventos(JTextField txt) {
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) { //acciones al precionar un txt
                pressed(txt);
                txtSelected = txt;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        };

        KeyListener eventoTecla = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) { //permite ingresar numeros por teclado del 1 al 9
                if (txtGenerado(txt)) {
                    return;
                } else {
                    if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                        txt.setText("");
                    }

                    if (e.getKeyChar() >= 49 && e.getKeyChar() <= 57) {
                        txt.setText(String.valueOf(e.getKeyChar()));
                    }
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };

        txt.addMouseListener(evento);
        txt.addKeyListener(eventoTecla);
    }

    public void pressed(JTextField txt) { //pinta el txt seleccionado ademas del cuadrante, filas y columnas

        for (JTextField jTxt : listaTxtAux) { //regresa los txt a los valores originales
            jTxt.setBackground(txtBackground1);
            jTxt.setForeground(txtForeground1);
            jTxt.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        }
        listaTxtAux.clear();

        for (JTextField jTxt : listaTxtGenerados) {
            jTxt.setBackground(txtBackground5);
            jTxt.setForeground(txtForeground5);
        }

        for (int i = 0; i < listaTxt.length; i++) {
            for (int j = 0; j < listaTxt[0].length; j++) {
                if (listaTxt[i][j] == txt) {
                    for (int k = 0; k < listaTxt.length; k++) {
                        listaTxt[k][j].setBackground(txtBackground4);
                        listaTxt[k][j].setForeground(txtForeground4);
                        listaTxtAux.add(listaTxt[k][j]);
                    }
                    for (int k = 0; k < listaTxt[0].length; k++) {
                        listaTxt[i][k].setBackground(txtBackground4);
                        listaTxt[i][k].setForeground(txtForeground4);
                        listaTxtAux.add(listaTxt[i][k]);
                    }

                    int posI = controlador.subCuadranteActual(i);
                    int posJ = controlador.subCuadranteActual(j);
                    for (int k = posI - 3; k < posI; k++) {
                        for (int l = posJ - 3; l < posJ; l++) {
                            listaTxt[k][l].setBackground(txtBackground2);
                            listaTxt[k][l].setForeground(txtForeground2);
                            listaTxtAux.add(listaTxt[k][l]);
                        }
                    }

                    listaTxt[i][j].setBackground(txtBackground3);
                    listaTxt[i][j].setForeground(txtForeground3);
                    listaTxt[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                    return;
                }
            }
        }
    }

    public void generarSudoku(int nivel) { //genera el sudoku con el metodo de la clase sudoku
        limpiarTxt();
        controlador.generarSudoku(nivel);
        int[][] sudokuGenerado = controlador.getSudoku();
        for (int i = 0; i < listaTxt.length; i++) {
            for (int j = 0; j < listaTxt[0].length; j++) {
                if (sudokuGenerado[i][j] != 0) {
                    listaTxt[i][j].setText(String.valueOf(sudokuGenerado[i][j]));
                    listaTxt[i][j].setBackground(txtBackground5);
                    listaTxt[i][j].setForeground(txtForeground5);
                    listaTxtGenerados.add(listaTxt[i][j]);
                }
            }
        }
    }

    public void limpiarTxt() { //limpia los campos txt
        for (int i = 0; i < listaTxt.length; i++) {
            for (int j = 0; j < listaTxt[0].length; j++) {
                listaTxt[i][j].setText("");
                listaTxt[i][j].setBackground(txtBackground1);
                listaTxt[i][j].setForeground(txtForeground1);
                listaTxt[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
            }
        }
        listaTxtGenerados.clear();
    }

    public boolean crearSudokuPersonalizado() {  //funcion del boton crear, para crear sudoku personalizado
        controlador.limpiarSudoku();

        for (int i = 0; i < listaTxt.length; i++) {
            for (int j = 0; j < listaTxt[0].length; j++) {
                // Obtengo el texto y le quito espacios sobrantes
                String texto = listaTxt[i][j].getText().trim();

                // Si la celda tiene algún número, la parseo y valido
                if (!texto.isEmpty()) {
                    int num;
                    try {
                        num = Integer.parseInt(texto);
                    } catch (NumberFormatException ex) {
                        limpiarTxt();
                        JOptionPane.showMessageDialog(
                                null,
                                "Formato inválido en la casilla [" + i + "][" + j + "]: “" + texto + "”",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return false;
                    }

                    // Validaciones de fila, columna y cuadrante
                    if (controlador.validarFila(i, num)
                            && controlador.validarColumna(j, num)
                            && controlador.validarCuadrante(i, j, num)) {

                        controlador.getSudoku()[i][j] = num;
                        listaTxt[i][j].setBackground(txtBackground5);
                        listaTxt[i][j].setForeground(txtForeground5);
                        listaTxt[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                        listaTxtGenerados.add(listaTxt[i][j]);

                    } else {
                        listaTxtGenerados.clear();
                        JOptionPane.showMessageDialog(
                                null,
                                "¡El sudoku ingresado no es válido!",
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return false;
                    }

                } else {
                    // Si está vacío, lo dejo en estilo por defecto
                    listaTxt[i][j].setBackground(txtBackground1);
                    listaTxt[i][j].setForeground(txtForeground1);
                    listaTxt[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                }
            }
        }

        return true;
    }

    public boolean txtGenerado(JTextField txt) {
        for (JTextField jTxt : listaTxtGenerados) {
            if (txt == jTxt) {
                return true;
            }
        }
        return false;
    }

    public void limpiarSudoku() { //funcion del boton limpiar, limpia todos los txt ingresados por el usuario
        for (int i = 0; i < listaTxt.length; i++) {
            for (int j = 0; j < listaTxt[0].length; j++) {
                boolean f = false;
                for (JTextField txt : listaTxtGenerados) {
                    if (listaTxt[i][j] == txt) {
                        f = true;
                        break;
                    }
                }
                if (f == false) {
                    listaTxt[i][j].setText("");
                }
            }
        }
    }

    public void comprobar(){ //funcion de boton comprobar, da una validacion del sudoku
        int sudo[][] = new int [9][9];
        for (int i = 0; i < listaTxt.length; i++) {
            for (int j = 0; j < listaTxt[0].length; j++) {
                if (listaTxt[i][j].getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "¡El sudoku esta incompleto!","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }else{
                    sudo[i][j]=Integer.parseInt( listaTxt[i][j].getText() );
                    
                }
            }
        }
        controlador.setSudoku(sudo);
        if (controlador.comprobarSudoku()) {
            JOptionPane.showMessageDialog(null, "¡El sudoku fue resuelto correctamente!","Sudoku",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            JOptionPane.showMessageDialog(null, "¡No hay solucion!","Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    public void resolver(){ //resuelve el sudoku
        controlador.limpiarSudoku();
        for (int i = 0; i < listaTxt.length; i++) {
            for (int j = 0; j < listaTxt[0].length; j++) {
                for (JTextField txt : listaTxtGenerados) {
                    if (txt == listaTxt[i][j]) {
                        controlador.getSudoku()[i][j]=Integer.parseInt(txt.getText());
                    }
                }
            }
        }
        if (controlador.resolverSudoku()) {
            for (int i = 0; i < listaTxt.length; i++) {
                for (int j = 0; j < listaTxt[0].length; j++) {
                    listaTxt[i][j].setText(String.valueOf(controlador.getSudoku()[i][j]));
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"¡No hay solucion!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Color getTxtBackground4() {
        return txtBackground4;
    }

    public void setTxtBackground4(Color txtBackground4) {
        this.txtBackground4 = txtBackground4;
    }

    public Color getTxtForeground4() {
        return txtForeground4;
    }

    public void setTxtForeground4(Color txtForeground4) {
        this.txtForeground4 = txtForeground4;
    }

    public Color getTxtBackground5() {
        return txtBackground5;
    }

    public void setTxtBackground5(Color txtBackground5) {
        this.txtBackground5 = txtBackground5;
    }

    public Color getTxtForeground5() {
        return txtForeground5;
    }

    public void setTxtForeground5(Color txtForeground5) {
        this.txtForeground5 = txtForeground5;
    }

    public JTextField[][] getListaTxt() {
        return listaTxt;
    }

    public void setListaTxt(JTextField[][] listaTxt) {
        this.listaTxt = listaTxt;
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

    public Color getTxtBackground3() {
        return txtBackground3;
    }

    public void setTxtBackground3(Color txtBackground3) {
        this.txtBackground3 = txtBackground3;
    }

    public Color getTxtForeground3() {
        return txtForeground3;
    }

    public void setTxtForeground3(Color txtForeground3) {
        this.txtForeground3 = txtForeground3;
    }

    public JTextField getTxtSelected() {
        return txtSelected;
    }

    public void setTxtSelectedText(String texto) {
        if (txtSelected != null) {
            txtSelected.setText(texto);
        }
    }
}
