package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//ONLY NEEDS WORK ON CHECKBOX
public class AdminPass extends JFrame implements ActionListener{

    JButton button;
    JPasswordField passField;
    JCheckBox checkBox;

    AdminPass(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Welcome Admin");
        button.addActionListener(this);
        button.setFocusable(false);

        passField = new JPasswordField();

        passField.setPreferredSize(new Dimension(250,34));
        passField.setFont(new Font("Consolas",Font.PLAIN,30));
        passField.setForeground(new Color(0x00FF00));
        passField.setBackground(Color.black);
        passField.setCaretColor(Color.white);
        //passField.setText("Password");

        checkBox = new JCheckBox();
        checkBox.setText("Show Password");
        checkBox.setFocusable(false);
        checkBox.addActionListener(this);


        this.setTitle("Admin Login");
        this.add(button);
        this.add(passField);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            String checkPass = String.valueOf(passField.getPassword());
            int x=checkPass.compareTo("Hello123");

            if(x==0){
                this.dispose();
                TotalIncome tot= new TotalIncome();
                tot.setVisible(true);
              //  new MainFrame();
            }
            else {this.dispose();
                JOptionPane.showMessageDialog(null, "Wrong password");
            new MainFrame();}
            //button.setEnabled(false);
            //textField.setEditable(false);
        }
      //  if(e.getSource()==button) {
       //     if(checkBox.isSelected())
      //      passField.setEchoChar('*');

      //  }
        if(e.getSource()==checkBox) {
            if(checkBox.isSelected())
                passField.setEchoChar((char)0);
            else passField.setEchoChar((char)8226);

        }

    }
}