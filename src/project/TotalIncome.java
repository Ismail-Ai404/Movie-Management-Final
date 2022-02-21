package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class TotalIncome extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel ReciptLebel = new JLabel("Total Income");


    JLabel BorRLabel = new JLabel("Income from Buy or Rent DVD:");
    JLabel SeatSellLabel = new JLabel("Income from Selling Seat");

    JLabel TotalLebel = new JLabel("Total Income");


    String TotalAmountCurrency = "৳";
    JLabel BorRLabelCurrencyLebel = new JLabel(TotalAmountCurrency);
    JLabel SeatSellCurrencyLebel = new JLabel(TotalAmountCurrency);
    JLabel TotalAmountCurrencyLebel = new JLabel(TotalAmountCurrency);

  //  int TotalAmount = 0;
   // JLabel TotalAmountLebel = new JLabel(Integer.toString(TotalAmount));

   JButton DeleteButton = new JButton("Delete Both Data");
    JButton BackButton = new JButton("Home");

   // public static  String MovieName="",ShowTime="", AuditoriumNoShow="";
    public static  int BoRAmount=0,SeatSell=0;
    public static  int BoRAmountTotal=0,SeatSellTotal=0 ,totalIncome=0;

    public TotalIncome() {


        this.setTitle("Total Income");
        this.setBounds(300,100,700,500);
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
        ReciptLebel.setBounds(100,5,252,100);
        ReciptLebel.setForeground(new Color( 2, 46, 22));
        ReciptLebel.setFont(new Font("San Francisco",Font.BOLD,25));
        ReciptLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ReciptLebel);


        BoRAmountTotal=0;
        File fil = null,fil2 = null;
        try
        {
            fil = new File("RentOrBuy.txt");
            Scanner myReader = new Scanner(fil);

            while (myReader.hasNextLine())
            {
                String []arr = myReader.nextLine().split("-");
                int size = arr.length;

                BoRAmount = Integer.parseInt(arr[size-1]);

                BoRAmountTotal += BoRAmount;

            }
            myReader.close();
        }

        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        SeatSellTotal=0;
          fil2 = null;
        try
        {
            fil2 = new File("SeatSell.txt");
            Scanner myReader2 = new Scanner(fil2);

            while (myReader2.hasNextLine())
            {
                String []arr2 = myReader2.nextLine().split("-");
                int size2 = arr2.length;

                SeatSell = Integer.parseInt(arr2[size2-1]);

                SeatSellTotal += SeatSell;

            }
            myReader2.close();
        }

        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        totalIncome = BoRAmountTotal + SeatSellTotal;
        // BorR label
        BorRLabel.setBounds(5,150,400,150);
        BorRLabel.setForeground(new Color( 2, 46, 22));
        BorRLabel.setFont(new Font("San Francisco",Font.BOLD,20));
        //NameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(BorRLabel);

        // BorRLabel Amount currency Display
        BorRLabelCurrencyLebel.setBounds(380,150,300,150);
        BorRLabelCurrencyLebel.setForeground(new Color( 2, 46, 22));
        BorRLabelCurrencyLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //TotalAmountLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(BorRLabelCurrencyLebel);

        // BorR count Display
        JLabel FirstClassCountLebel = new JLabel(Integer.toString(BoRAmountTotal)); //BoR amount
        FirstClassCountLebel.setBounds(400,150,550,150);
        FirstClassCountLebel.setForeground(new Color( 2, 46, 22));
        FirstClassCountLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowNameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(FirstClassCountLebel);

        // SeatSellLabel label
        SeatSellLabel.setBounds(5,170,400,150);
        SeatSellLabel.setForeground(new Color( 2, 46, 22));
        SeatSellLabel.setFont(new Font("San Francisco",Font.BOLD,20));
        //   MovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(SeatSellLabel);

        // SeatSell currency Display
        SeatSellCurrencyLebel.setBounds(380,170,300,150);
        SeatSellCurrencyLebel.setForeground(new Color( 2, 46, 22));
        SeatSellCurrencyLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //TotalAmountLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(SeatSellCurrencyLebel);

        // SeatSell count Display
        JLabel SecondtClassCountLebel = new JLabel(Integer.toString(SeatSellTotal));
        SecondtClassCountLebel.setBounds(400,170,550,150);
        SecondtClassCountLebel.setForeground(new Color( 2, 46, 22));
        SecondtClassCountLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowNameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(SecondtClassCountLebel);


        // Total Amount label Display
        TotalLebel.setBounds(5,230,300,150);
        TotalLebel.setForeground(new Color( 2, 46, 22));
        TotalLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //TotalLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(TotalLebel);

        // Total Amount currency Display
        TotalAmountCurrencyLebel.setBounds(195,230,300,150);
        TotalAmountCurrencyLebel.setForeground(new Color( 2, 46, 22));
        TotalAmountCurrencyLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //TotalAmountLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(TotalAmountCurrencyLebel);

        // Total Amount Display
        JLabel TotalAmountLebel = new JLabel(Integer.toString(totalIncome));
        TotalAmountLebel.setBounds(210,230,300,150);
        TotalAmountLebel.setForeground(new Color( 2, 46, 22));
        TotalAmountLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //TotalAmountLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(TotalAmountLebel);

        // DeleteButton code
        DeleteButton.setBounds(300,400,200,30);
        DeleteButton.setForeground(new Color(235, 241, 238));
        DeleteButton.setHorizontalAlignment(SwingConstants.CENTER);
        DeleteButton.setVerticalTextPosition(SwingConstants.CENTER);
        DeleteButton.setBackground( new Color(21, 21, 21));
        DeleteButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        DeleteButton.setFocusable(false);
        container.add(DeleteButton);


        // Back button code
        BackButton.setBounds(10,400,100,30);
        BackButton.setForeground(new Color(235, 241, 238));
        BackButton.setHorizontalAlignment(SwingConstants.CENTER);
        BackButton.setVerticalTextPosition(SwingConstants.CENTER);
        BackButton.setBackground( new Color(21, 21, 21));
        BackButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        BackButton.setFocusable(false);
        container.add(BackButton);
    }



    public void addActionEvent(){

        DeleteButton.addActionListener(this);
        BackButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource() == DeleteButton) {
            this.setVisible(false);
            DeleteTotalIncomeConfirm DeleteTotalIncomeConfirm = new DeleteTotalIncomeConfirm();
            DeleteTotalIncomeConfirm.setVisible(true);
        }

       if(e.getSource() == BackButton) {
            this.setVisible(false);
           MainFrame MainFrame = new MainFrame();
           MainFrame.setVisible(true);
        }

    }
}
