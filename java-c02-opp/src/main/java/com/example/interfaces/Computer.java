package com.example.interfaces;

public class Computer {

    private Long id;    // Empezar a utilizar
    private  String model;
    private Integer ram;
    private Integer cores;

    public Computer() {
    }

    public Computer(Long id, String model, Integer ram, Integer cores) {
        this.id = id;
        this.model = model;
        this.ram = ram;
        this.cores = cores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", cores=" + cores +
                '}';
    }
}
