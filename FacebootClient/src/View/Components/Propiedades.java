package View.Components;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;


public class Propiedades extends BasicComboBoxUI{
    
    public static ComboBoxUI createUI(JComponent com){
        return new Propiedades();
    }
    
    protected JButton createArrowButton(){
        JButton btn = new JButton();
        btn.setIcon(new ImageIcon(getClass().getResource("/View/Images/abajo.png")));
        return btn;
    }
}
