// Desafio
// Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, conforme a fórmula:

// Distancia = formula

// Entrada
// O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

// Saída
// Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

import java.util.*;

public class DIODesafioTQI3 {

    public static void main(String[] args) {

        // a classe Scanner auxilia na leitura dos dados de entrada
        Scanner input = new Scanner(System.in);
        double[] vetor1 = new double[2];
        double[] vetor2 = new double[2];
        double distance = 0;

        String string = input.nextLine();
        String[] s = string.split(" ");
        for (int i = 0; i < s.length; i++) {
            vetor1[i] = Double.parseDouble(s[i]);
        }

        string = input.nextLine();
        s = string.split(" ");
        for (int i = 0; i < s.length; i++) {
            vetor2[i] = Double.parseDouble(s[i]);
        }

        distance = Math.sqrt((Math.pow(vetor2[0] - vetor1[0], 2)) + (Math.pow(vetor2[1] - vetor1[1], 2)));
        System.out.format("%.4f", distance);

        input.close();
    }
}