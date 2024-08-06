package revisãotwo;

public class DecimalParaBinario {

    public static void main(String[] args) {
        int numeroDecimal = 73;
        String resultadoBinario = converterParaBinario(numeroDecimal);
        System.out.println("O número " + numeroDecimal + " em binário é " + resultadoBinario);
    }

    public static String converterParaBinario(int numero) {
        if (numero == 0) {
            return "0";
        } else if (numero == 1) {
            return "1";
        } else {
            return converterParaBinario(numero / 2) + (numero % 2);
        }
    }
}
