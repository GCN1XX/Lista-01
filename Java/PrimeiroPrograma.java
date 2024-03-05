import java.util.Scanner; 

public class PrimeiroPrograma{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe seu nome");
        String nome;
        nome = input.nextLine();
        System.out.println("O nome informado foi: " + nome);
        input.close();
    }
}