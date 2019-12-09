package JOptionPane;
import javax.swing.JOptionPane;

public class ExemploSelecionarItem {
    public static void main(String[] args){
        Object[] item = {"1", "2", "3"};
        Object selectedValue = JOptionPane.showInputDialog(null,"Escolha um item","Opções",JOptionPane.INFORMATION_MESSAGE,null,item,item[0]);
    }
}
