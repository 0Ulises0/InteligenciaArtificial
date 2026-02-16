package Proyecto1;
public class ArbolBinarioBusqueda {
    Nodo raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        return actual;
    }
    public void imprimirArbol() {
        imprimirInorden(raiz);
        System.out.println();
    }

    private void imprimirInorden(Nodo nodo) {
        if (nodo != null) {
            imprimirInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirInorden(nodo.derecho);
        }
    }
}