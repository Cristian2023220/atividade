package q2;
import javax.swing.JOptionPane;

public class Q2 {


    public static void main(String[] args) {

        String cavalos = JOptionPane.showInputDialog ("Digite a quantidade de cavalos comprados");
        int cavalosNumericos = Integer.parseInt(cavalos);
        int ferraduras = cavalosNumericos * 4;
         JOptionPane.showMessageDialog(null,"Você precisa de "+ferraduras+"ferraduras para equipar todos os cavalos");
        
    }
    
}
