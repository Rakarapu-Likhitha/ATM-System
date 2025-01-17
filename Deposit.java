package bank.managment.system;

import javax.swing.*; //JFrame
import java.awt.*; //Image
import java.awt.event.*; //ActionListener

public class Deposit extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton deposit, back;
    
    Deposit(){
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(355, 485, 150, 30);
        image.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deposit){
            
        } else if(ae.getSource() == back){
            
        }
            
    }
    
    public static void main(String args[]) {
        new Deposit();
        
    }
}
