package simakPhone;

/**
 * Created by LSimak on 23.06.2015.
 */
public class number_tip {
    private String number="";
    private String tip="";


    public number_tip(String number, String tip) {
        this.number = number;
        this.tip = tip;
    }

    public void setNumber(String number){this.number=number;}
    public void setTip(String tip){this.tip=tip;}

    public String getNumber(){return number;}
    public String getTip(){return tip;}

    }
