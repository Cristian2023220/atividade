package q7;
import javax.swing.JOptionPane;

public class Q7 {


    public static void main(String[] args) {

        int dia, mes, dias;
        dia = Integer.parseInt(JOptionPane.showInputDialog ("Digite o dia da data"));
        mes = Integer.parseInt(JOptionPane.showInputDialog ("Digite o mês da data"));
        dias = mes*30+dia;
        JOptionPane.showMessageDialog(null, "Desde o ínicio do ano se passaram"+dias+ "dias");
    }
    
}
