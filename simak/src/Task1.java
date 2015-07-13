package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Simak on 09.07.2015.
 */

//Считать файл построчно и если есть слово word вывести эти строки
public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new FileReader("D:/txt2.txt"));


        String s="";

        while((s=br.readLine())!=null)
        {
            if(s.contains("word"))
            {
                System.out.println(s);
            }
        }

        br.close();

        //создаем переменные внутренних классов
        Outer  inner=new Outer(); //создаем внешний обьект
        inner.a=10;


        Outer.Inner inner2=inner.new Inner();//потом создаем обьект внутреннего класса
        inner2.b=20;
        inner2.print();

    }
}

//



//Тема внутренние классы
class Outer {
    double a;

    public class Inner{
        double b;

        public void print() {
            System.out.println(a+" "+b);
            //Можно обьявить класс даже внутри методов  //Создать этот обьект снаружи никак нельзя, можно только внутри метода
            class In{

            }
        }

    }
}
