package questao6;
import javax.swing.JOptionPane;

public class Questao6 {


    public static void main(String[] args) {

 // Criar uma variável para controlar o laço de repetição
        boolean continuar = true;
        
        // Repetir enquanto o usuário quiser
        while (continuar) {
            // Pedir ao usuário que digite um ano
            String entrada = JOptionPane.showInputDialog("Digite um ano:");
            
            // Converter a entrada em um número inteiro
            int ano = Integer.parseInt(entrada);
            
            // Verificar se o ano é bissexto
            boolean bissexto = false;
            
            // Um ano é bissexto se for divisível por 4, exceto se for divisível por 100 e não por 400
            if (ano % 4 == 0) {
                if (ano % 100 == 0) {
                    if (ano % 400 == 0) {
                        bissexto = true;
                    }
                } else {
                    bissexto = true;
                }
            }
            
            // Exibir o resultado
            if (bissexto) {
                JOptionPane.showMessageDialog(null, "O ano " + ano + " é bissexto.");
            } else {
                JOptionPane.showMessageDialog(null, "O ano " + ano + " não é bissexto.");
            }
            
            // Perguntar ao usuário se ele quer continuar
            int opcao = JOptionPane.showConfirmDialog(null, "Você quer verificar outro ano?", "Continuar", JOptionPane.YES_NO_OPTION);
            
            // Se o usuário escolher não, sair do laço
            if (opcao == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }
}
