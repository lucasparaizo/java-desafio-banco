import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO Conhecer  e importar a classe Scanner
         Scanner scanner = new Scanner(System.in);        

        //Exibir as mensagens para o nosso usuário
        System.out.println("Bem vindo ao acesso bancário pelo terminal! ");

        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo: ");
        float saldo = scanner.nextFloat();
        //Exibir a mensagem da conta criada.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}