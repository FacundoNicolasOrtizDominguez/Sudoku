package modelo;

import controlador.ControladorInterfaz;
import java.util.Random;


public class Sudoku implements ControladorInterfaz{
    private int sudoku[][];
    
    public Sudoku(){
        sudoku = new int[9][9];
        limpiarSudoku();
    }
    
    @Override
    public boolean resolverSudoku(){ //resuelve el sudoku verificando fila, columna y cuadrante
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                if (sudoku[i][j]==0) {
                    for (int valor = 1; valor <= 9; valor++) {
                        if (validarFila(i,valor)&&validarColumna(j,valor)&&validarCuadrante(i,j,valor)) {
                            sudoku[i][j]=valor;
                            if (resolverSudoku()) return true;
                            sudoku[i][j]=0;
                            
                        }
                    }return false;
                }
            }
        }return true;
    }
    
    @Override
    public boolean validarFila(int i, int valor){ // verifica que no se repita el numero en la fila
        for (int j = 0; j < sudoku[i].length; j++) {
            if (sudoku[i][j]==valor) {
                return false;
            }
        }return true;
    }
    
    @Override
    public boolean validarColumna(int j, int valor){ //verifica que no se repita el numero en la columna
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][j]==valor) {
                return false;
            }
        }return true;
    }
    
    @Override
    public boolean validarCuadrante(int i, int j, int valor){ // verifica que no se repita el numero en el cuadrante
        int posI = subCuadranteActual(i);
        int posJ = subCuadranteActual(j);
        
        for (int k = posI-3; k < posI; k++) {
            for (int l = posJ-3; l < posJ; l++) {
                if (sudoku[k][l]==valor) {
                    return false;
                }
            }
        }return true;
        
    }
    
    @Override
    public int subCuadranteActual(int pos){ // te da la posicion del cuadrante actual
        if (pos<=2) return 3;
            
        else if (pos<=5) return 6;
        
        else return 9; 
  
    }
    
    @Override
    public void limpiarSudoku(){ //limpia las posiciones del sudoku
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                sudoku[i][j] = 0;
            }
        }
    }
    
    public void generarSudoku(int nivel){ //genera el sudoku segun el nivel de dificultad
        limpiarSudoku();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = random.nextInt(9)+1;
                if (validarCuadrante(i,j,num)) {
                    sudoku[i][j] = num;
                }else{
                    j--;
                }
            }
        }
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                int num = random.nextInt(9)+1;
                if (validarCuadrante(i,j,num)) {
                    sudoku[i][j] = num;
                }else{
                    j--;
                }
            }
        }
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                int num = random.nextInt(9)+1;
                if (validarCuadrante(i,j,num)) {
                    sudoku[i][j] = num;
                }else{
                    j--;
                }
            }
        }
        resolverSudoku();
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                int aux = j;
                int rand = random.nextInt(nivel+1);
                j+=rand;
                for (int k = aux; k < j && k<sudoku.length; k++) {
                    sudoku[i][k] = 0;
                }
            }
        }
    }
    
    @Override
    public boolean comprobarSudoku(){ //verifica si la solucion del sudoku es correcta
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                int aux = sudoku[i][j];
                sudoku[i][j]=0;
                if (!validarFila(i,aux) || !validarColumna(j,aux) || !validarCuadrante(i,j,aux)) {
                    sudoku[i][j]=aux;
                    return false;
                }
                sudoku[i][j]=aux;
            }
        }return true;
    }
    
    public int[][] getSudoku() {
        return sudoku;
    }

    @Override
    public void setSudoku(int[][] sudoku){
        this.sudoku = sudoku;
    }
}
