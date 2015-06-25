package simakPhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by LSimak on 25.06.2015.
 */
public class MainClass {

    public static void main(String[] args) {

        reposit_mem<PhoneBook> phoneList = new memory();
        int output=30;

        while(output!=0)
        {
            System.out.printf("Dlia vivoda telefonnoi knigi nazhmite  1 \n");
            System.out.printf("Dlia dobavleniia zapisi nazhmite  2 \n");
            System.out.printf("Dlia ydaleniia zapisi nazhmite  3 \n");
            System.out.printf("Chtobi vnesti izmeneniia v zapis nazhmite  4 \n");
            System.out.printf("Dlia sortorovki zapisei nazhmite  5 \n");
            System.out.printf("Dlia vixoda nazhmite  0 \n");


            Scanner scanner = new Scanner(System.in);
            output = scanner.nextInt();

            switch (output){
                case 1: //phoneList.getAll();
                        break;

                case 2: break;

                case 3: break;

                case 4: break;

                case 5: break;

                case 0: System.out.printf("BY");
                        break;

                default: System.out.printf("OSHIBKA \n Poprobyite esche raz");
                         break;
            }

        }
    }
}
