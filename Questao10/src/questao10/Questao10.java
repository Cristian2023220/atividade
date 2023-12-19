package questao10;
import javax.swing.JOptionPane;

public class Questao10 {


    public static void main(String[] args) {

        // Cria um vetor para armazenar os nomes dos candidatos
        String[] candidatos = {"João", "Carlos", "Maria"};
        // Cria um vetor para armazenar os votos de cada candidato
        int[] votos = new int[3];
        // Cria uma variável para controlar o laço de repetição
        boolean valido = false;
        // Cria uma variável para armazenar o voto digitado pelo usuário
        String voto = "";
        // Repete até o usuário digitar "fim"
        while (!voto.equalsIgnoreCase("fim")) {
            try {
                // Lê o voto digitado pelo usuário usando o JOptionPane
                voto = JOptionPane.showInputDialog("Digite o nome do candidato ou fim para encerrar: ");
                // Verifica se o voto é válido
                valido = false;
                for (int i = 0; i < candidatos.length; i++) {
                    // Se o voto for igual ao nome de um candidato, incrementa o seu contador de votos
                    if (voto.equalsIgnoreCase(candidatos[i])) {
                        votos[i]++;
                        valido = true;
                        break;
                    }
                }
                // Se o voto não for válido, mostra uma mensagem de erro
                if (!valido && !voto.equalsIgnoreCase("fim")) {
                    JOptionPane.showMessageDialog(null, "Voto inválido. Digite o nome de um candidato ou fim para encerrar.");
                }
            } catch (Exception e) {
                // Se o usuário cancelar a entrada, encerra o programa
                System.exit(0);
            }
        }
        // Cria uma variável para armazenar o índice do candidato vencedor
        int vencedor = 0;
        // Cria uma variável para armazenar o total de votos do candidato vencedor
        int maior = votos[0];
        // Percorre o vetor de votos para encontrar o maior valor
        for (int i = 1; i < votos.length; i++) {
            // Se o voto atual for maior que o maior, atualiza as variáveis
            if (votos[i] > maior) {
                maior = votos[i];
                vencedor = i;
            }
        }
        // Mostra o resultado da eleição usando o JOptionPane
        JOptionPane.showMessageDialog(null, "O vencedor da eleição foi " + candidatos[vencedor] + " com " + maior + " votos.");
    }
}