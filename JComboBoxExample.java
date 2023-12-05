import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;
public class JComboBoxExample {
    public static void main(String[] args)
    {
        //JComboBox
        String[] boxItems={"item1","item2","item3","item4"};
        JComboBox box =new JComboBox(boxItems);
        box.setBounds(100,100,150,30);
        box.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        box.setBackground(Color.white);
        box.setSelectedItem(null);

        //JButton
        JButton button=new JButton("Click Here");
        button.setBounds(280,100,160,40);
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                //System.out.println("You picked "+box.getSelectedItem());
                JOptionPane.showMessageDialog(null, "You picked "+ box.getSelectedItem(),"Message",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        //JFrame
        JFrame frame=new JFrame("Combo Example");
        frame.add(box);
        frame.add(button);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
