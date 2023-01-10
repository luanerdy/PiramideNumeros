import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um numero:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("\n");

        System.out.println("Pirâmide até o número " + number);

        for (int i = 1; i <= number; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
