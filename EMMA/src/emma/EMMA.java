/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emma;

/**
 *
 * @author OLUSOLA FOLAKEMI
 */
public class EMMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        try
        {
            for(int x=0 ; x<=100;x++)
            {
                Thread.sleep(100);
                sp.loadbar.setValue(x);
                if (x >= 25 && x <= 50)
                {
                    sp.label.setText("Getting ready...");
                }
                if (x >= 51 && x <= 80)
                {
                    sp.label.setText("Setting up work environment...");
                }
                if (x >= 81)
                {
                    sp.label.setText("Finishing up...");
                }
                if (x == 100)
                {
                    Home ho = new Home();
                    sp.setVisible(false);
                    ho.setVisible(true);
                }
            }
        }
        catch(Exception e)
        {
            System.exit(1);
        }
    }
    
}
//|||||||