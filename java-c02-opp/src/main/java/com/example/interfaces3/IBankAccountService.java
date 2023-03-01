package com.example.interfaces3;
//(3)
import java.util.List;

/**
 * Tipo ABSTRACTO: Interfaz con operaciones para trabajar con cuentas bancarias (BankAccount)
  */

public interface IBankAccountService {

    // 1. CRUD: Create Retrieve/Read Update Delete
    /**
     *  findAll: Recuperar todas las cuentas(personal)
     *  Recupera todas las cuentas bancarias de base de datos
     *  @return cuentas bancarias o una lista vacía sino hay
     */
     List<BankAccount> findAll();

    /**
     * Recupera una cuenta bancaria por su id
     * @param id identificador de la cuenta bancaria
     *      * @return la cuenta bancaria
     */
    BankAccount findById(Long id);

    // incrementar coste

    // calcular y añadir recompensa
    Double calculateReward(BankAccount account);

    /**
     * Creea un nuevo objeto cuenta y lo almacena en Base de Datos
     * @param nif: El dni del cliente titular
     * @param type: El tipo de cuenta bancaria
     * @param amount: El saldo inicial
     * @return: La nueva cuenta bancaria
     */
    BankAccount create(String nif, BankAccountType type, Double amount);

    /**
     * Actualiza los datos de una cuenta bancaria
     * @param bankAccount: La cuenta bancaria a actualizar
     * @return: La cuenta bancaria actualizada
     */
    BankAccount update(BankAccount bankAccount);

    /**
     * Incrementar el saldo de la cuenta bancaria
     * @param accountId: El identificador de la cuenta bancaria
     * @param newAmount: Cantidad de dinero a ingresar en la cuenta
     * @return: true si se ingresó correctamente el dinero o false si hubo un problema y no se pudo ingresar
     */
    boolean incrementAmount(Long accountId, Double newAmount);
}
