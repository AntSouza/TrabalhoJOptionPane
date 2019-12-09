package JOptionPane;
import javax.swing.JOptionPane;
//showConfirmDialog YES_NO_CANCEL_OPTION mostra 3 opções de escolha "sim, não e cancelar";

public class ExemploEscolha2 {
    public static void main(String[] args){        
        JOptionPane.showConfirmDialog(null,"Escolha um:", "Escolha um", JOptionPane.YES_NO_CANCEL_OPTION);
    }
}
