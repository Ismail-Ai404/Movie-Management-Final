package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReciptRoBconfirm extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel ReciptLebel = new JLabel("Your Information added to the FIle");


    JButton BackButton = new JButton("Ok");



    public ReciptRoBconfirm() {
       // this.TotalAmount = RentPrice;
        this.setTitle("Confirm Rent or Buy");
        this.setBounds(300,100,700,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.setIconImage(Toolkit
                .getDefaultToolkit()
                .getImage( "src/project/img/images.png"));

        Initialize();
        //check();
        addActionEvent();   /// basically buttons
    }

    private void Initialize() {

        container.setLayout(null);
        container.setBackground( new Color(255, 233, 233));

        // Recipt label
        ReciptLebel.setBounds(50,5,552,100);
        ReciptLebel.setForeground(new Color( 2, 46, 22));
        ReciptLebel.setFont(new Font("San Francisco",Font.BOLD,25));
        ReciptLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ReciptLebel);




        // Back button code
        BackButton.setBounds(250,100,100,30);
        BackButton.setForeground(new Color(235, 241, 238));
        BackButton.setHorizontalAlignment(SwingConstants.CENTER);
        BackButton.setVerticalTextPosition(SwingConstants.CENTER);
        BackButton.setBackground( new Color(21, 21, 21));
        BackButton.setFocusable(false);
        BackButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        container.add(BackButton);
    }


    public void addActionEvent(){


        BackButton.addActionListener(this);


    }



    @Override
    public void actionPerformed(ActionEvent e) {



       if(e.getSource() == BackButton) {
            this.setVisible(false);
            BuyOrRentFrame seat = new BuyOrRentFrame();
            seat.setVisible(true);
        }

    }
}
