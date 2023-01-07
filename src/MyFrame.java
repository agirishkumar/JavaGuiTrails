import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    
    MyFrame(){
        this.setVisible(true); // makes the frame visible
        this.setSize(1080,1080); // sets the dimensions of the frame
        this.setResizable(false); // restricting the resizing feature of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // by default its Hide_On_Close, can also be set to Do_nothing_On_Close
        ImageIcon image = new ImageIcon("fire.png"); // takes a new image
        this.setIconImage(image.getImage()); // sets the image as icon on the title bar
        this.getContentPane().setBackground(new Color(125,150,200)); // sets the background color of the content pane of the frame
        this.setTitle("Frame Title"); // sets the title of the frame
    }
}
