package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class SeatFrameAudi2 extends JFrame implements ActionListener
{
       Container container = getContentPane();

       JButton[] seatButton = new JButton[270];
       Clicklistener click= new Clicklistener();
       int[] seatArray = new int[270];
       int[] seatSelectArray = new int[270];

       String name = "Auditorium 2";
       JLabel seatLevel = new JLabel(name);
       JLabel seatList = new JLabel("");
       JLabel screenlevel = new JLabel("");

       JLabel[] rowNum = new JLabel[9];
       JLabel[] colNum = new JLabel[30];

       JButton confirmButton = new JButton("Confirm Booking");
       JButton cancelButton = new JButton("Back");

      // Icon icSel = new ImageIcon("src/theory/backup/img/main/selected.jpg");

      public static  String MovieName="",ShowTime="";

   SeatFrameAudi2(String movieName, String time) {

       MovieName = movieName;
       ShowTime = time;

       String s1;
       char c;

       if (MovieName == "John Wick Chapter 4" && ShowTime == "5:00 pm") {

           try {
               FileReader fw2 = new FileReader("seatlist500JohnA2.txt");
               BufferedReader bf2 = new BufferedReader(fw2);

               while ((s1 = bf2.readLine()) != null) {
                   for (int i =0;i < seatArray.length;i++)
                   {
                       c = s1.charAt(i);
                       seatArray[i] = Character.getNumericValue(c);
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

               while ((s1 = bf2.readLine()) != null) {
                   for (int i =0;i < seatArray.length;i++)
                   {
                       c = s1.charAt(i);
                       seatArray[i] = Character.getNumericValue(c);
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

               while ((s1 = bf2.readLine()) != null) {
                   for (int i =0;i < seatArray.length;i++)
                   {
                       c = s1.charAt(i);
                       seatArray[i] = Character.getNumericValue(c);
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

               while ((s1 = bf2.readLine()) != null) {
                   for (int i =0;i < seatArray.length;i++)
                   {
                       c = s1.charAt(i);
                       seatArray[i] = Character.getNumericValue(c);
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

               while ((s1 = bf2.readLine()) != null) {
                   for (int i =0;i < seatArray.length;i++)
                   {
                       c = s1.charAt(i);
                       seatArray[i] = Character.getNumericValue(c);
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

               while ((s1 = bf2.readLine()) != null) {
                   for (int i =0;i < seatArray.length;i++)
                   {
                       c = s1.charAt(i);
                       seatArray[i] = Character.getNumericValue(c);
                   }

               }

               bf2.close();
           } catch (Exception ee) {
           }
       }




       this.setTitle("Movie Management");
       this.setBounds(10,10,1300,800);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);

       this.setIconImage(Toolkit
               .getDefaultToolkit()
               .getImage( "src/project/img/images.png"));
       //Initialize();
       allSeat();
       addActionEvent();
 }


    public void allSeat() {

        container.setLayout(null);
        container.setBackground( new Color(253, 253, 253));

        /// book seat level
        seatLevel.setBounds(1025,480,252,156);
        seatLevel.setForeground(new Color( 2, 46, 22));
        seatLevel.setFont(new Font("San Francisco",Font.BOLD,25));
        seatLevel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(seatLevel);


        // confirm button code
        confirmButton.setBounds(1050,600,180,30);
        confirmButton.setForeground(new Color(235, 241, 238));
        confirmButton.setHorizontalAlignment(SwingConstants.CENTER);
        confirmButton.setVerticalTextPosition(SwingConstants.CENTER);
        confirmButton.setBackground( new Color(21, 21, 21));
        confirmButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        container.add(confirmButton);


        // cancel button code
        cancelButton.setBounds(1100,650,100,30);
        cancelButton.setForeground(new Color(235, 241, 238));
        cancelButton.setHorizontalAlignment(SwingConstants.CENTER);
        cancelButton.setVerticalTextPosition(SwingConstants.CENTER);
        cancelButton.setBackground( new Color(21, 21, 21));
        cancelButton.setFont(new Font("San Francisco",Font.HANGING_BASELINE,17));
        container.add(cancelButton);

        // All seat
        int x = 100;
        int y = 140;
        Icon ic1 = new ImageIcon("src/project/img/main/red.png");;
        Icon icOcup = new ImageIcon("src/project/img/main/occupy.png");


        for(int i=0; i < seatButton.length; i++){
            if( i == 30 || i == 60 || i == 90 || i == 120 || i == 150 || i == 180 || i == 210 || i == 240 ) {
                y = y + 50;
                x = 100;
            }

            if(i == 90 ) {
                ic1 = new ImageIcon("src/project/img/main/yellow.jpg");
            }
            else if(i == 180 ) {
                ic1 = new ImageIcon("src/project/img/main/black.jpg");
            }

            if(seatArray[i]==9)
                seatButton[i] = new JButton(String.valueOf(i),icOcup);
            else
                seatButton[i] = new JButton(String.valueOf(i),ic1);

            seatButton[i].setBounds(x,y,25,25);
            seatButton[i].setBorder(BorderFactory.createEmptyBorder());
            seatButton[i].addActionListener(click);
            container.add(seatButton[i]);

            x = x + 30;
        }

        // row show
        x= 70;
        y =100;
        int row = 65;
        for(int i=0; i < rowNum.length; i++){

            rowNum[i] = new JLabel(Character.toString((char)row));
            row = row + 1;

            rowNum[i].setBounds(x,y,300,100);
            rowNum[i].setForeground(new Color(3, 28, 252));
            rowNum[i].setFont(new Font("San Francisco",Font.BOLD,20));

            y = y + 50;

            container.add(rowNum[i]);
        }


        // col show
        x= 100;
        y =600;
        int col = 1;
        for(int i=0; i < colNum.length; i++){

            colNum[i] = new JLabel(Integer.toString(col));
            col = col + 1;
            colNum[i].setBounds(x,y,300,100);
            colNum[i].setForeground(new Color(3, 28, 252));
            colNum[i].setFont(new Font("San Francisco",Font.BOLD,20));
            x = x + 30;
            container.add(colNum[i]);
        }


        // Rightside image
        ImageIcon iconLogo = new ImageIcon("src/project/img/mixed/SeatList3.png");
        seatList.setIcon(iconLogo);
        seatList.setBounds(1050,150,160,273);
        container.add(seatList);

        // screen image
        ImageIcon screenlogo = new ImageIcon("src/project/img/mixed/screen.PNG");
        screenlevel.setIcon(screenlogo);
        screenlevel.setBounds(200,50,760,80);
        container.add(screenlevel);

    }



   public void addActionEvent(){
       confirmButton.addActionListener(this);
       cancelButton.addActionListener(this);
   }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == confirmButton){


            this.setVisible(false);

            ReciptFrameAudi2 reciptA2 = new ReciptFrameAudi2(MovieName,ShowTime,2,seatSelectArray);
            reciptA2.setVisible(true);
        }

        else if(e.getSource() == cancelButton){
            this.setVisible(false);

            ShowtimeFrame ShowtimeFrame = new ShowtimeFrame();
            ShowtimeFrame.setVisible(true);
        }

        else if (e.getSource() instanceof JButton) {
            display();
        }
    }

    private class Clicklistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

            if (e.getSource() instanceof JButton)
            {

                String text = ((JButton) e.getSource()).getText();
                Icon icSel = new ImageIcon("src/project/img/main/selected.jpg");
                if(seatArray[Integer.parseInt(text)] != 9){
                    seatButton[Integer.parseInt(text)].setIcon(icSel);

                    if(Integer.parseInt(text) >= 180)
                        seatSelectArray[Integer.parseInt(text)] = 4; // 3rd
                    else if(Integer.parseInt(text) >= 90)
                        seatSelectArray[Integer.parseInt(text)] = 3; // 2nd
                    else
                        seatSelectArray[Integer.parseInt(text)] = 2; // 1st
                }
                else
                    seatSelectArray[Integer.parseInt(text)] = 9;


            }

        }
    }


    public void display(){

        for (int i =0;i < seatArray.length;i++)
        {
            seatArray[i] = 0 ;
            JOptionPane.showMessageDialog(null, seatArray[i]);
        }
    }



}