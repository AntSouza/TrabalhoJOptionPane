package JOptionPane;
import javax.swing.JOptionPane;
//uso do showInputDialog + showConfirmDialog
//YES_OPTION vale 0; 
//NO_OPTION vale 1;
//CANCEL_OPTION vale 2;

public class ExemploUso {
    public static void main(String[] args){
        String comida = null;
        int resposta;
        comida = JOptionPane.showInputDialog("Qual sua comida favorita?");
        resposta = JOptionPane.showConfirmDialog(null,"A sua comida favorita é " + comida + "?");
        if(resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Sua comida favorita é " + comida);
        }
        if(resposta == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Sua comida favorita não é " + comida);
        }
        if(resposta == JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null,"Cancelado!");
        }            
    }
}
