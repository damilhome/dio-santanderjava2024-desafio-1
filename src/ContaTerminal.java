import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar classe scanner
        Scanner scanner = new Scanner(System.in);
        
        //Exibir as mensagens para o usuário e obter os valores digitados no terminal através do scanner
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        //Exibir mensagem de conta criada
        String mensagemFormatada = String.format("Olá %s, obrigado por criar uma conta em nosso banco. Os dados de sua conta são: agência %s, conta %d. Seu saldo de %.2f já está disponível para saque.", nome, agencia, numero, saldo);
        System.out.println(mensagemFormatada);

        scanner.close();
    }
}
