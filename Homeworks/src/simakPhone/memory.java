package simakPhone;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by LSimak on 23.06.2015.
 */
public class memory implements reposit_mem<PhoneBook>{

    List<PhoneBook> ph_book = new ArrayList<>();

    public memory() {
            ph_book.add(new PhoneBook(0, "Ivan", "Ivanov", "friends", "356-55-14", "home"));
            ph_book.add(new PhoneBook(1, "Petr", "Petrov", "colleague", "123-14-54", "work"));
            ph_book.add(new PhoneBook(2, "Sidor", "Sidorov", "family", "236-14-25", "home"));
        }


    @Override
    public PhoneBook get(int id) {

      /*  for (PhoneBook item : ph_book) {
            PhoneBook = PhoneBook + item + " ";
        }

        editResult.setText(PhoneBook);*/
    }

    @Override
    public List<PhoneBook> getAll() {

    }

    @Override
    public void add(PhoneBook entity) {


    }

    @Override
    public void remove(PhoneBook entity /*int id????*/) {
        ph_book.remove(int id);

    }

    @Override
    public void update(PhoneBook entity) {

    }

    @Override
    public List<PhoneBook> sort(PhoneBook entity) {
        return null;
    }
}

