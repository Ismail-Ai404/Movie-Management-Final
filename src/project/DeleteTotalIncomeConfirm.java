package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class DeleteTotalIncomeConfirm extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel ReciptLebel = new JLabel("Are you sure to delete the file ?");

    JButton CancelButton = new JButton("Cancel");
    JButton ConfirmButton = new JButton("Confirm");



    public DeleteTotalIncomeConfirm() {
       // this.TotalAmount = RentPrice;
        this.setTitle("Confirm Deletion");
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


        // ConfirmButton code
        ConfirmButton.setBounds(350,100,150,30);
        ConfirmButton.setForeground(new Color(235, 241, 238));
        ConfirmButton.setHorizontalAlignment(SwingConstants.CENTER);
        ConfirmButton.setVerticalTextPosition(SwingConstants.CENTER);
        ConfirmButton.setBackground( new Color(21, 21, 21));
        ConfirmButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        ConfirmButton.setFocusable(false);
        container.add(ConfirmButton);



        // CancelButton code
        CancelButton.setBounds(150,100,100,30);
        CancelButton.setForeground(new Color(235, 241, 238));
        CancelButton.setHorizontalAlignment(SwingConstants.CENTER);
        CancelButton.setVerticalTextPosition(SwingConstants.CENTER);
        CancelButton.setBackground( new Color(21, 21, 21));
        CancelButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        CancelButton.setFocusable(false);
        container.add(CancelButton);
    }


    public void addActionEvent(){

        ConfirmButton.addActionListener(this);
        CancelButton.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == ConfirmButton) {

            File RentOrBuy = new File("RentOrBuy.txt");
            if (RentOrBuy.delete()) {
                System.out.println("Deleted the file: " + RentOrBuy.getName());
            } else {
                System.out.println("Failed to delete SeatSell file.");
            }

            File SeatSell = new File("SeatSell.txt");
            if (SeatSell.delete()) {
                System.out.println("Deleted the file: " + RentOrBuy.getName());
            } else {
                System.out.println("Failed to delete SeatSell file.");
            }

            JOptionPane.showMessageDialog(null, "Deleted All data Successfully");

            this.setVisible(false);
            MainFrame MainFrame = new MainFrame();
            MainFrame.setVisible(true);
        }

       if(e.getSource() == CancelButton) {
            this.setVisible(false);
           TotalIncome TotalIncome = new TotalIncome();
           TotalIncome.setVisible(true);
        }

    }
}
