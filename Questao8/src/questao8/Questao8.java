package questao8;
import javax.swing.JOptionPane;

public class Questao8 {

    public static void main(String[] args) {
        String inputX = JOptionPane.showInputDialog("Digite o valor de x:");
        String inputY = JOptionPane.showInputDialog("Digite o valor de y:");
        double x = Double.parseDouble(inputX);
        double y = Double.parseDouble(inputY);

        double parabola = Math.pow(x, 2) - 3 * x + 1;

        if (y < parabola) {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") está abaixo da parábola.");
        } else if (y > parabola) {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") está acima da parábola.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") pertence à parábola.");
        }
    }
}