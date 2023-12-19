package questao4;
import javax.swing.JOptionPane;

public class Questao4 {


    public static void main(String[] args) {

        String estrada = JOptionPane.showInputDialog ("Digite um valor");
        int valor = Integer.parseInt (estrada);
        if (valor %2==0){
            int quadrado = valor*valor;
            JOptionPane.showMessageDialog(null, "O quadrado de "+valor+ "é: "+quadrado);
        }else {
            int cubo = valor*valor*valor;
            JOptionPane.showMessageDialog(null, "O cubo de "+valor+ "é: "+cubo);
        }  
    } 
}
