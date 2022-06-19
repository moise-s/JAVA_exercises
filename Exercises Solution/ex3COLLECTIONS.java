// Escreva um método chamado alternar que aceite duas Lists de inteiros como seus parâmetros e retorne uma nova List contendo elementos alternados das duas listas, na seguinte ordem:
// Primeiro elemento da primeira lista
// Primeiro elemento da segunda lista
// Segundo elemento da primeira lista
// Segundo elemento da segunda lista
// Terceiro elemento da primeira lista
// Terceiro elemento da segunda lista
// …
// Se as listas não contiverem o mesmo número de elementos, os elementos restantes da lista mais longa devem ser colocados consecutivamente no final. Por exemplo, para uma primeira lista de (1, 2, 3, 4, 5) e uma segunda lista de (6, 7, 8, 9, 10, 11, 12), uma chamada de suplente (lista1, lista2) deve retornar uma lista contendo (1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12). Não modifique as listas de parâmetros passadas.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class ex3COLLECTIONS {
  public static void main(String[] args) {

    List<Integer> li1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    List<Integer> li2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
    List<Integer> result = alternate(li1, li2);
    System.out.println(result);
  }

  public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
    Iterator<Integer> i1 = list1.iterator();
    Iterator<Integer> i2 = list2.iterator();
    List<Integer> result = new ArrayList<Integer>();

    while (i1.hasNext() || i2.hasNext()) {
      if (i1.hasNext()) {
        result.add(i1.next());
      }
      if (i2.hasNext()) {
        result.add(i2.next());
      }
    }
    return result;
  }

}