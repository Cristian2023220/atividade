package questao2;
import javax.swing.JOptionPane;

public class Questao2 {


    public static void main(String[] args) {

        String peso = JOptionPane.showInputDialog("Digite o seu peso em kg");
        String altura = JOptionPane.showInputDialog ("Digite a sua altura em metros");
        double pesoNum = Double.parseDouble (peso);
        double alturaNum = Double.parseDouble (altura);
        double imc = pesoNum/ Math.pow(alturaNum,2);
        String mensagem = "";
        
        if (imc<18.5){
            mensagem = "Abaixo do peso";
        }else if (imc<25){
            mensagem = "Peso Normal";
        }else if (imc<30){
            mensagem = "Sobrepeso";
        }else if (imc<35){
            mensagem = "Obeso Leve";
        }else if (imc<40){
            mensagem = "Obeso Moderado";
        }else{
            mensagem = "Obeso Mórbido";
        }
    }
    JOptionPane.showMessageDialog(null, "O seu IMC é: "+imc+ "\n"+mensagem);
}
