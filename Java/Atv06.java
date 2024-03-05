import java.util.Scanner; 

public class Atv06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade (X):");
        int X = scanner.nextInt();

        int idadePorAnos = X;

        int DiasAnos = idadePorAnos * 365;

        System.out.println("Viveu: " + DiasAnos + " dias ");
        scanner.close();
    }
}


