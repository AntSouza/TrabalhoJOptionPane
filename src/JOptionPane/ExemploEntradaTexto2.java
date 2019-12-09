package JOptionPane;
import javax.swing.JOptionPane;

        
public class ExemploEntradaTexto2 {
    public static void main(String[] args){
        String comida = null;
        comida = JOptionPane.showInputDialog("Qual sua comida favorita?");
        JOptionPane.showConfirmDialog(null, "Sua comida favorita é " + comida + "?");
    }
}
