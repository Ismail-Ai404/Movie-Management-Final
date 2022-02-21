package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ReciptFrameAudi2 extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel ReciptLebel = new JLabel("Receipt");

    JLabel NameLebel = new JLabel("Name:");
    JLabel MovieLabel = new JLabel("Movie:");
    JLabel DateLebel = new JLabel("Show Time:");
    JLabel AuditoriumLebel = new JLabel("Auditorium Number:");

   // lgn lg = new lgn();
    String Name =  lgn.getFname();
    JLabel ShowNameLebel = new JLabel(Name);

    //String MovieName = "Guardians of the Galaxy";
    JLabel ShowMovieLabel ;

    //String date = "27-4-2021";
    JLabel ShowDateLebel ;

    JLabel ShowAuditorium;

    // Bill
    JLabel FirstClassLebel = new JLabel("1st Class Seat:");
    JLabel SecondClassLabel = new JLabel("2nd Class Seat:");
    JLabel ThirdClassLebel = new JLabel("3rd Class Seat:");
    JLabel TotalLebel = new JLabel("Total");

    String FirstClassRate  = "300৳ x";
    JLabel FirstClassRateLebel = new JLabel(FirstClassRate);


    String SecondClassRate = "200৳ x";
    JLabel SecondClassRateLabel = new JLabel(SecondClassRate);


    String ThirdClassRate = "100৳ x";
    JLabel ThirdClassRateLebel = new JLabel(ThirdClassRate);


    String TotalAmountCurrency = "৳";
    JLabel TotalAmountCurrencyLebel = new JLabel(TotalAmountCurrency);

    int TotalAmount = 1000;
    JLabel TotalAmountLebel = new JLabel(Integer.toString(TotalAmount));

    JButton confirmButton = new JButton("Confirm");
    JButton BackButton = new JButton("Back");

    int[] seatArray = new int[270];
   int[] seatlistFileArray = new int[270];
    int[] finalArray = new int[270];



    public static  String MovieName="",ShowTime="", AuditoriumNoShow="";

    public ReciptFrameAudi2(String movieName, String Time, int Auditorium, int[] TempSeatArray) {

        for (int i =0;i < seatArray.length;i++)
        {
            seatArray[i] = TempSeatArray[i];
        }

        MovieName = movieName;
        ShowTime = Time;
        if(Auditorium == 1)
            AuditoriumNoShow = "1";
        else
            AuditoriumNoShow = "2";

        ShowMovieLabel = new JLabel(movieName);
        ShowDateLebel = new JLabel(Time);
        ShowAuditorium = new JLabel(AuditoriumNoShow);

        this.setTitle("Receipt of Seat Booking");
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
        ShowMovieLabel.setBounds(95,50,300,150);
        ShowMovieLabel.setForeground(new Color( 2, 46, 22));
        ShowMovieLabel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowMovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ShowMovieLabel);

        // Date label
        DateLebel.setBounds(5,85,150,150);
        DateLebel.setForeground(new Color( 2, 46, 22));
        DateLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //   MovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(DateLebel);

        // Date value Display
        ShowDateLebel.setBounds(195,85,300,150);
        ShowDateLebel.setForeground(new Color( 2, 46, 22));
        ShowDateLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowMovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ShowDateLebel);

        // Auditorium label
        AuditoriumLebel.setBounds(5,110,250,150);
        AuditoriumLebel.setForeground(new Color( 2, 46, 22));
        AuditoriumLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //   MovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(AuditoriumLebel);

        // Auditorium value Display
        ShowAuditorium.setBounds(270,110,300,150);
        ShowAuditorium.setForeground(new Color( 2, 46, 22));
        ShowAuditorium.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowMovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ShowAuditorium);

        int FirstClassCount  = 0;
        int SecondClassCount  = 0;
        int ThirdClassCount  = 0;

        int TotalAmount = 0;


        for (int i =0;i < seatArray.length;i++)
                {
                    if( seatArray[i] == 2){
                        FirstClassCount++;
                    }
                    else if( seatArray[i] == 3){
                        SecondClassCount++;
                    }
                    else if( seatArray[i] == 4){
                        ThirdClassCount++;
                    }
                }

        TotalAmount = ( 300 * FirstClassCount ) + ( 200 * SecondClassCount ) + ( 100 * ThirdClassCount);
        toSeatSellFile(MovieName,ShowTime,AuditoriumNoShow,TotalAmount);

        String s2;
        char c2;

        if (MovieName == "John Wick Chapter 4" && ShowTime == "5:00 pm") {

            try {
                FileReader fw2 = new FileReader("seatlist500JohnA2.txt");
                BufferedReader bf2 = new BufferedReader(fw2);


                while (((s2 = bf2.readLine()) != null)) {
                    for (int i = 0; i < seatArray.length; i++) {
                        c2 = s2.charAt(i);
                        seatlistFileArray[i] = Character.getNumericValue(c2);
                        seatArray[i] = seatArray[i] + seatlistFileArray[i];
                        if (seatArray[i] != 0)
                            finalArray[i] = 9;
                        System.out.print(finalArray[i]);
                    }
                }
                bf2.close();
            } catch (Exception ee) {
            }
        }

        if (MovieName == "Fast & Furious 9" && ShowTime == "5:00 pm") {

            try {
                FileReader fw2 = new FileReader("seatlist500F9A2.txt");
                BufferedReader bf2 = new BufferedReader(fw2);

                while (((s2 = bf2.readLine()) != null)) {
                    for (int i = 0; i < seatArray.length; i++) {
                        c2 = s2.charAt(i);
                        seatlistFileArray[i] = Character.getNumericValue(c2);
                        seatArray[i] = seatArray[i] + seatlistFileArray[i];
                        if (seatArray[i] != 0)
                            finalArray[i] = 9;
                    }
                }

                bf2.close();
            } catch (Exception ee) {
            }
        }

        if (MovieName == "Thor Love and Thunder" && ShowTime == "5:00 pm") {
            try {
                FileReader fw2 = new FileReader("seatlist500thorA2.txt");
                BufferedReader bf2 = new BufferedReader(fw2);

                while (((s2 = bf2.readLine()) != null)) {
                    for (int i = 0; i < seatArray.length; i++) {
                        c2 = s2.charAt(i);
                        seatlistFileArray[i] = Character.getNumericValue(c2);
                        seatArray[i] = seatArray[i] + seatlistFileArray[i];
                        if (seatArray[i] != 0)
                            finalArray[i] = 9;
                    }
                }
                bf2.close();
            } catch (Exception ee) {
            }
        }

        if (MovieName == "John Wick Chapter 4" && ShowTime == "12:30 pm") {

            try {

                FileReader fw2 = new FileReader("seatlist1230JohnA2.txt");
                BufferedReader bf2 = new BufferedReader(fw2);

                while (((s2 = bf2.readLine()) != null)) {
                    for (int i = 0; i < seatArray.length; i++) {
                        c2 = s2.charAt(i);
                        seatlistFileArray[i] = Character.getNumericValue(c2);
                        seatArray[i] = seatArray[i] + seatlistFileArray[i];
                        if (seatArray[i] != 0)
                            finalArray[i] = 9;
                    }
                }

                bf2.close();
            } catch (Exception ee) {
            }
        }

        if (MovieName == "Fast & Furious 9" && ShowTime == "12:30 pm") {

            try {

                FileReader fw2 = new FileReader("seatlist1230F9A2.txt");
                BufferedReader bf2 = new BufferedReader(fw2);

                while (((s2 = bf2.readLine()) != null)) {
                    for (int i = 0; i < seatArray.length; i++) {
                        c2 = s2.charAt(i);
                        seatlistFileArray[i] = Character.getNumericValue(c2);
                        seatArray[i] = seatArray[i] + seatlistFileArray[i];
                        if (seatArray[i] != 0)
                            finalArray[i] = 9;
                    }
                }

                bf2.close();
            } catch (Exception ee) {
            }
        }

        if (MovieName == "Thor Love and Thunder" && ShowTime == "12:30 pm") {

            try {

                FileReader fw2 = new FileReader("seatlist1230thorA2.txt");
                BufferedReader bf2 = new BufferedReader(fw2);

                while (((s2 = bf2.readLine()) != null)) {
                    for (int i = 0; i < seatArray.length; i++) {
                        c2 = s2.charAt(i);
                        seatlistFileArray[i] = Character.getNumericValue(c2);
                        seatArray[i] = seatArray[i] + seatlistFileArray[i];
                        if (seatArray[i] != 0)
                            finalArray[i] = 9;
                    }
                }

                bf2.close();
            } catch (Exception ee) {
            }
        }
        //fileCalculate();
        // 1st class label
        FirstClassLebel.setBounds(5,150,200,150);
        FirstClassLebel.setForeground(new Color( 2, 46, 22));
        FirstClassLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //NameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(FirstClassLebel);

        // 1st class rate Display
        FirstClassRateLebel.setBounds(195,150,250,150);
        FirstClassRateLebel.setForeground(new Color( 2, 46, 22));
        FirstClassRateLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowNameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(FirstClassRateLebel);

        // 1st class count Display
        JLabel FirstClassCountLebel = new JLabel(Integer.toString(FirstClassCount));
        FirstClassCountLebel.setBounds(270,150,250,150);
        FirstClassCountLebel.setForeground(new Color( 2, 46, 22));
        FirstClassCountLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowNameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(FirstClassCountLebel);

        // 2nd class label
        SecondClassLabel.setBounds(5,170,200,150);
        SecondClassLabel.setForeground(new Color( 2, 46, 22));
        SecondClassLabel.setFont(new Font("San Francisco",Font.BOLD,20));
        //   MovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(SecondClassLabel);

        // 2nd class rate Display
        SecondClassRateLabel.setBounds(195,170,300,150);
        SecondClassRateLabel.setForeground(new Color( 2, 46, 22));
        SecondClassRateLabel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowMovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(SecondClassRateLabel);

        // 2nd class count Display
        JLabel SecondtClassCountLebel = new JLabel(Integer.toString(SecondClassCount));
        SecondtClassCountLebel.setBounds(270,170,250,150);
        SecondtClassCountLebel.setForeground(new Color( 2, 46, 22));
        SecondtClassCountLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowNameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(SecondtClassCountLebel);

        // 3rd class label
        ThirdClassLebel.setBounds(5,190,200,150);
        ThirdClassLebel.setForeground(new Color( 2, 46, 22));
        ThirdClassLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //   MovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ThirdClassLebel);

        // 3rd class rate Display
        ThirdClassRateLebel.setBounds(195,190,300,150);
        ThirdClassRateLebel.setForeground(new Color( 2, 46, 22));
        ThirdClassRateLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowMovieLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ThirdClassRateLebel);

        // 3rd class count Display
        JLabel ThirdClassCountLebel = new JLabel(Integer.toString(ThirdClassCount));
        ThirdClassCountLebel.setBounds(270,190,250,150);
        ThirdClassCountLebel.setForeground(new Color( 2, 46, 22));
        ThirdClassCountLebel.setFont(new Font("San Francisco",Font.BOLD,20));
        //ShowNameLebel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(ThirdClassCountLebel);

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
        JLabel TotalAmountLebel = new JLabel(Integer.toString(TotalAmount));
        TotalAmountLebel.setBounds(210,230,300,150);
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
        container.add(confirmButton);


        // Back button code
        BackButton.setBounds(10,500,100,30);
        BackButton.setForeground(new Color(235, 241, 238));
        BackButton.setHorizontalAlignment(SwingConstants.CENTER);
        BackButton.setVerticalTextPosition(SwingConstants.CENTER);
        BackButton.setBackground( new Color(21, 21, 21));
        BackButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        container.add(BackButton);
    }


    public void addActionEvent(){

        confirmButton.addActionListener(this);
        BackButton.addActionListener(this);
    }

    public static void toSeatSellFile(String MovieName, String time,String Auditarium,int TotalAmount)
    {
        try
        {
            BufferedWriter out = new BufferedWriter(new FileWriter("SeatSell.txt",true));

            out.write(Auditarium+"-"+MovieName+"-"+time+"-"+TotalAmount+"\n");

            // out.write("aString");
            out.close();
        }catch(Exception e)
        {

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource() == confirmButton) {

            if (MovieName == "John Wick Chapter 4" && ShowTime == "5:00 pm") {
                try {
                    FileWriter fw = new FileWriter("seatlist500JohnA2.txt", false);
                    BufferedWriter bf = new BufferedWriter(fw);
                    for (int i = 0; i < finalArray.length; i++) {
                        bf.write("" + finalArray[i]);
                    }
                    bf.close();
                } catch (IOException io) {

                }
                this.setVisible(false);
                ReciptMovieTickeConfirm Iframe = new ReciptMovieTickeConfirm();
                Iframe.setVisible(true);
            }


            if (MovieName == "Fast & Furious 9" && ShowTime == "5:00 pm") {

                    try {
                        FileWriter fw = new FileWriter("seatlist500F9A2.txt", false);
                        BufferedWriter bf = new BufferedWriter(fw);
                        for (int i = 0; i < finalArray.length; i++) {
                            bf.write("" + finalArray[i]);
                        }
                        bf.close();
                    } catch (IOException io) {

                    }
                this.setVisible(false);
                    ReciptMovieTickeConfirm Iframe = new ReciptMovieTickeConfirm();
                    Iframe.setVisible(true);
            }

            if (MovieName == "Thor Love and Thunder" && ShowTime == "5:00 pm") {

                    try {
                        FileWriter fw = new FileWriter("seatlist500thorA2.txt", false);
                        BufferedWriter bf = new BufferedWriter(fw);
                        for (int i = 0; i < finalArray.length; i++) {
                            bf.write("" + finalArray[i]);
                        }
                        bf.close();
                    } catch (IOException io) {

                    }
                this.setVisible(false);
                    ReciptMovieTickeConfirm Iframe = new ReciptMovieTickeConfirm();
                    Iframe.setVisible(true);
            }

            if (MovieName == "John Wick Chapter 4" && ShowTime == "12:30 pm") {

                    try {
                        FileWriter fw = new FileWriter("seatlist1230JohnA2.txt", false);
                        BufferedWriter bf = new BufferedWriter(fw);
                        for (int i = 0; i < finalArray.length; i++) {
                            bf.write("" + finalArray[i]);
                        }
                        bf.close();
                    } catch (IOException io) {

                    }
                this.setVisible(false);
                    ReciptMovieTickeConfirm Iframe = new ReciptMovieTickeConfirm();
                    Iframe.setVisible(true);
            }

            if (MovieName == "Fast & Furious 9" && ShowTime == "12:30 pm") {

                    try {
                        FileWriter fw = new FileWriter("seatlist1230F9A2.txt", false);
                        BufferedWriter bf = new BufferedWriter(fw);
                        for (int i = 0; i < finalArray.length; i++) {
                            bf.write("" + finalArray[i]);
                        }
                        bf.close();
                    } catch (IOException io) {

                    }
                this.setVisible(false);
                    ReciptMovieTickeConfirm Iframe = new ReciptMovieTickeConfirm();
                    Iframe.setVisible(true);
            }

            if (MovieName == "Thor Love and Thunder" && ShowTime == "12:30 pm") {

                    try {
                        FileWriter fw = new FileWriter("seatlist1230thorA2.txt", false);
                        BufferedWriter bf = new BufferedWriter(fw);
                        for (int i = 0; i < finalArray.length; i++) {
                            bf.write("" + finalArray[i]);
                        }
                        bf.close();
                    } catch (IOException io) {

                    }

                this.setVisible(false);
                    ReciptMovieTickeConfirm Iframe = new ReciptMovieTickeConfirm();
                    Iframe.setVisible(true);
            }
        }

        else if(e.getSource() == BackButton) {
            this.setVisible(false);
       SeatFrame seat = new SeatFrame(MovieName,ShowTime);
          seat.setVisible(true);
        }

    }
}
