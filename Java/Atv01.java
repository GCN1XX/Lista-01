import java.util.Scanner; 

public class Atv01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite primeiro numero");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite segundo numero");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;


        
        System.out.println("A soma dos numeros é:" + soma);
        scanner.close();
    }
}