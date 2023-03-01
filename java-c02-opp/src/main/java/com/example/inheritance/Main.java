package com.example.inheritance;

import java.util.ArrayList;
import java.util.List;

// (4)
public class Main {

    public static void main(String[] args) {
        // Se crea un Carro:
        Car car1 = new Car(1L, 4, "red", 1500.0, 5, 4);
        System.out.println(car1);

        // Se crea una Moto:
        MotorCycle moto1 = new MotorCycle(1L, 4, "red", 500.0, true, 30);
        System.out.println(moto1);

        // CON POLIMORFISMO:
        Vehicle car2 = new Car(2L, 4, "red", 1500.0, 5, 4);
        Vehicle moto2 = new MotorCycle(1L, 4, "red", 500.0, true, 30);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(moto1);
        vehicles.add(moto2);

        for (Vehicle vehicle : vehicles) {
            vehicle.speedUp(); // Funciona tanto en coche como en motos
            // vehicle.getHasCopilot(); // No funciona porque este método es específico de motos,
            // solo podemos usar los hereedados

            if (vehicle instanceof MotorCycle motorCycle)  // solo será true para las motos, no para los coches
                System.out.println(motorCycle.getHasCopilot());

            if (vehicle instanceof Car car)  // solo será true para las motos, no para los coches
                System.out.println(car.getNumDoors());

            // 2. SIN POLIMORFISMO:
            List<Car> cars = new ArrayList<>();
            cars.add(car1);
            //car.add(car2);
            //car.add(moto1);
            for (Car car : cars)
                car.speedUp();  // solo funciona con coches, no vale para motos
        }
    }
}
