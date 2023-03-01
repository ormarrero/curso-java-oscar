package com.example.interfaces3;
// (1)
import java.util.Objects;
public class BankAccount {  // Esta es la clase sobre la cual se van a ir haciendo operaciones

    // 1. Se declaran variables:
    private  Long id;
    private  Double amount;
    private  BankAccountType type;
    private  Double cost;
    private String nif;
    private Integer openingYear;

    // 2. Constructores:
    public BankAccount() { }

    public BankAccount(Long id, Double amount, BankAccountType type, Double cost, String nif, Integer openingYear) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.cost = cost;
        this.nif = nif;
        this.openingYear = openingYear;
    }

    // 3. getter y setter:
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BankAccountType getType() {
        return type;
    }

    public void setType(BankAccountType type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Integer getOpeningYear() {
        return openingYear;
    }

    public void setOpeningYear(Integer openingYear) {
        this.openingYear = openingYear;
    }

    // 4. equals:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    // 5. hashCode:
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // 6. toString:
    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", amount=" + amount +
                ", type=" + type +
                ", cost=" + cost +
                ", nif='" + nif + '\'' +
                ", openingYear=" + openingYear +
                '}';
    }
}
