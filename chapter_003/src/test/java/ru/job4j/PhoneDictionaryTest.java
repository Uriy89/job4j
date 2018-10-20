package ru.job4j;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Yuriy", "Averianov", "934-67-73", "SPb")
        );
        List<Person> persons = phones.find("Yuriy");
        assertThat(persons.iterator().next().getSurname(), is("Averianov"));
    }
}
