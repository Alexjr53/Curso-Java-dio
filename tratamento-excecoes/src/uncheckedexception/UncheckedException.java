package uncheckedexception;

import javax.print.attribute.standard.JobHoldUntil;
import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLopping = true;
        
        do {
            String a = JOptionPane.showInputDialog("numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
        try{
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("resultado: " + resultado);
            continueLopping = false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "valor inválido, digite apenas numeros " + e.getMessage());
            //e.printStackTrace();
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "não é possivel dividir um numero por zero " + e.getMessage());
        }finally{
            System.out.println("chegou no finaly");
        }
        } while (continueLopping);
        
        
        System.out.println("o código chegou até aqui..");
    }
    
    public static int dividir(int a, int b) {
        return a/ b;
    }
    
}