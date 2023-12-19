package q10;
import javax.swing.JOptionPane;

public class Q10 {


    public static void main(String[] args) {

        double x1,y1,x2,y2,d;
        x1 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a coordenada X do primeiro ponto:"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a coordenada Y do primeiro ponto:"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a coordenada X do segundo ponto:"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a coordenada x do segundo ponto:"));
        d = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        JOptionPane.showMessageDialog(null, "A distância entre os pontos é: "+d);
        
    }
    
}
