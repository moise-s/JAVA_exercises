
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

    }
}