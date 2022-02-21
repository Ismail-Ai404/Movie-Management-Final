package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
// login
// work on preOrder
public class DvdFrame extends JFrame implements ActionListener{

    JButton preOrder;
    JButton home;
    JButton loginButton;
    JButton showtimeButton;

    DvdFrame(){

        JLabel label1= new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.BLACK);
        ImageIcon thor=new ImageIcon("src/project/img/DVD/Thor2.jfif");
        label1.setIcon(thor);
        label1.setBounds(50,30,250,348);

        JLabel label2= new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        ImageIcon f9=new ImageIcon("src/project/img/DVD/F9.jpg");
        label2.setIcon(f9);
        label2.setBounds(200,230,220,348);

        JLabel label3= new JLabel();
        ImageIcon johnwick=new ImageIcon("src/project/img/DVD/JohnWick.png");
        label3.setIcon(johnwick);

        //label3.setOpaque(true);

        //label3.setBackground(Color.BLUE);
        label3.setBounds(300,400,220,348);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        //layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label1, Integer.valueOf(1));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(3));

        //JFrame this = new JFrame("JLayeredPane");



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

        loginButton=new JButton();
        loginButton.setBounds(1100,100,250,100);
        //loginButton.setHorizontalAlignment(JloginButton.TOP);
        //loginButton.addActionListener(e -> System.out.println("poo"));
        loginButton.addActionListener(this);
        loginButton.setText("Login");
        loginButton.setFocusable(false);
        //loginButton.setIcon(icon);
        //loginButton.setHorizontalTextPosition(JloginButton.CENTER);
        loginButton.setFont(new Font("Comic Sans",Font.BOLD,30));
        //loginButton.setIconTextGap(-15);
        loginButton.setForeground(Color.BLACK);
        //loginButton.setBackground(Color.BLACK);
        loginButton.setOpaque(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setBorderPainted(false);
        //loginButton.setBackground(new Color(123,50,250));
        //loginButton.setBorder(BorderFactory.createCompoundBorder());
        //loginButton.setEnabled(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {

                loginButton.setFont(new Font("MS Gothic",Font.BOLD,35));
                loginButton.setForeground(Color.DARK_GRAY);

            }
            public void mouseExited(java.awt.event.MouseEvent evt) {


                loginButton.setForeground(Color.BLACK);
                loginButton.setFont(new Font("Comic Sans",Font.BOLD,30));
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
                home.setForeground(Color.ORANGE);

            }
            public void mouseExited(java.awt.event.MouseEvent evt) {


                home.setForeground(Color.BLACK);
                home.setFont(new Font("Comic Sans",Font.BOLD,30));
            }
        });

        preOrder=new JButton();
        preOrder.setBounds(0,0,520,900);
        //preOrder.setHorizontalAlignment(JpreOrder.TOP);
        //preOrder.addActionListener(e -> System.out.println("poo"));
        preOrder.addActionListener(this);
        //preOrder.setText("Pre");
        preOrder.setFocusable(false);
        //preOrder.setIcon(icon);
        //preOrder.setHorizontalTextPosition(JpreOrder.CENTER);
        //preOrder.setFont(new Font("Comic Sans",Font.BOLD,30));
        //preOrder.setIconTextGap(-15);
        //preOrder.setForeground(Color.BLACK);
        //preOrder.setBackground(Color.BLACK);
        preOrder.setOpaque(false);
        preOrder.setContentAreaFilled(false);
        preOrder.setBorderPainted(false);
        this.add(preOrder);


        //ImageIcon dvd1=new ImageIcon("C:\\Users\\ayon0\\OneDrive\\Desktop\\Project\\DVD\\buy.jpg");
        ImageIcon dvd2=new ImageIcon("src/project/img/DVD/BuyorRent.png");



        JLabel label=new JLabel();
        //int x= (int) (1+Math.random()*6);
        //if(x==1 || x==4 || x==5 || x==6)
            label.setIcon(dvd2);
        //if (x==2 || x==3)
            //label.setIcon(dvd2);

        label.setVisible(true);
        label.setOpaque(true);
        label.setBounds(-50,-80,1600,900);
        //label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        //label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        layeredPane.add(label, Integer.valueOf(0));



        this.setTitle("DVD Rent or Buy");

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
        this.add(loginButton);
        this.add(home);
        this.add(layeredPane);

        this.setVisible(true);
        //this.add(label);
        //this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==showtimeButton){
            this.dispose();
            new ShowtimeFrame();
            //label.setVisible(true);
        }

        if(e.getSource()==preOrder){
            this.dispose();
            new BuyOrRentFrame();
            //label.setVisible(true);
        }
        if(e.getSource()==home){
            this.dispose();
            new MainFrame();
            //label.setVisible(true);
        }
        if(e.getSource()==loginButton){
            this.dispose();
            new lgn();
            //label.setVisible(true);
        }

    }

}
