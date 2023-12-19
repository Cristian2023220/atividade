package q3;
import javax.swing.JOptionPane;

public class Q3 {


    public static void main(String[] args) {

        int qtdPaes, qtdBroas;
        double precoPao = 0.12, precoBroa = 1.5, total, poupança;
        
        qtdPaes = Integer.parseInt(JOptionPane.showInputDialog ("Digite a quantidade de pães vendidos"));
        qtdBroas = Integer.parseInt(JOptionPane.showInputDialog ("Digite a quantidade de Broas compradas"));
        total = qtdPaes*precoPao + qtdBroas*precoBroa;
        poupança = total*0.1;
        
        JOptionPane.showMessageDialog(null, "O total arrecadado foi de R$"+total+ "\nO valor a ser guardado na poupança é de R$ "+poupança);
      
        
    }
    
}
