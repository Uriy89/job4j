package ru.job4j;
import java.util.ArrayList;
import java.util.List;
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();
    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : persons) {
            if (key.equals(person.getName())
                    || key.equals(person.getSurname())
                    || key.equals(person.getPhone())
                    || key.equals(person.getAddress())
            ) {
                result.addAll(persons);
                break;
            }
        }
        return result;
    }
}
