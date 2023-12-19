package q5;
import javax.swing.JOptionPane;

public class Q5 {


    public static void main(String[] args) {

        double preco, pagamentos, litros;
        preco = Double.parseDouble (JOptionPane.showInputDialog ("Digite o preço do litro da gasolira "));
        pagamentos = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor do pagamento "));
        litros = pagamentos/preco;
        
        JOptionPane.showMessageDialog (null,"Voc~e conseguiu colocar "+litros+"litros no tanque");
    }
    
}
