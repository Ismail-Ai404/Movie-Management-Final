package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.net.URI;
//-----------------------------100%--------------------------------
public class UserAgreement  {

    UserAgreement(){}

    public static void getPrivacyPolicy() throws Exception {

        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://www.termsfeed.com/live/5f7df168-a18f-4d1a-a61b-36c0f59e7e97"));
    }
    public static void getTermsAndCondition() throws Exception {

        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://www.termsfeed.com/live/97df441e-07ee-4e9b-b730-a9cd3ede8a9d"));
    }

    public static void getReturnAndRefund() throws Exception {

        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://www.termsfeed.com/live/503993ca-17d1-4f29-92f5-a550cba740f5"));
    }






}
