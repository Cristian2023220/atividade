package q4;
import javax.swing.JOptionPane;

public class Q4 {


    public static void main(String[] args) {

        String nome;
        int idade, dias;
        nome = JOptionPane.showInputDialog ("Digite o seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog ("Digite a sua idade"));
        dias = idade*365;
        
        JOptionPane.showMessageDialog (null,nome+",você possui"+dias+"dias de vida");
    }
    
}
