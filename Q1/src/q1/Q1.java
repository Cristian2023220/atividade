package q1;
import javax.swing.JOptionPane;

public class Q1 {


    public static void main(String[] args) {

        String largura = JOptionPane.showInputDialog ("Digite a largura do terreno em metros");
        String comprimento = JOptionPane.showInputDialog ("Digite o cumprimento do terreno em metros");
        double larguraNumerica = Double.parseDouble (largura);
        double comprimentoNumerico = Double.parseDouble (comprimento);
        double area = larguraNumerica * comprimentoNumerico;
        
        JOptionPane.showMessageDialog (null, "A área do terreno é "+area+"metros quadrados.");
        
    }
    
}
