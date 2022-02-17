package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает процесс банковского перевода используя паспортные данные и реквизиты
 *
 * @author Nikolay Mishakin
 * @version 1.0
 */

public class BankService {

    /**
     * Поле содержит всех пользователей системы и привязанные к ним счета,
     * которое использует коллекцию типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя
     * и добавляет нового пользователя в систему
     *
     * @param user пользователь добавленный в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счёт-аккаунт к пользователю,
     * а также проверяет что у пльзователя ещё нет счёта
     *
     * @param passport номер паспорта пользователя
     * @param account аккаунт пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     *
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя если пользователь с таким номером паспорта есть
     * или null если пользователя с таким номером паспорта нет
     */

    public User findByPassport(String passport) {
        User rsl = null;
        for (User user: users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод ищет счёт (аккаунт) пользователя по реквизитам
     *
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты счёта (аккаунта)
     * @return возвращает счёт (аккаунт) если счёт с такими реквизитами есть
     * или null если пользователя с такими реквизитами счёта нет
     */

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User result = findByPassport(passport);
        if (result != null) {
            List<Account> accounts = users.get(result);
            for (Account acc: accounts) {
                if (requisite.equals(acc.getRequisite())) {
                    rsl = acc;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод перечисляет денежные средства с одного счёта (аккаунта) на другой
     *
     * @param srcPassport номер паспорта пользователя со счёта которого будет происходить перевод
     * @param srcRequisite реквизиты счёта с которого производится перевод
     * @param destPassport номер паспорта пользователя на счёт которого будет происходить перевод
     * @param destRequisite номер счёта на который производится перевод
     * @param amount количество денежных средств
     * @return вернёт true если перевод осуществится и false если условия для перевода не будут
     * соблюдены (счёт не найден или не хватает денежных средств на счёте с которого переводят)
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && src.getBalance() >= amount && dest != null) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance((dest.getBalance() + amount));
            rsl = true;
        }
        return rsl;
    }
}
