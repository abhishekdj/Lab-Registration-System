 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vignesh
 */
public class Sample {
    String PRN,CHECKIN,CHECKOUT;
    
    public Sample(String prn,String ci,String co)
    {
        this.PRN=prn;
        this.CHECKIN=ci;
        this.CHECKOUT=co;
        
        
        
    }
        public String getPrn()
    {
        return PRN;
    }
    public String getCheckin()
    {
        return CHECKIN;
    }
    public String getCheckout()
    {
        return CHECKOUT;
    }

}
