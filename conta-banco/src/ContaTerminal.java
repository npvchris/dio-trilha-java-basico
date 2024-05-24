import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados da conta ao usuário
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        scanner.nextLine();  // Consumir a nova linha deixada pelo nextInt
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scanner.nextDouble();

        // Fechar o scanner
        scanner.close();

        // Exibindo a mensagem final com os dados inseridos pelo usuário
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}
