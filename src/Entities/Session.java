package Entities;

import java.sql.Time;
import java.util.Date;

//This class is supposed to store information about the current account of the user that accesses the atm:
//the account info and type of operation the user wants to perform
public class Session {
    private User user;
    private Date operationDate;
    BankAccount currentBankAccount;
    public enum OperationType{
        WITHDRAW, REPLENISH, TRANSFER, VIEW
    }

}
