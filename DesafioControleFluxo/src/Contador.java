import java.util.Scanner;
 
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
 
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
 
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
 
		try {
			contar(parametroUm, parametroDois);
 
		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
 
		terminal.close();
	}
 
 
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
 
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}

		int x = 0; 

		for (int i = parametroDois - parametroUm; i <= parametroDois; i++) {
			x =  x + 1;
			System.out.println("Imprimindo número " + x + "...");
		}
	}
}
 
class ParametrosInvalidosException extends Exception {}