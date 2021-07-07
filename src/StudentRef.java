/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vignesh
 */
public class StudentRef {
    String PRN,NAME,CLASS,PHONE;
    
    public StudentRef(String prn,String nm,String cl, String ph)
    {
        this.PRN=prn;
        this.NAME=nm;
        this.CLASS=cl;
        this.PHONE=ph;
        
        
    }
    public String getPrn()
    {
        return PRN;
    }
    public String getName()
    {
        return NAME;
    }
    public String getClas()
    {
        return CLASS;
    }
    public String getPhone()
    {
        return PHONE;
    }

    
}
