// Escreva um método maxLength que receba um Set de strings como parâmetro e que retorne o comprimento da string mais longa do set. Se o seu método receber um set vazio, ele deve retornar 0.
// Exercício baseado em https://practiceit.cs.washington.edu/problem/view/bjp5/chapter11/e8-maxLength

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ex4COLLECTIONS {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>(Arrays.asList("moises", "do", "nascimento"));
    int max = maxLength(set);
    System.out.println(max);
  }

  public static int maxLength(Set<String> set) {
    int max = 0;
    Iterator<String> i = set.iterator();

    while (i.hasNext()) {
      String current = i.next();
      if (current.length() > max) {
        max = current.length();
      }
    }
    return max;
  }

}