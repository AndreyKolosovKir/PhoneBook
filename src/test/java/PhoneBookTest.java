import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


public class PhoneBookTest {


    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Karl";
        long number = 89995556677L;
        HashMap<String, Long> test = new HashMap<>();
        test.put(name, number);

        int expected = test.size();

        int result = phoneBook.add(name, number, test);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String name1 = "Karl1";
        long number1 = 89995556688L;
        HashMap<String, Long> test = new HashMap<>();
        phoneBook.add(name1, number1, test);

        String expected = "Karl1";

        String result = phoneBook.findByNumber(89995556688L, test);

        Assertions.assertEquals(expected, result);
    }
}
