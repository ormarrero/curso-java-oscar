package com.example.repositories;

import com.example.entities.Food;
import com.example.repositories.FoodRepository;
import com.example.services.FoodService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.time.LocalDate;
import java.util.List;
/*
Crear directorio com/example/repositories e introducir aquivos SQL
Asegurarse de que com/example/repositories son carpetas separadas una dentro de otra
 */
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest    // Se usa solo para los Test de Repositorio
class FoodRepositoryTest {

    @Autowired  // Para que spring pueda inyectarlo y testearlo aquí
    private FoodRepository foodRepo;
    @Sql("foods.sql")    // Esto crea un Sql solo para este test
    @Test
    void findAllTest(){
        // Ejecutar el comportamiento a testear
        List<Food> foods = foodRepo.findAll();

        // Comprobaciones:
        assertNotNull(foods);
        //assertEquals(11, foods.size());  // Comprueba si hay
        assertTrue(foods.size() >=3);
    }

    @Sql("foods.sql")
    @Test
    void findByIdTrueTest(){
        assertTrue(foodRepo.findById(1L).isPresent());
    }

    @Sql("foods.sql")
    @Test
    void findByIdFalseTest(){
        assertTrue(foodRepo.findById(999L).isPresent());
    }

    @Test   // Es un método, pero sirve para testear
    @DisplayName("Buscar todos por Categoría")
    void findAllByCategoryTest() {

        assertEquals(1, foodRepo.findAllByCategory("verdura").size());
        assertEquals(2, foodRepo.findAllByCategory("fruta").size());
    }

    @Test
    @DisplayName("Crear un nuevo Food en base de datos correctamente")
    void saveTest() {
        long sizeBefore = foodRepo.count(); // 0

        Food food = new Food(null, "Alcachofa", "verdura", "gris", "Alcachofa de la llanura", 4.99, true, 4, LocalDate.of(2023, 2, 28), null, null);
        food = foodRepo.save(food);

        long sizeAfter = foodRepo.count(); // 1
        assertEquals(sizeBefore + 1, sizeAfter);
        //assertTrue(food.getId() >= 1);
    }
    @Test
    void findAllByColor() {
    }

    @Test
    void findAllByCategoryAndColor() {
    }

    @Test
    void findAllBySupermarketId() {
    }
}