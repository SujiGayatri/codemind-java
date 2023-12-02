import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JRadioExample {
    public static void main(String[] args)
    {
        //JRadioButton
        JRadioButton j1=new JRadioButton("Red");
        JRadioButton j2=new JRadioButton("green");
        JRadioButton j3=new JRadioButton("orange");
        j1.setBounds(120,50, 70, 30);
        j2.setBounds(190,50, 80, 30);
        j3.setBounds(280, 50, 90, 30);
        j1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        j2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        j3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        

        //JLabel
        JLabel label = new JLabel();
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        label.setBounds(200, 200, 200, 40);
        label.setOpaque(true);


       j1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("STOP");
                label.setFont(new Font("Arial Black",Font.BOLD,40));
                label.setForeground(Color.RED);
            }
        });
        j2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("GO");
                label.setFont(new Font("Arial Black",Font.BOLD,40));
                label.setForeground(Color.GREEN);
            }
        });
        j3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("READY");
                label.setFont(new Font("Arial Black",Font.BOLD,40));
                label.setForeground(Color.ORANGE);
            }
        });

        //JFrame 
        JFrame frame=new JFrame("Frame");
        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.add(label);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
