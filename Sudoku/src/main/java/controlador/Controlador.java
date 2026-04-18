package controlador;


import vista.FromSudoku;
import modelo.Sudoku;

//martin.vargas@uda.edu.ar

public class Controlador {
    
    private FromSudoku sudoku;
    private Sudoku modelo;

    public Controlador(FromSudoku sudoku,Sudoku modelo) {
        this.modelo = modelo;
        this.sudoku = sudoku;
    }

    public void ejecutar() {
        sudoku.setVisible(true);
    }
    
    private void llamadaMetodo(int pos){
        modelo.subCuadranteActual(pos);
    }
    
    
}
