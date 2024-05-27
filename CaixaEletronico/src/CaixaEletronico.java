import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean exit = false;
            while (true) { 
            int opcao = scanner.nextInt(); 
            
            switch (opcao) {
                case 1:
                    int deposito = scanner.nextInt();

                    saldo = saldo + deposito;

                break;

                case 2:
                    int saque = scanner.nextInt();

                    if (saldo < saque) {
                        System.out.println("Saldo Insuficiente.");
                    }
                    else 
                    saldo = saldo - saque;
                break;

                case 0:
                    exit = true;
                break;

                case 3: 
                    System.out.println(saldo);

                break;

                default:
                System.out.println("Opção inválida. Tente novamente."); 
                break;
            } 
            if (exit) {
                break;
            } 
        } 

        public void VerificadorNumeroConta(x) { 
        try{
            System.out.println("Insira o número da conta bancaria: ");
            String numeroConta = scanner.next; 
        }
    
 
        

// TODO: Leia a entrada do usuário como uma string representando o número da conta:
           

// TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
           

// Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido."); 

// TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
       
// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage()); 
        } finally {
            scanner.close();
        }
    }

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) { 

// TODO: Verifique se o número da conta tem exatamente 8 dígitos:
   
// TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
            
        }
    }
}
    }

    
}

