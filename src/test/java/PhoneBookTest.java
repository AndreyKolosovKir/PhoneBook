import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


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

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        String name1 = "Karl1";
        long number1 = 89995556688L;
        HashMap<String, Long> test = new HashMap<>();
        phoneBook.add(name1, number1, test);


        Long expected = 89995556688L;

        Long result = phoneBook.findByName("Karl1", test);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        String name1 = "Karl1";
        long number1 = 89995556688L;
        HashMap<String, Long> test = new HashMap<>();
        phoneBook.add(name1, number1, test);

        List namesExpected = Arrays.asList("Karl1");

        List namesResult = phoneBook.printAllNames(test);

        Assertions.assertEquals(namesExpected, namesResult);
    }
}
