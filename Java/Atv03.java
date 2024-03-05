import java.util.Scanner; 

public class Atv03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
       
      String nome = scanner.nextLine();

    
        System.out.println("Olá, " + nome + "! Bem-vindo!");
        scanner.close();
    }
}