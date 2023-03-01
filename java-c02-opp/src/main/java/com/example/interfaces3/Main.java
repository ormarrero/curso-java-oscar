package com.example.interfaces3;
//(5)
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1. Instanciar interfaz: Se crea la única clase que se tiene por el momento
        IBankAccountService accountService = new BankAccountServiceImpl();

        //2. Operaciones con cuentas bancarias (MÉTODOS/OPERACIONES):

        //2.1. Consultar cuentas bancarias:
        List<BankAccount> accounts = accountService.findAll();

        //2.2. Consultar una cuenta bancaria:
        BankAccount account5 = accountService.findById(5L);
        //BankAccount accountCustomer = accountService.findByIdCustomerNIF("11111A");   // se anula este paso porque todavía no esta declarado el nif como variable

        //2.3. Calcular recompensa por antigüedad: // OJO DA UN EXCEPTION (java.lang.NullPointerExcetion)
        //Double reward = accountService.calculateReward(account5);

        //2.4. Crear una cuenta bancaria:
        // le pedimos los datos al cliente
        Double amount = 100d;
        BankAccountType type = BankAccountType.SAVING;
        String nif = "123456789J";
        BankAccount bankAccount = accountService.create(nif, type, amount);

        //2.5. Actualizar cuenta bancaria
        bankAccount = accountService.update(bankAccount);
        System.out.println(bankAccount);

        //2.6. Incrementar Amount:
        Double newAmount = 100d;
        Long accountId = 1L;
        accountService.incrementAmount(accountId, newAmount);
    }
}
