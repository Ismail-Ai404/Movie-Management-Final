package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyOrRentFrame extends JFrame implements ActionListener {
    JRadioButton buy;
    JRadioButton johnWick;
    JRadioButton f9;
    JRadioButton thor;
    JRadioButton rent;

    JButton home;
    JButton showtimeButton;
    public static int x=0;

    BuyOrRentFrame(){

        JLabel label= new JLabel();
        label.setOpaque(true);
        //label.setBackground(Color.BLACK);

        label.setBounds(50,200,350,500);

        label.setLayout(new FlowLayout());


        johnWick = new JRadioButton("John Wick Chapter 4");
        johnWick.setFont(new Font("Comic Sans",Font.BOLD,25));
        johnWick.setFocusable(false);
        johnWick.setVisible(true);

        f9 = new JRadioButton("Fast & Furious 9");
        f9.setFont(new Font("Comic Sans",Font.BOLD,25));
        f9.setFocusable(false);
        f9.setVisible(true);

        thor = new JRadioButton("Thor Love and Thunder");
        thor.setFont(new Font("Comic Sans",Font.BOLD,25));
        thor.setFocusable(false);
        thor.setVisible(true);

        buy = new JRadioButton("Buy For BDT 500");
        buy.setFont(new Font("Comic Sans",Font.ITALIC,20));
        buy.setFocusable(false);
        buy.setVisible(true);

        rent = new JRadioButton("Rent for a month For BDT 300");
        rent.setFont(new Font("Comic Sans",Font.ITALIC,20));
        rent.setForeground(Color.darkGray);
        rent.setFocusable(false);
        rent.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(johnWick);
        group.add(f9);
        group.add(thor);

        ButtonGroup group1= new ButtonGroup();
        group1.add(buy);
        group1.add(rent);

        johnWick.addActionListener(this);
        f9.addActionListener(this);
        thor.addActionListener(this);

        rent.addActionListener(this);
        buy.addActionListener(this);


        label.add(johnWick);
        label.add(f9);
        label.add(thor);

        label.add(buy);
        label.add(rent);
        label.setVisible(true);


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(20,50,500,500);

        //layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label, Integer.valueOf(1));
        //ImageIcon dvd1=new ImageIcon("C:\\Users\\ayon0\\OneDrive\\Desktop\\Project\\DVD\\buy.jpg");
        ImageIcon dvd2=new ImageIcon("src/project/img/DVD/BuyorRent.png");


        JLabel label1=new JLabel();
        label1.setIcon(dvd2);
        label1.setVisible(true);
        label1.setOpaque(true);
        label1.setBounds(-100,-80,1600,900);
        label1.setVisible(true);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label

        showtimeButton=new JButton();
        showtimeButton.setBounds(1100,40,250,100);
        //showtimeButton.setHorizontalAlignment(JshowtimeButton.TOP);
        //showtimeButton.addActionListener(e -> System.out.println("poo"));
        showtimeButton.addActionListener(this);
        showtimeButton.setText("Showtimes");
        showtimeButton.setFocusable(false);
        //showtimeButton.setIcon(icon);
        //showtimeButton.setHorizontalTextPosition(JshowtimeButton.CENTER);
        showtimeButton.setFont(new Font("Comic Sans",Font.BOLD,30));
        showtimeButton.setIconTextGap(-15);
        showtimeButton.setForeground(Color.BLACK);
        //showtimeButton.setBackground(Color.BLACK);
        showtimeButton.setOpaque(false);
        showtimeButton.setContentAreaFilled(false);
        showtimeButton.setBorderPainted(false);
        //showtimeButton.setBackground(new Color(123,50,250));
        showtimeButton.setBorder(BorderFactory.createCompoundBorder());
        //showtimeButton.setEnabled(false);
        showtimeButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {

                showtimeButton.setFont(new Font("MS Gothic",Font.BOLD,35));
                showtimeButton.setForeground(Color.RED);

            }
            public void mouseExited(java.awt.event.MouseEvent evt) {


                showtimeButton.setForeground(Color.BLACK);
                showtimeButton.setFont(new Font("Comic Sans",Font.BOLD,30));
            }
        });

        home=new JButton();
        home.setBounds(1100,160,250,100);
        //home.setHorizontalAlignment(Jhome.TOP);
        //home.addActionListener(e -> System.out.println("poo"));
        home.addActionListener(this);
        home.setText("Home");
        home.setFocusable(false);
        //home.setIcon(icon);
        //home.setHorizontalTextPosition(Jhome.CENTER);
        home.setFont(new Font("Comic Sans",Font.BOLD,30));
        //home.setIconTextGap(-15);
        home.setForeground(Color.BLACK);
        //home.setBackground(Color.BLACK);
        home.setOpaque(false);
        home.setContentAreaFilled(false);
        home.setBorderPainted(false);
        home.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {

                home.setFont(new Font("MS Gothic",Font.BOLD,35));
                home.setForeground(Color.DARK_GRAY);

            }
            public void mouseExited(java.awt.event.MouseEvent evt) {


                home.setForeground(Color.BLACK);
                home.setFont(new Font("Comic Sans",Font.BOLD,30));
            }
        });

        this.setTitle("Select DVD Rent or Buy");

        this.setSize(new Dimension(1600, 900));
        //this.setLayout(null);
        //this.setIconImage(main1.getImage());
        //this.setDefaultCloseOperation(Jthis.EXIT_ON_CLOSE);
        //this.setResizable(false);
        //this.setSize(1200,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(null);
        //this.setSize(500,500);
        this.add(showtimeButton);
        this.add(home);

        this.add(layeredPane);
        this.add(label1);

        this.setVisible(true);

        //this.add(label);
        //this.pack();

    }

    public  void checkout(int amount,String movie,String type){

       // System.out.println(y+"\t"+movie);
        setVisible(false);
        ReciptFrameRent seat = new ReciptFrameRent(movie,amount,type);
        seat.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String Movie="";
        String type="";

        int price;
        if(e.getSource()==showtimeButton){
            this.dispose();
            new ShowtimeFrame();
            //label.setVisible(true);
        }

        if(e.getSource()==home){
            this.dispose();
            new MainFrame();
            //label.setVisible(true);
        }

        if(e.getSource()==johnWick) {
            x=1;

        }
        if(e.getSource()==f9) {
            x=2;

        }
        if(e.getSource()==thor) {
            x=3;

        }
        if(e.getSource()==rent) {
            price = 300;
            type = "Rent";
            if(x==1)
            {
                checkout(price,"John Wick Chapter 4",type);

                x=0;
            }
            if(x==2)
            {
                checkout(price,"Fast & Furious 9",type);

                x=0;
            }
            if(x==3)
            {
                checkout(price,"Thor Love and Thunder",type);

                x=0;
            }
        }
            if(e.getSource()==buy) {
                price = 500;
                type = "Buy";

                if(x==1)
                {
                    checkout(price,"John Wick Chapter 4",type);
                    x=0;
                }
                if(x==2)
                {
                    checkout(price,"Fast & Furious 9",type);
                    x=0;
                }
                if(x==3)
                {
                    checkout(price,"Thor Love and Thunder",type);
                    x=0;
                }
            }



        }
    }

