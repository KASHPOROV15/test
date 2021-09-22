import static javax.swing.JOptionPane.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Demo {
    static int index=0;
    public static void main(String[] args){
        String path="D:/Animals/";
        String[] names={"lion","tiger","bear"};
        String[] files={"lion.jpg","tiger.jpg","bear.jpg"};
        ImageIcon[] imgs=new ImageIcon[files.length];
        for(int k=0;k< imgs.length;k++){
            imgs[k]=new ImageIcon(path+files[k]);
        }
        JButton button=new JButton(names[index],imgs[index]);
        button.setVerticalTextPosition(JLabel.BOTTOM);
        button.setHorizontalTextPosition(JLabel.CENTER);
        Font F=new Font("Courier New",Font.BOLD,25);
        button.setFont(F);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.WHITE);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.addActionListener(e->{
            index=(index+1)%files.length;
            button.setIcon(imgs[index]);
            button.setText(names[index]);
        });
        showMessageDialog(
                null,button,"Predators",PLAIN_MESSAGE
        );
    }
}
