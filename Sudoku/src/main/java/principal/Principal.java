package principal;

import controlador.Controlador;
import controlador.ControladorInterfaz;
import modelo.Sudoku;
import vista.FromSudoku;


public class Principal {

    public static void main(String[] args) {
        
        
        Sudoku modelo = new Sudoku();
        FromSudoku sudoku = new FromSudoku(modelo);
        Controlador controlador = new Controlador(sudoku,modelo);
        
        controlador.ejecutar();
    }
}
