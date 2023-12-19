package questao9;
import javax.swing.JOptionPane;

public class Questao9 {


     public static void main(String[] args) {
        int idade = 0;
        boolean valido = false;
        while (!valido) {
            try {
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
                if (idade >= 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Idade inválida. Digite um número inteiro maior ou igual a zero.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Idade inválida. Digite um número inteiro maior ou igual a zero.");
            }
        }
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        } else {
            int anos = 18 - idade;
            JOptionPane.showMessageDialog(null, "Você é menor de idade, falta " + anos + " anos para ser maior.");
        }
    }
}