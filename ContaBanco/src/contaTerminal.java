import java.util.Scanner;

public class contaTerminal {
    public static void main (String [] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Por favor, insira seu nome e sobrenome: ");
        String nomeCliente = read.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = read.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        int numeroAgencia = read.nextInt();

        System.out.println("Por favor, deposite um valor: ");
        double saldoConta = read.nextDouble();

        System.out.println("Olá ".concat(nomeCliente.toUpperCase())+", obrigado(a) por criar uma conta em nosso banco!");
        System.out.println("Sua agência é: "+ numeroAgencia + ", conta de número: " + numeroConta + ", e seu saldo de R$" + saldoConta + " reais já está disponivel para saque.");
        read.close();

    } 
}
