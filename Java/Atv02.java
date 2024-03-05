import java.util.Scanner; 

public class Atv02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite primeiro numero (X):");
        int X = scanner.nextInt();

        System.out.println("Digite segundo numero (Y):");
        int Y = scanner.nextInt();

        int divisao = X % Y;

   


        
        System.out.println("Divisao de " + X + " por " + Y + "é:" + divisao);
        scanner.close();
    }
}