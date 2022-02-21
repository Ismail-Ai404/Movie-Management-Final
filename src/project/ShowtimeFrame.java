package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

// NEEDS A LOT OF WORK
public class ShowtimeFrame extends JFrame implements ActionListener {


    JButton home;
    JButton bookButton;
    JRadioButton Audi1;
    JRadioButton johnWick;
    JRadioButton f9;
    JRadioButton thor;
    JRadioButton Audi2;
    JRadioButton time1230;
    JRadioButton time500;

    public static int a=0,b=0,c=0 , audi = 0;
    public static String MovieName="",Time="";

    
 ShowtimeFrame(){
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        this.setVisible(true);

    JPanel TopHeadPanel = new JPanel();
    JPanel LeftTimePanel = new JPanel();
    JPanel RightAudiPanel = new JPanel();
    JPanel BottomHomePanel = new JPanel();
    JPanel CenterPanel = new JPanel();

        TopHeadPanel.setBackground(Color.DARK_GRAY);
        LeftTimePanel.setBackground(Color.DARK_GRAY);
        RightAudiPanel.setBackground(Color.DARK_GRAY);
        BottomHomePanel.setBackground(Color.DARK_GRAY);
        CenterPanel.setBackground(Color.BLACK);

        CenterPanel.setLayout(new BorderLayout());

        TopHeadPanel.setPreferredSize(new Dimension(100,100));
        LeftTimePanel.setPreferredSize(new Dimension(150,100));
        RightAudiPanel.setPreferredSize(new Dimension(150,100));
        BottomHomePanel.setPreferredSize(new Dimension(100,100));
        CenterPanel.setPreferredSize(new Dimension(100,100));

    //------------- sub panels --------------------

    JPanel CenterTopPanel = new JPanel();
    JPanel CenterBottomPanel = new JPanel();
    JPanel CenterLeftPanel = new JPanel();
    JPanel CenterRightPanel = new JPanel();
    JPanel CenterCenterWhitePanel = new JPanel();

        CenterTopPanel.setBackground(Color.black);
        CenterBottomPanel.setBackground(Color.BLACK);
        CenterLeftPanel.setBackground(Color.gray);
        CenterRightPanel.setBackground(Color.lightGray);
        CenterCenterWhitePanel.setBackground(Color.white);

        CenterPanel.setLayout(new BorderLayout());

        CenterTopPanel.setPreferredSize(new Dimension(50,50));
        CenterBottomPanel.setPreferredSize(new Dimension(50,50));
        CenterLeftPanel.setPreferredSize(new Dimension(50,50));
        CenterRightPanel.setPreferredSize(new Dimension(50,50));
        CenterCenterWhitePanel.setPreferredSize(new Dimension(50,50));

        CenterPanel.add(CenterTopPanel,BorderLayout.NORTH);
        CenterPanel.add(CenterBottomPanel,BorderLayout.SOUTH);
        CenterPanel.add(CenterLeftPanel,BorderLayout.WEST);
        CenterPanel.add(CenterRightPanel,BorderLayout.EAST);
        CenterPanel.add(CenterCenterWhitePanel,BorderLayout.CENTER);

    //------------- sub panels --------------------
        JLabel label=new JLabel("Showtime");
        //label.setBounds(150,150,2500,1000);
        label.setVisible(true);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setHorizontalTextPosition(50);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        //label.setIconTextGap(-25);
        label.setForeground(Color.BLACK); //set font color of text
        label.setBackground(Color.darkGray);
        label.setFont(new Font("MS Gothic",Font.BOLD,100)); //set font of text
        //label.setBounds(0,0,2000,1000);
        TopHeadPanel.add(label);

     JLabel label5=new JLabel("Select Movie");
     //label.setBounds(150,150,2500,1000);
     label5.setVisible(true);
     label5.setOpaque(true);
     label5.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
     label5.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
     //label.setHorizontalTextPosition(50);
     label5.setHorizontalTextPosition(JLabel.CENTER);
     label5.setVerticalTextPosition(JLabel.TOP);
     //label.setIconTextGap(-25);
     label5.setForeground(Color.WHITE); //set font color of text
     label5.setBackground(Color.BLACK);
     label5.setFont(new Font("MS Gothic",Font.BOLD,36)); //set font of text
     //label.setBounds(0,0,2000,1000);
     CenterTopPanel.add(label5);

     JLabel label1= new JLabel();
     label1.setOpaque(true);
     //label1.setBackground(Color.BLACK);

     label1.setBounds(50,200,350,500);

     label1.setLayout(new FlowLayout());


     johnWick = new JRadioButton("John Wick Chapter 4");
     johnWick.setFont(new Font("Comic Sans",Font.BOLD,30));
     johnWick.setFocusable(false);
     johnWick.setVisible(true);
     johnWick.setBackground(Color.white);
     f9 = new JRadioButton("Fast & Furious 9");
     f9.setFont(new Font("Comic Sans",Font.BOLD,30));
     f9.setFocusable(false);
     f9.setBackground(Color.white);
     f9.setVisible(true);

     thor = new JRadioButton("Thor Love and Thunder");
     thor.setFont(new Font("Comic Sans",Font.BOLD,30));
     thor.setFocusable(false);
     thor.setBackground(Color.white);
     thor.setVisible(true);


     Audi1 = new JRadioButton("Auditorium 1");
     Audi1.setFont(new Font("Comic Sans",Font.BOLD,15));
     Audi1.setBackground(Color.DARK_GRAY);
     Audi1.setForeground(Color.WHITE);
     Audi1.setFocusable(false);
     Audi1.setVisible(true);

     time1230 = new JRadioButton("12:30 pm");
     time1230.setFont(new Font("Comic Sans",Font.BOLD,20));
     time1230.setBackground(Color.DARK_GRAY);
     time1230.setForeground(Color.WHITE);
     time1230.setFocusable(false);
     time1230.setVisible(true);

     time500 = new JRadioButton("5:00 pm");
     time500.setFont(new Font("Comic Sans",Font.BOLD,20));
     time500.setForeground(Color.WHITE);
     time500.setBackground(Color.DARK_GRAY);
     time500.setFocusable(false);

     time500.setVisible(true);

     Audi2 = new JRadioButton("Auditorium 2");
     Audi2.setFont(new Font("Comic Sans",Font.BOLD,15));
     Audi2.setForeground(Color.WHITE);
     Audi2.setBackground(Color.DARK_GRAY);
     Audi2.setFocusable(false);
     Audi2.setVisible(true);

     ButtonGroup TimeGroup = new ButtonGroup();
     TimeGroup.add(time1230);
     TimeGroup.add(time500);
     //group3.add(thor);

     ButtonGroup group = new ButtonGroup();
     group.add(johnWick);
     group.add(f9);
     group.add(thor);
        
     
     
     ButtonGroup group1= new ButtonGroup();
     group1.add(Audi1);
     group1.add(Audi2);

     johnWick.addActionListener(this);
     f9.addActionListener(this);
     thor.addActionListener(this);

     Audi2.addActionListener(this);
     Audi1.addActionListener(this);

     time500.addActionListener(this);
     time1230.addActionListener(this);


     //johnWick.setIcon(pizzaIcon);
     //f9.setIcon(hamburgerIcon);
     //thor.setIcon(hotdogIcon);

     CenterCenterWhitePanel.add(johnWick);
     CenterCenterWhitePanel.add(f9);
     CenterCenterWhitePanel.add(thor);

     LeftTimePanel.add(time1230);
     LeftTimePanel.add(time500);
     LeftTimePanel.setVisible(true);

     RightAudiPanel.add(Audi1);
     RightAudiPanel.add(Audi2);
     RightAudiPanel.setVisible(true);




     home=new JButton();
     home.setBounds(1100,0,250,100);
     //home.setHorizontalAlignment(Jhome.TOP);
     //home.addActionListener(e -> System.out.println("poo"));
     home.addActionListener(this);
     home.setText("Home");
     home.setFocusable(false);
     //home.setIcon(icon);
     home.setHorizontalTextPosition(JButton.CENTER);
     home.setVerticalTextPosition(JButton.TOP);
     home.setFont(new Font("MS Gothic",Font.BOLD,90));
     //home.setIconTextGap(-15);
     home.setForeground(Color.BLACK);
     //home.setBackground(Color.BLACK);
     home.setOpaque(false);
     home.setContentAreaFilled(false);
     home.setBorderPainted(false);
     home.addMouseListener(new java.awt.event.MouseAdapter() {

         public void mouseEntered(java.awt.event.MouseEvent evt) {

             //home.setFont(new Font("MS Gothic",Font.BOLD,100));
             home.setForeground(Color.LIGHT_GRAY);

         }
         public void mouseExited(java.awt.event.MouseEvent evt) {


             home.setForeground(Color.BLACK);
             home.setFont(new Font("MS Gothic",Font.BOLD,90));
         }
     });
        BottomHomePanel.add(home);

     bookButton=new JButton();
     bookButton.setBounds(1100,0,250,100);
     //bookButton.setHorizontalAlignment(JbookButton.TOP);
     //bookButton.addActionListener(e -> System.out.println("poo"));
     bookButton.addActionListener(this);
     bookButton.setText("Book your Tickets");
     bookButton.setFocusable(false);
     //bookButton.setIcon(icon);
     bookButton.setHorizontalTextPosition(JButton.CENTER);
     bookButton.setVerticalTextPosition(JButton.TOP);
     bookButton.setFont(new Font("MS Gothic",Font.BOLD,36));
     //bookButton.setIconTextGap(-15);
     bookButton.setForeground(Color.WHITE);
     //bookButton.setBackground(Color.BLACK);
     bookButton.setOpaque(false);
     bookButton.setContentAreaFilled(false);
     bookButton.setBorderPainted(false);
     bookButton.addMouseListener(new java.awt.event.MouseAdapter() {

         public void mouseEntered(java.awt.event.MouseEvent evt) {

             bookButton.setFont(new Font("MS Gothic",Font.BOLD,38));
             bookButton.setForeground(Color.RED);

         }
         public void mouseExited(java.awt.event.MouseEvent evt) {


             bookButton.setForeground(Color.WHITE);
             bookButton.setFont(new Font("MS Gothic",Font.BOLD,36));
         }
     });
     CenterBottomPanel.add(bookButton);

        this.add(TopHeadPanel,BorderLayout.NORTH);
        this.add(LeftTimePanel,BorderLayout.WEST);
        this.add(RightAudiPanel,BorderLayout.EAST);
        this.add(BottomHomePanel,BorderLayout.SOUTH);
        this.add(CenterPanel,BorderLayout.CENTER);
        this.setSize(new Dimension(1600, 900));
        this.setVisible(true);
        this.setTitle("Movie Management");
}

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==home){
            this.dispose();
            new MainFrame();
            //label.setVisible(true);
        }



            if(e.getSource()==johnWick){
                a=1;
                MovieName = "John Wick Chapter 4";
            }
            else if(e.getSource()==f9){
                a=1;
                MovieName = "Fast & Furious 9";
            }
            else if(e.getSource()==thor){
                a=1;
                MovieName = "Thor Love and Thunder";
            }


            if(e.getSource()==time500){
                b=1;
                Time="5:00 pm";
            }
            else if(e.getSource()==time1230){
                b=1;
                Time="12:30 pm";
            }


            if(e.getSource()==Audi2){
                c=1;
                audi =2;
                    }
            else if(e.getSource()==Audi1){
                c=1;
                audi = 1;
            }
        if(e.getSource()==bookButton){

            if(a==1 && b==1 && c==1)
            {
               this.dispose();
               // new MainFrame();
                if(audi == 1){

                    SeatFrame seat = new SeatFrame(MovieName,Time);

                    seat.setVisible(true);
                }

                else if(audi == 2){

                    SeatFrameAudi2 seatAudi2 = new SeatFrameAudi2(MovieName,Time);
                    seatAudi2.setVisible(true);
                }


            } else

                bookButton.setText("Please select all the option");

        }
        
    }
}
