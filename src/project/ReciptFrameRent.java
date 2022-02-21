package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ReciptFrameRent extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel ReciptLebel = new JLabel("Receipt");

    JLabel NameLebel = new JLabel("Name:");
    JLabel MovieLabel = new JLabel("Movie:");
    JLabel DateLebel = new JLabel("Date:");

    //lgn lg = new lgn();
    String Name =  lgn.getFname();
    JLabel ShowNameLebel = new JLabel(Name);

   // String MovieName = "Guardians of the Galaxy";
   JLabel ShowMovieLabel ;

    String date = "27-4-2021";
    JLabel ShowDateLebel = new JLabel(date);

    // Bill
    JLabel FirstClassLebel = new JLabel("Type: ");

    JLabel TotalLebel = new JLabel("Cost: ");

    JLabel FirstClassRateLebel ;


    String MovieNameFile,TypeFile;
    int AmountFile;

    String TotalAmountCurrency = "৳";
    JLabel TotalAmountCurrencyLebel = new JLabel(TotalAmountCurrency);

    int TotalAmount = 1000;


    JButton confirmButton = new JButton("Confirm");
    JButton BackButton = new JButton("Back");



    public ReciptFrameRent(String MovieName, int RentPrice,String type) {

        ShowMovieLabel = new JLabel(MovieName);
        FirstClassRateLebel = new JLabel(type);

        MovieNameFile = MovieName;
        TypeFile = type;
        AmountFile = RentPrice;



        this.TotalAmount = RentPrice;
        this.setTitle("Receipt of Rent or Buy");
        this.setBounds(300,100,500,700);
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

        // Name label
        NameLebel.setBounds(5,30,100,150);
        NameLebel.setForeground(new Color( 2, 46, 22));
        NameLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //NameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(NameLebel);

        // Name value Display
        ShowNameLebel.setBounds(95,30,250,150);
        ShowNameLebel.setForeground(new Color( 2, 46, 22));
        ShowNameLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowNameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ShowNameLebel);

        // Movie Name label
        MovieLabel.setBounds(5,50,100,150);
        MovieLabel.setForeground(new Color( 2, 46, 22));
        MovieLabel.setFont(new Font("San Francisco",Font.BOLD,20));
     //   MovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(MovieLabel);

        // Movie Name value Display
        this.ShowMovieLabel.setBounds(95,50,300,150);
        ShowMovieLabel.setForeground(new Color( 2, 46, 22));
        ShowMovieLabel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowMovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ShowMovieLabel);


        // 1st class label
        FirstClassLebel.setBounds(5,130,200,150);
        FirstClassLebel.setForeground(new Color( 2, 46, 22));
        FirstClassLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //NameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(FirstClassLebel);

        // 1st class rate Display
        FirstClassRateLebel.setBounds(195,130,250,150);
        FirstClassRateLebel.setForeground(new Color( 2, 46, 22));
        FirstClassRateLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowNameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(FirstClassRateLebel);


        // Total Amount label Display
        TotalLebel.setBounds(5,200,300,150);
        TotalLebel.setForeground(new Color( 2, 46, 22));
        TotalLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //TotalLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(TotalLebel);

        // Total Amount currency Display
        TotalAmountCurrencyLebel.setBounds(195,200,300,150);
        TotalAmountCurrencyLebel.setForeground(new Color( 2, 46, 22));
        TotalAmountCurrencyLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //TotalAmountLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(TotalAmountCurrencyLebel);

        // Total Amount Display
        JLabel TotalAmountLebel = new JLabel(Integer.toString(TotalAmount));
        TotalAmountLebel.setBounds(210,200,300,150);
        TotalAmountLebel.setForeground(new Color( 2, 46, 22));
        TotalAmountLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //TotalAmountLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(TotalAmountLebel);

        // Confirm button code
        confirmButton.setBounds(300,500,150,30);
        confirmButton.setForeground(new Color(235, 241, 238));
        confirmButton.setHorizontalAlignment(SwingConstants.CENTER);
        confirmButton.setVerticalTextPosition(SwingConstants.CENTER);
        confirmButton.setBackground( new Color(21, 21, 21));
        confirmButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        confirmButton.setFocusable(false);
        container.add(confirmButton);


        // Back button code
        BackButton.setBounds(10,500,100,30);
        BackButton.setForeground(new Color(235, 241, 238));
        BackButton.setHorizontalAlignment(SwingConstants.CENTER);
        BackButton.setVerticalTextPosition(SwingConstants.CENTER);
        BackButton.setBackground( new Color(21, 21, 21));
        BackButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        BackButton.setFocusable(false);
        container.add(BackButton);
    }


    public void addActionEvent(){

        confirmButton.addActionListener(this);
        BackButton.addActionListener(this);


    }


    public static void toRorBFile(String MovieName,int amount, String type)
    {
        try
        {
            BufferedWriter out = new BufferedWriter(new FileWriter("RentOrBuy.txt",true));

                out.write(MovieName+"-"+type+"-"+amount+"\n");

            // out.write("aString");
            out.close();
        }catch(Exception e)
        {

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String s1,s2;
        char c1,c2;

        if(e.getSource() == confirmButton){

            this.toRorBFile(MovieNameFile,AmountFile,TypeFile);
            this.setVisible(false);
            ReciptRoBconfirm ReciptRoBconfirm = new ReciptRoBconfirm();

            ReciptRoBconfirm.setVisible(true);

        }
        else if(e.getSource() == BackButton) {
            this.setVisible(false);
            BuyOrRentFrame seat = new BuyOrRentFrame();
            seat.setVisible(true);
        }

    }
}
