import java.util.Scanner; 

public class Atv05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor (X):");
        int X = scanner.nextInt();

        int Valor = X;

        int DolarParaReal = Valor * 5;

        System.out.println( " US$ 1 = " + DolarParaReal + " Reais");
        scanner.close();
    }
}

