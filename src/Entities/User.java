package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//This class describes a user that can access the atm in order to perform an operation with one
//of his bank accounts
public class User {

    private int id;
    private String name;
    private String surname;
    private String iin;
    private String phoneNumber;
    private List<BankAccount> BankAccounts = new ArrayList<>();


}
