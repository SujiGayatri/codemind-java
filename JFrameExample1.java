import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;;
public class JFrameExample1 {
    public static void main(String[] args)
    {
        //JLabel
        JLabel label = new JLabel();
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        label.setBounds(10, 100, 100, 30);
        label.setBackground(Color.black);
        label.setOpaque(true);

        //JComboBox
        String[] boxItems={"red","blue","green","pink"};
        JComboBox box =new JComboBox(boxItems);
        box.setBounds(130,100,130,30);
        box.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        box.setBackground(Color.white);
        box.setSelectedItem(null);

        JButton button=new JButton("Submit");
        button.setBounds(280,100,130,30);
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
               if(box.getSelectedItem().equals("red"))
                   label.setBackground(Color.red);
                if(box.getSelectedItem().equals("blue"))
                   label.setBackground(Color.blue);
                if(box.getSelectedItem().equals("green"))
                   label.setBackground(Color.green);
                if(box.getSelectedItem().equals("pink"))
                   label.setBackground(Color.pink);
            }
        });

        //JFrame
        JFrame frame=new JFrame("Frame");
        frame.add(label);
        frame.add(box);
        frame.add(button);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }
}
