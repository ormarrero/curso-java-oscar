package com.example.encapsulation.attributes;

/**
 * Modificadores de visibilidad:
 *
 * public: indica que un atributo o método es accesible desde otras clases
 * private: indica que un atributo o método es accesible desde la propia clase pero no desde fuera
 */

public class Main {

    public static void main(String[] args) {

        Project project1 = new Project("proj1", 5, 100000d);

        // Los atributos encapsulados (private) no se pueden modificar directamente
        // project1.title = "prj2";
        // project1.numDevelopers = -5;

        // Métodos Getter: acceder a atributos
        // System.out.println(project1.title);
        System.out.println(project1.getTitle());
        System.out.println(project1.getNumDevelopers());
        System.out.println(project1.getCost());

        // Métodos Setter: Modificar atributos
        // project1.title = "prj2";
        System.out.println("Título antes del set: " + project1.getTitle());
        project1.setTitle("project1 actualizado");
        System.out.println("Título después del set: " + project1.getTitle());

        System.out.println("numDesarrolladores antes del set: " + project1.getNumDevelopers());
        project1.setNumDevelopers(4);
        System.out.println("numDesarrolladores después del set: " + project1.getNumDevelopers());

        System.out.println("Costo antes del set: " + project1.getCost());
        project1.setCost(40000d);
        System.out.println("Costo después del set: " + project1.getCost());

        // Agregar dos nuevos developers al equipo:
        Integer newNumDevelopers = project1.getNumDevelopers() + 2;
        project1.setNumDevelopers(newNumDevelopers);
    }
}
