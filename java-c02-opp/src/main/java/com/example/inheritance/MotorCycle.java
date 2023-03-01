package com.example.inheritance;

/**
 * MOTO: Clase hija 2.
 * MotorCicle es una clase que se extiende a la clase Vehicle, posibles nomenclaturas:
 *
 * 1. Clase hija.
 * 2. Clase derivada.
 * 3. Superclase.
 *
 * La clase superior:
 *  1. Clase padre.
 *  2. Clase base
 *  3. Superclase
 *
 *  La herencia usa extends.
 *  Las interfaces usan implements.
 */
public class MotorCycle extends Vehicle {

    private Boolean hasCopilot;
    private  Integer boxCapacityLiters;

    /**
     * OJO REVISAR SI EL CODIGO VACIO ESTA SIN PARAMETRO.
     */
//    public MotorCycle() {
//    }

    public MotorCycle(Long id, Integer numWheels, String color, Double weight) {
        super(id, numWheels, color, weight);
        this.hasCopilot = hasCopilot;
        this.boxCapacityLiters = boxCapacityLiters;
    }

    public MotorCycle(long l, int i, String red, double v, boolean b, int i1) {
    }

    public Boolean getHasCopilot() {
        return hasCopilot;
    }

    public void setHasCopilot(Boolean hasCopilot) {
        this.hasCopilot = hasCopilot;
    }

    public Integer getBoxCapacityLiters() {
        return boxCapacityLiters;
    }

    public void setBoxCapacityLiters(Integer boxCapacityLiters) {
        this.boxCapacityLiters = boxCapacityLiters;
    }

    // Para generar todos las variables se selecciona en template: String concat (+) and super.toString()
    // el super.toString() llama al toString generado en Vehicle
    @Override
    public String toString() {
        return "MotorCycle{" +
                "hasCopilot=" + hasCopilot +
                ", boxCapacityLiters=" + boxCapacityLiters +
                "} " + super.toString();
    }
}
