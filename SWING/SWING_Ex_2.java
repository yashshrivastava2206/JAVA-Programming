package SWINGandAWT;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class LoginForm extends JFrame implements ActionListener{
	JLabel lblUser,lblPass;
	JTextField txtUser,txtPass;
	JButton btnLogin;
	Font font;
	JComboBox cb;
	JCheckBox checkbox,checkbox1,checkbox2;
	Container c;
	ImageIcon icon;
	public LoginForm(){
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		c= this.getContentPane();
		c.setLayout(null);
		font =new Font("Arial",Font.ITALIC,14);
		c.setFont(font);
		icon= new ImageIcon("C:\\Users\\student\\eclipse-workspace\\anshika\\anshi\\vishek\\Vikash\\src\\one.png");
		this.setIconImage(icon.getImage());
		lblUser= new JLabel("Username :");
		lblUser.setFont(font);
		lblUser.setBounds(100, 100, 100, 200);
		c.add(lblUser);
		lblPass= new JLabel("Password :"); 
		lblPass.setBounds(100, 150, 100, 200);
		lblPass.setFont(font);
		c.add(lblPass);
		txtUser= new JTextField("Username");
		txtUser.setBounds(200,185,100,30);
		c.add(txtUser);
		txtPass= new JTextField("Password");
		txtPass.setBounds(200,232,100,30);
		c.add(txtPass);
		btnLogin= new JButton("Login");
		btnLogin.setFont(font);
		btnLogin.setBounds(228, 310, 70, 30);
		btnLogin.addMouseListener(null);
		c.add(btnLogin);
		btnLogin.addActionListener(this);
		checkbox =new JCheckBox("Remember Password");
		c.getBackground();
		checkbox.setBounds(100,270,200,40);
//		checkbox1 =new JCheckBox("Post Graduation");
//		checkbox1.setBounds(200,350,200,40);
		c.add(checkbox);
//		c.add(checkbox1);
		   String country[]={"Select","Shashi","Yash","Vikash","Nishu"};        
		    cb=new JComboBox(country);    
		    cb.setBounds(50, 50,90,20);    
		    c.add(cb);        
//		    c.setLayout(null);    
		    c.setSize(400,500);    
//		    f.setVisible(true); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(txtUser.getText().equalsIgnoreCase("yash.2224mca1049@kiet.edu") && txtPass.getText().equalsIgnoreCase("Yash@kiet")){
			JOptionPane.showMessageDialog(null,"Welcome Yash...!");
		}
		else
			JOptionPane.showMessageDialog(null,"Try Again...!");
	}
}
public class SWING_Ex_2 {
	public static void main(String[] args) {
		new LoginForm();
	}

}
