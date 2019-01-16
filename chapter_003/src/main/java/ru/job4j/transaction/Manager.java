package ru.job4j.transaction;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Averianov Yuriy;
 * @since 04.01.2019;
 */
public class Manager {
    private final Map<User, List<Account>> usersAccounts = new HashMap<>();
    private final List<Account> accounts = new ArrayList<>();

    /**
     * добавление пользователя;
     * @param user - овый пользователь;
     */
    public void addUser(User user) {
        this.usersAccounts.put(user, accounts);
    }
    /**
     * удаление пользователя;
     * @param user - данные пользователя;
     */
    public void deleteUser(User user) {
        this.usersAccounts.remove(user);
    }
    /**
     * добавить счёт пользователю;
     * @param passport - номер паспорта;
     * @param account - новый аккаунт;
     */
    public void addAccountToUser(String passport, Account account) {
        for(User user : this.usersAccounts.keySet()) {
            if(user.getPassport().equals(passport)) {
                final List<Account> accounts = usersAccounts.get(user);
                if(!accounts.contains(account)) {
                accounts.add(account);
                }
            }
        }

    }
    /**
     * удалить один счёт пользователя;
     * @param passport - номер паспорта;
     * @param account - aккаунт;
     */
    public void deleteAccountFromUser(String passport, Account account) {
        this.usersAccounts.remove(passport, account);
    }

    /**
     * получить список счетов для пользователя;
     * @param passport - паспорт пользователя;
     * @return - возвращает список всех счетов пользователя;
     */
    public List<Account> getUserAccounts (String passport) {
        List<Account> result = new ArrayList<>();
        for(Account i : usersAccounts.get(passport)) {
            if(i.equals(passport)) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * метод для перечисления денег с одного счёта на другой счёт:
     * @param srcPassport  - паспорт первого пользователя;
     * @param srcRequisite - реквезиты первого пользователя;
     * @param destPassport - паспорт второго пользователя;
     * @param dstRequisite - реквезиты второго пользователя;
     * @param amount       - переводимая сумма;
     * @return             - возвращает результат перевода true или folse;
     */
    public boolean transferMoney (String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        boolean result = false;
        for(User user : this.usersAccounts.keySet()) {
            if(user.getPassport().equals(srcPassport)) {
              //  final List<Account> accounts =;
            }
        }
        return result;
    }
}
