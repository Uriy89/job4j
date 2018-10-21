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
                new Person("Yuriy", "Averianov", "9346773", "SPb")
        );
        List<Person> persons = phones.find("Yuriy");
        assertThat(persons.iterator().next().getSurname(), is("Averianov"));
    }
    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Yuriy", "Averianov", "9346773", "SPb")
        );
        List<Person> persons = phones.find("Averianov");
        assertThat(persons.iterator().next().getName(), is("Yuriy"));
    }
    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Yuriy", "Averianov", "9346773", "SPb")
        );
        List<Person> persons = phones.find("9346773");
        assertThat(persons.iterator().next().getName(), is("Yuriy"));
    }
    @Test
    public void whenFindByAddres() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Yuriy", "Averianov", "9346773", "SPb")
        );
        List<Person> persons = phones.find("SPb");
        assertThat(persons.iterator().next().getName(), is("Yuriy"));
    }
}
