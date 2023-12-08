import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaExample {
    public static void main(String[] args)
    {
        JTextArea area=new JTextArea();
        area.setBounds(100,100,400,400);
        area.setFont(new Font("MV Boli",Font.BOLD,30));
        String s="This\nis\ntext\nArea";
        area.setText(s);

        //JFrame 
        JFrame frame=new JFrame("Frame");
        frame.add(area);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
