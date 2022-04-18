import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Thu Apr 14 17:32:08 CST 2022
 */



/**
 * @author 1
 */
public class loginn extends JFrame {
    public loginn() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialog1 = new JDialog();
        comboBox1 = new JComboBox();

        //======== dialog1 ========
        {
            var dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(null);
            dialog1ContentPane.add(comboBox1);
            comboBox1.setBounds(80, 240, 95, comboBox1.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialog1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = dialog1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialog1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialog1ContentPane.setMinimumSize(preferredSize);
                dialog1ContentPane.setPreferredSize(preferredSize);
            }
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JDialog dialog1;
    private JComboBox comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new loginn();
    }
}
