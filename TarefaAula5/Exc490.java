package EstruturaDeDados;
import java.util.Scanner;

public class Exc490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10];
        
        for (int L = 0; L < 10; L++) {
            System.out.printf("\ndigite palavra em letras minusculas %d: ", L);
            nome[L] = scanner.nextLine();
            restantes(nome[L], nome[L].length(), "c");
        }
        
        for (int L = 0; L < 10; L++) {
            System.out.printf("\n%d - %s", L + 1, nome[L]);
        }
        
        System.out.println();
    }

    public static void restantes(String vet, int tam, String x) {
        char[] chars = vet.toCharArray();
        
        for (int i = 0; i < tam; i++) {
            if (chars[i] == x.charAt(0)) {
                chars[i] = '*';
            }
        }
        
        String result = new String(chars);
        System.out.println(result);
    }
}