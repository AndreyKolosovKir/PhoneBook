import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    protected String name = "Karl1";
    protected long number = 89995556677L;
    HashMap<String, Long> test = new HashMap<>();

    @Test
    public void testAdd() {

        test.put(name, number);

        int expected = test.size();

        int result = phoneBook.add(name, number, test);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {

        phoneBook.add(name, number, test);

        String expected = "Karl1";

        String result = phoneBook.findByNumber(89995556677L, test);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByName() {

        phoneBook.add(name, number, test);

        Long expected = 89995556677L;

        Long result = phoneBook.findByName("Karl1", test);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPrintAllNames() {

        phoneBook.add(name, number, test);

        List namesExpected = Arrays.asList("Karl1");

        List namesResult = phoneBook.printAllNames(test);

        Assertions.assertEquals(namesExpected, namesResult);
    }
}
