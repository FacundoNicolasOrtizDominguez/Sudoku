package controlador;

public interface ControladorInterfaz {
    boolean resolverSudoku();
    boolean validarFila(int i, int valor);
    boolean validarColumna(int j, int valor);
    boolean validarCuadrante(int i, int j, int valor);
    int subCuadranteActual(int pos);
    void generarSudoku(int nivel);
    void limpiarSudoku();
    boolean comprobarSudoku();
    int[][] getSudoku();
    void setSudoku(int[][] sudoku);
}
