package q6;
import javax.swing.JOptionPane;

public class Q6 {


    public static void main(String[] args) {
        
        double peso, preco = 12, valor;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do prato em quilos"));
        valor = peso*preco;
        JOptionPane.showMessageDialog (null, "O valor a ser pago é de R$ "+valor);
    }
    
}
