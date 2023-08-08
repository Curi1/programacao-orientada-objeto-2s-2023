import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class verificadorNumeroPrimo {

    public static void main(String[] args) {
        List<Integer> numeros = gerarNumerosAleatorios(10);
        for (int numero : numeros) {
            int resultado = verificaNumeroPrimo(numero);

            if (resultado == 1) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }
    }

    public static int verificaNumeroPrimo(int n) {
        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }

    public static List<Integer> gerarNumerosAleatorios(int quantidade) {
        List<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < quantidade; i++) {
            int numero = rand.nextInt(100) + 1;
            numeros.add(numero);
        }

        return numeros;
    }
}