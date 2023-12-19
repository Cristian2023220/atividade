package questao1;
import javax.swing.JOptionPane;

public class Questao1 {


    public static void main(String[] args) {

        double saldoInicial = Double.parseDouble (JOptionPane.showInputDialog("Digite o saldo inicial"));
        double totalDebitos = Double.parseDouble (JOptionPane.showInputDialog("Digite o total de débitos"));
        double totalCreditos = Double.parseDouble (JOptionPane.showInputDialog("Digite o total de créditos"));
        double saldoFinal = saldoInicial - totalDebitos+totalCreditos;
        if (saldoFinal>0){
            JOptionPane.showInputDialog (null, "Saldo positivo em R$ "+saldoFinal+"reais");
        }else if (saldoFinal<0){
            JOptionPane.showInputDialog(null, "Saldo negativo em R$ "+Math.abs(saldoFinal)+"reais");
        }else {
            JOptionPane.showMessageDialog(null, "Saldo zero");
        }
    
    }
    
}
