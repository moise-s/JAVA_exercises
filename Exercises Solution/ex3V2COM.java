public class ex3V2COM {
  public static void main(String[] args) {

    // exemplo de vetor a ser inserido
    int[] vectorIn = new int[] { 1, 2, 3, 4, 4, 87, 399, 3, 101, 1, 2, 5, 5, 399, 87 };

    // execução da função criada
    int resultado = solution(vectorIn, vectorIn.length);

    // print do resultado
    System.out.println("o valor do elemento sem par é: " + resultado);
  }

  // função criada
  private static int solution(int V[], int N) {
    int valor = V[0];

    // loop para percorrer todo o vetor
    for (int i = 1; i < V.length; i++) {

      // lógica XOR para descobrir o valor único, ex: 2 ^ 2 = 0, logo valor
      // 'solitário' é encontrado
      valor = valor ^ V[i];
    }
    return valor;
  }
}