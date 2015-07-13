package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.Callable;

/**
 * Created by User on 09.07.2015.
 */
public class Task3 {
    public static void main(String[] args) throws IOException {

        //взять фай и посчитать 20 самых популярных посчитаь их количество и  скорость


        //как измерить время
        long start=System.currentTimeMillis();

        BufferedReader reader= new BufferedReader(new FileReader("D:/aa.txt"));
        Map<String, Tuple> map =new HashMap<>();  //передаем строку и счетчик в интерфейс //хранит значение по ключу


        String s="";
        while((s=reader.readLine())!=null)
        {
            s=s.trim();//отбрасываем пробелы в начале и конце

            //разбиваем строку на пробелы

            String[] words=s.split("[ ]+"); //[ ] это для того, чтобы если рядомс стоят несколько пробелов, а не один, то их отбросить

            for(String word: words){
                if(map.containsKey(word)){ //делаем проверку передаем ключ //если такое слово уже есть, то счетчик увеличиваем
                   Tuple tuple=map.get(word);
                    tuple.count++;

                }//если не встречается, то ложим новое слово в коллекцию
                else{
                    map.put(word, new Tuple(word, 1));
                }

            }

        }



        List<Tuple> list= new ArrayList<>();
        list.addAll(map.values());

        Collections.sort(list);

        for(int i=0; i<20; i++)
        {
            System.out.println(list.get(i));
        }


//как измерить время

   long end=System.currentTimeMillis();
        System.out.println("VREMIA");
        System.out.println(end-start);

        reader.close();
    }
    }


//для счетчика
class Tuple implements Comparable<Tuple>{
    public String word;
    public int count;

    public Tuple(String word, int count)
    {
        this.word=word;
        this.count=count;
    }

    @Override  //ctrl+пробел
    public String toString() {
        return String.format("(%s, %d", word, count);
    }


    @Override
    public int compareTo(Tuple o) {
        return -Integer.compare(this.count, o.count);  //-int для тго чтобы отсортировал от большего к меньшему
    }
}