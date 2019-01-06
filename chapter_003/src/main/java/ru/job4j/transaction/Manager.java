package ru.job4j.transaction;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Averianov Yuriy;
 * @since 04.01.2019;
 */
public class Manager {
    private final User user = new User();
    private final Account account = new Account();
    private final List<User> users = new ArrayList<>();
    //private final List<Account> account = new ArrayList<>();
    private final Map<User, List<Account>> usersAccounts = new HashMap<>();
    public static final Random RN = new Random();
    private String name;
    private String passport;
    /**
     * добавление пользователя;
     * @param user - овый пользователь;
     */
    public void addUser(User user) {
       this.users.add(users.size(), user);
    }
    /**
     * удаление пользователя;
     * @param user - данные пользователя;
     */
    public void deleteUser(User user) {
        this.users.remove(user.getPassport());
    }
    /**
     * добавить счёт пользователю;
     * @param passport - номер паспорта;
     * @param account - новый аккаунт;
     */
    public void addAccountToUser(String passport, Account account) {
        List<Account> result = new ArrayList<>();
        result.add(result.size(), account);
        this.usersAccounts.putIfAbsent(user.setPassport(passport), result);
    }
    /**
     * удалить один счёт пользователя;
     * @param passport - номер паспорта;
     * @param account - aккаунт;
     */
    public void deleteAccountFromUser(String passport, Account account) {}

    /**
     * получить список счетов для пользователя;
     * @param passport
     * @return - возвращает список всех счетов пользователя;
     */
    public List<Account> getUserAccounts (String passport) {
        Map<User, List<Account>> result = new HashMap<>();
        for(User i : users) {
            if(i.getPassport().equals(passport)) {
                usersAccounts.put(i, result);
            }
        }
        return result;
    }

    /**
     * метод для перечисления денег с одного счёта на другой счёт:
     * если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false;
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param dstRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney (String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {}
    /**
     * Метод генерирует уникальный номер счета для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}
