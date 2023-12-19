package questao7;
import javax.swing.JOptionPane;

public class Questao7 {


    public static void main(String[] args) {

        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno ou 'sair' para encerrar:");
            if (nome.equalsIgnoreCase("sair")) {
                System.exit(0);
            
            double[] notas = new double[4];
            double soma = 0;
            for (int i = 0; i < 4; i++) {
                String nota = JOptionPane.showInputDialog("Digite a nota " + (i + 1) + " do aluno " + nome + ":");
                notas[i] = Double.parseDouble(nota);
                soma += notas[i];
            }
            double media = soma / 4;
            if (media >= 6) {
                JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi aprovado com média " + media + ".");
            } else {
                JOptionPane.showMessageDialog(null, "O aluno " + nome + " foi reprovado com média " + media + ".");
            }
            }