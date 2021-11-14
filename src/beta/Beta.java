/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beta;

/**
 *
 * @author JoshBatey
 */
public class Beta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // new Konexio().konexio();
    //new Splanch().setVisible(true);
    Splanch sp = new Splanch(); 
    sp.setVisible(true);
        try 
        {
            for(int i =0;i<=100;i++)
            {
                Thread.sleep(10);
                sp.per_sl.setText(Integer.toString(i)+"%");
                sp.splanch_bar.setValue(i);
                Thread.sleep(10);
                if(i == 100)
                {
                    sp.setVisible(false);
                    new ViewLogin().setVisible(true);
                }
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
       
    }
    
}
