package questao3;
import javax.swing.JOptionPane;

public class Questao3 {


    public static void main(String[] args) {

       int dia, idade;
       double preco, valor;
       
       dia= Integer.parseInt (JOptionPane.showInputDialog("Digite o dia da semana (1 a7):"));
       idade = Integer.parseInt (JOptionPane.showInputDialog("Digite a idade do telespectador: "));
       preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do ingresso"));
       
       if (dia==3){
           valor = preco*0.5;
       }else if (idade<14) {
           valor = preco*0.5;
       }else {
           valor = preco;
       }
        JOptionPane.showMessageDialog (null, "O valor a pagar é: "+valor);
    }
    
}
