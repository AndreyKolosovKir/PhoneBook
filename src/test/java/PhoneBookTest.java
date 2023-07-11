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

        int result = phoneBook.add(name, number);


        Assertions.assertEquals(expected, result);
    }

}
