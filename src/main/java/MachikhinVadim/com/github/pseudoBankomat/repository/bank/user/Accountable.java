package MachikhinVadim.com.github.pseudoBankomat.repository.bank.user;

import MachikhinVadim.com.github.pseudoBankomat.entity.Operation;
import MachikhinVadim.com.github.pseudoBankomat.entity.User;
import MachikhinVadim.com.github.pseudoBankomat.exception.MoneyException;

import java.math.BigDecimal;

public interface Accountable {
    User getUserById(String userId);

    BigDecimal getBalance(String userId) throws MoneyException;

    boolean takeMoney(String userId, BigDecimal amount) throws MoneyException;

    boolean putMoney(String userId, BigDecimal amount) throws MoneyException;

    boolean transferMoney(String userIdFrom, String userIdTo, BigDecimal amount, Operation operationOne, Operation operationTwo) throws MoneyException;

    void saveUser(User user);
}
