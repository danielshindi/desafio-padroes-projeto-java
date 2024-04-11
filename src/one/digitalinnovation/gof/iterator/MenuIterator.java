package one.digitalinnovation.gof.iterator;

/**
 * Implementação da interface Iterator
 * Responsável pela iteração através da captura de menus que estarão em uma espécie de coleção de objetos como uma matriz ou um ArrayList.
 */

public class MenuIterator {

    MenuItem[] itens;
    int posicao = 0;

    public MenuIterator(MenuItem[] itens) {
        this.itens = itens;
    }

    public Object next() {
        MenuItem menuItem = itens[posicao];
        posicao++;
        return menuItem;
    }

    // Se posição for maior ou igual a itens.length ou itens[posição] é igual a null, retorna false.
    // Senão, retorna true;
    public boolean hasNext() {
        return posicao < itens.length && itens[posicao] != null;
    }

}
