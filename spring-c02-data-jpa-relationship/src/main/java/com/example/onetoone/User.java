package com.example.onetoone;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
//@Table(name = "users")  //Se coloca por si da problema con otra clase que se llama User
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //es para que se genere automáticamente la Clave Primaria
    private Long id;

    private String name;
    @Column(unique = true)// para que el email sea único, no se repita
    private String email;
    @Enumerated(EnumType.STRING)
    private UserType userType;  /* sino se coloca nada se mantiene el número de posición
    si se coloca @Enumerated(EnumType.STRING), se cambia a texto   en la BD cambia user_type de numero de posición
     a lo que está escrito en enum  */
    private LocalTime entryHour;

    @OneToOne   //Un usuario tiene una dirección
    @JoinColumn(unique = true)  // Se necesita un Join para poder acceder a la columna
    private Address address;    /*Cuando se va hacer una asociación OneToOne se debe colocar el @
    y se debe crear un objeto.
    OJO: se debe agregar este atributo al constructor, al getter y setter y al toString*/
    public User() { }

    public User(Long id, String name, String email, UserType userType, LocalTime entryHour, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.entryHour = entryHour;
        this.address = address;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public UserType getUserType() {return userType;}

    public void setUserType(UserType userType) {this.userType = userType;}

    public LocalTime getEntryHour() {return entryHour;}

    public void setEntryHour(LocalTime entryHour) {this.entryHour = entryHour;}

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", userType=" + userType +
                ", entryHour=" + entryHour +
                ", address=" + address +
                '}';
    }
}
