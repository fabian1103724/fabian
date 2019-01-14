import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;

public class talong{
	public static void main(String args[]){

	JFrame frame = new JFrame("Diablo");

	//background image
	JLabel background = new JLabel(new ImageIcon("C:\\users\\student\\desktop\\Diablo_Bone.0.jpg"));
	background.setSize(1000,800);

	BufferedImage image = ImageIO.read(new File("Logo.jpg"));
    JLabel label = new JLabel(new ImageIcon(image));
    panel.add(label);

	JPanel panel1 = new JPanel();

	//username
	JLabel label = new JLabel("Username");
	label.setBounds(430,330,90,30);

	JTextField username = new JTextField(" ");
	username.setBounds(430,350,90,30);

	//code

	JLabel label1 = new JLabel("Code");
	label1.setBounds(430,380,90,30);

	JTextField extra = new JTextField(" ");
	extra.setBounds(430,400,90,30);

	//password
	JLabel label2 = new JLabel("Password");
	label2.setBounds(430,430,90,30);

	JPasswordField password = new JPasswordField(" ");
	password.setBounds(430,450,90,30);

	//button
	JButton button = new JButton("Log In");
	button.setBounds(430,500,90,30);
	button.setBackground(Color.red);

	//frame
	JPanel panel = new JPanel(new BorderLayout());
	panel.setBounds(350,300,250,250);
	panel.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));

	frame.add(label);
	frame.add(label2);
	frame.add(label1);
	frame.add(button);
	frame.add(username);
	frame.add(extra);
	frame.add(password);
	frame.add(panel);	
	frame.add(background);
	frame.setSize(1000,800);		
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);

	}

}
