package q8;
import javax.swing.JOptionPane;

public class Q8 {


    public static void main(String[] args) {

        double nota1, nota2, nota3, peso1 = 1, peso2 = 2, peso3 = 3, somaPesos, media;
        nota1 = Double.parseDouble (JOptionPane.showInputDialog ("Digite a primeira nota"));
        nota2 = Double.parseDouble (JOptionPane.showInputDialog ("Digite a segunda nota"));
        nota3 = Double.parseDouble (JOptionPane.showInputDialog ("Digite a terceira nota"));
        somaPesos = peso1+peso2+peso3;
        media = (nota1*peso1 + nota2*peso2 + nota3*peso3/somaPesos);
        JOptionPane.showMessageDialog(null, "A média ponderada é: "+media);
    }
    
}
