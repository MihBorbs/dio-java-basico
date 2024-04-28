import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = scan.nextLine();
        System.out.println("O nome do cliente é: " + nomeCliente);

        System.out.println("Por favor, digite o número de sua agência: ");
        String Agencia = scan.next();
        System.out.println("O numero de sua agência é: " + Agencia);

        System.out.println("Por favor, digite o numero de sua conta: ");
        int numeroConta = scan.nextInt();
        System.out.println("Usuário: " + numeroConta);

        System.out.println("Digite o saldo de sua conta: ");
        double saldo = scan.nextDouble();
        System.out.println("O saldo de sua conta é: " + saldo);
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque. ");
    }
    
}
