// Escreva um método contarUnicos que receba uma List de inteiros como parâmetro e retorne o número de valores inteiros exclusivos na lista. Use um Set como armazenamento auxiliar para ajudá-lo a resolver esse problema.
// Por exemplo, se uma lista contém os valores [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], seu método deve retornar 5. A lista vazia contém 0 valores exclusivos.

import java.util.*;

public class ex5COLLECTIONS {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

  }

  public static int contarUnicos(List<Integer> list) {
    Set<Integer> provisorio = new HashSet<>();
    Iterator<Integer> i = list.iterator();

    while (i.hasNext()) {
      //Continuar aqui
      
    }
}
}
