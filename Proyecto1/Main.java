package Proyecto1;
public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arb = new ArbolBinarioBusqueda();
        arb.insertar(45);
        arb.insertar(10);
        arb.insertar(7);
        arb.insertar(12);
        arb.insertar(90);
        arb.insertar(50);

        System.out.print("arbol ordenado: ");
        arb.imprimirArbol();
    }
}