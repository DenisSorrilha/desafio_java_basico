import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        int numConta;
        String numAgencia;
        String nomeCliente;
        double saldo;

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite a Agência: ");
        numAgencia = sc.next();
        System.out.print("Por favor, digite o número da Conta: ");
        numConta = sc.nextInt();
        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = sc.next();
        System.out.print("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();

        //Exibir a mensagem conta criada

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, numAgencia, numConta, saldo);

    }
}