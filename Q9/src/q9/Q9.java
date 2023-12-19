package q9;
import javax.swing.JOptionPane;

public class Q9 {


    public static void main(String[] args) {

        int qtdPequena, qtdMedia, qtdGrande;
        int precoPequena=10, precoMedia=12, precoGrande=15;
        int valorTotal;
        
        qtdPequena = Integer.parseInt (JOptionPane.showInputDialog("Digite a quantidade de camisetas Pequenas vendidas"));
        qtdMedia = Integer.parseInt (JOptionPane.showInputDialog("Digite a quantidade de camisetas Médias vendidas"));
        qtdGrande = Integer.parseInt (JOptionPane.showInputDialog("Digite a quantidade de camisetas Grandes vendidas"));
        valorTotal = qtdPequena*precoPequena + qtdMedia*precoMedia + qtdGrande*precoGrande;
        JOptionPane.showMessageDialog (null, "O valor total da venda é de R$"+valorTotal);
    }
    
}
