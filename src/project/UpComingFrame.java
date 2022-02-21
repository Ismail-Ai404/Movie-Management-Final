package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.net.URI;
//-----------------------------100%--------------------------------
public class UpComingFrame  {

    UpComingFrame(){}

    public static void getPrivacyPolicy() throws Exception {

        Desktop d=Desktop.getDesktop();
        int x=(int)(1+Math.random()*6);
        if(x==1)
        d.browse(new URI("https://www.youtube.com/watch?v=JuDLepNa7hw&ab_channel=MovieCoverage"));
        if (x==2)
            d.browse(new URI("https://www.youtube.com/watch?v=-FZ-pPFAjYY&ab_channel=FilmSelectTrailer"));
        if(x==3)
            d.browse(new URI("https://www.youtube.com/watch?v=rrwBnlYOp4g&ab_channel=ONEMedia"));
        if (x==4)
            d.browse(new URI("https://www.youtube.com/watch?v=BpdDN9d9Jio&ab_channel=ParamountPictures"));
        if(x==5)
            d.browse(new URI("https://www.youtube.com/watch?v=ldBroBrV6Fg&ab_channel=ONEMedia"));
        if (x==6)
            d.browse(new URI("https://www.youtube.com/watch?v=ybji16u608U&t=51s&ab_channel=MarvelEntertainment"));
    }








}
