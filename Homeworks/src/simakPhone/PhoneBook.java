package simakPhone;

import java.util.UUID;

/**
 * Created by LSimak on 23.06.2015.
 */
 public class PhoneBook{
    private int id=0;
    private String name = "";
    private String surname = "";
    private String teg="";
    number_tip tip_phone;

    public PhoneBook(/*UUID id*/int id, String name, String surname,String teg, String number, String tip)
    {
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.teg=teg;
        tip_phone.setNumber(number);
        tip_phone.setTip(tip);

    }

    public void setId(int id) {this.id=id;}
    public void setName(String name) {this.name=name;}
    public void setSurname(String surname)  {this.surname=surname;}
    public void setTeg(String teg){this.teg=teg;}

    public int getId(){return id;}
    public String getName(){return  name;}
    public String getSurname(){return surname;}
    public String getTeg() {return teg;}

}
