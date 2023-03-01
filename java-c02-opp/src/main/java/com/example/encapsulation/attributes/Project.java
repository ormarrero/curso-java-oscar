package com.example.encapsulation.attributes;

import java.util.StringJoiner;

public class Project {

    /* Atributos Encapsulados: Para encapsularlo se le agrega private,
    solo se pueden modificar desde la propia clase Project.     */
    private String title;   //titulo
    private Integer numDevelopers;  //numero de Desarrolladores
    private  Double cost;    //costo del proyecto

    public Project(){}

    public Project(String title, Integer numDevelopers, Double cost) {
//        this.title = title;
//        this.numDevelopers = numDevelopers;
//        this.cost = cost;

        this.setTitle(title);
        this.setNumDevelopers(numDevelopers);
        this.setCost(cost);
    }

    // Métodos Getter: Devuelven el atributo
    public String getTitle(){
        return this.title;
    }
    public Integer getNumDevelopers(){
        return this.numDevelopers;
    }

    //Método get que devuelve el costo
    public Double getCost(){
        return this.cost;
    }

    //Método Setter: void porque solo cambian, no devuelven
    // Método set que permite cambiar el título
    public void setTitle(String title){
        this.title = title;
    }
    // Permite cambiar con la condición que el número de desarrolladores sea mayor a cero
    public void setNumDevelopers(Integer numDevelopers){
        if (numDevelopers > 0)
            this.numDevelopers = numDevelopers;
    }
    public void setCost(Double cost){
        if (cost > 0)
            this.cost = cost;
    }

    // toString

    @Override
    public String toString() {
        return new StringJoiner(", ", Project.class.getSimpleName() + "[", "]")
                .add("title='" + title + "'")
                .add("numDevelopers=" + numDevelopers)
                .add("cost=" + cost)
                .toString();
    }


    /* Tambien se puede utilizar la opción StringJoiner desde Template
    @Override
    public String toString() {
        return new StringJoiner(", ", Project.class.getSimpleName() + "[", "]")
                .add("title='" + title + "'")
                .add("numDevelopers=" + numDevelopers)
                .add("cost=" + cost)
                .toString();
    }*/
}
