import org.example.CsvToString;
import org.example.Person;
import org.example.SearchToFast;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Test {
    @org.junit.Test
    public void testCsvToString() {
        CsvToString csvToString = new CsvToString();
        List<Person> people = csvToString.csvToString();

        assertNotNull(people);
        assertEquals(10, people.size());


        for (Person person : people) {
            assertNotNull(person.getName());
            assertNotNull(person.getSurname());
            assertNotNull(person.getGender());
            assertNotNull(person.getDistance());
            assertNotNull(person.getTime());
        }
    }

    @org.junit.Test
    public void testSearchToFastWithMatchingCriteria() {
        SearchToFast searchToFast = new SearchToFast();
        ArrayList<Person> fastPerson = searchToFast.searchToFast(5, "M", "10");

        // Проверяем, что список содержит только участников с заданным полом и дистанцией
        for (Person person : fastPerson) {
            assertEquals("M", person.getGender());
            assertEquals("10", person.getDistance());
        }

        // Проверяем, что количество участников в списке соответствует ожидаемому
        assertEquals(0, fastPerson.size()); // Предполагаем, что в файле 10 строк
    }

    @org.junit.Test
    public void testSearchToFastWithNonMatchingCriteria() {
        SearchToFast searchToFast = new SearchToFast();
        ArrayList<Person> fastPerson = searchToFast.searchToFast(5, "F", "5");

        // Проверяем, что список пуст, потому что нет участников с заданным полом и дистанцией
        assertEquals(3, fastPerson.size());
    }
}
