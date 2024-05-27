import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       
    }

      static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n° " + (i+1) + " é " + candidatos[i]);
        }
    }



    static void candidatosSelecionados() {
            String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

            int candidatosSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;
            while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = salarioPretendido();

                System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                    candidatosSelecionados++;
                }
                candidatoAtual++;
            }
        }     
    static double salarioPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
        }
  

   
    static void analisarCandidatos(double salarioPretendido) {
            double salarioBase = 2000.0;
            if (salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO.");
            } else if (salarioBase == salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
         }
            else {
                System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");
            }
        }

   
    static void ligarCandidatos(String candidato) {
            int tentativasReaizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if (continuarTentando)
                    tentativasReaizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO.");
            }while (continuarTentando && tentativasReaizadas < 3);

            if (atendeu) 
                System.out.println("CONSEGUIMOS CONTATO COM" + candidato + " NA " + tentativasReaizadas + " TENTATIVA");
            else 
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " , NUMERO MÁXIMO TENTATIVAS REALIZADAS " + tentativasReaizadas + " REALIZADA.");

    }
    static boolean atender() {
            return new Random().nextInt(3)==1;
    }
          

  
    
    
  


}
