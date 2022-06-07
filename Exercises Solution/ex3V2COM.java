public class ex3V2COM {
  public static void main(String[] args) {

    // exemplo de vetor a ser inserido
    int[] vectorIn = new int[] { 87, 89, 1, 55, 5, 8, 5, 2, 13, 2, 9, 3, 87, 3, 2, 1, 5, 2, 2, 9, 1, 989, 13, 77, 2, 1, 8,
        5, 88, 88, 89, 55, 989 };

    // execução da função criada
    int resultado = solution(vectorIn, 31);

    // print do resultado
    System.out.println("o valor do elemento sem par é: " + resultado);
  }

  // função criada
  private static int solution(int V[], int N) {

    int valor = 0;

    // loop para percorrer todo o vetor
    for (int i = 0; i < V.length; i++) {
      for (int j = i + 1; j < V.length; j++) {

        // caso o elemento encontre seu par, é substituído por 'zero'
        if (V[i] == V[j]) {
          V[i] = 0;
          V[j] = 0;
        }
      }

      // o elemento sem par é identificado e atribuído a variável de retorno
      if (V[i] != 0) {
        valor = V[i];
      }
    }
    return valor;
  }
}
