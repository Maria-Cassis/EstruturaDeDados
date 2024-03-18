package EstruturaDeDados;

public class Exc460 {
    public static void main(String[] args) {
        int a, c;
        for (c = -1; c < 2; c++) {
            System.out.print("\n\ndigite numero: ");
            a = Integer.parseInt(System.console().readLine());
            System.out.println("dobro: " + dob(a));
        }
        System.out.println("\n");
    }

    public static int dob(int x) {
        return x * 2;
    }
}