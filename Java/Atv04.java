import java.util.Scanner; 

public class Atv04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        
        System.out.println("Informe seu endereço:");
        
        System.out.println("Informe seu telefone:");

        String nome = scanner.nextLine();
        String endereço = scanner.nextLine();
        String telefone = scanner.nextLine();

        System.out.println("Dados inserido:" + nome + endereço + telefone);
        scanner.close();
    
    }
}


