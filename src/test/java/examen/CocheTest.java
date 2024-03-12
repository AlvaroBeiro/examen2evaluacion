/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package examen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dammdcd1
 */
public class CocheTest {
    
    public CocheTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test del método precioConIva de la clase Coche.
     * Caso de uso: Coche de Maria
     */
    @Test
    public void testPrecioConIvaMaria() {
        System.out.println("precioConIvaMaria");
        boolean ivareducido = true;
        Coche cocheDeMaria = new Coche ("Ford", "Focus",5000, 0);
        double expResult = 5500;
        double result = cocheDeMaria.precioConIva(ivareducido);
        assertEquals(expResult, result, 0);
    }
    
    
    /**
     * Test del método precioConIva de la clase Coche.
     * Caso de uso: Coche de Mercedes
     */
    @Test
    public void testPrecioConIvaMercedes() {
        System.out.println("precioConIvaMercedes");
        boolean ivareducido = false;
        Coche cocheDeMercedes = new Coche ("Audi", "A3", 34000,0);
        double expResult = 41400;
        double result = cocheDeMercedes.precioConIva(ivareducido);
        assertEquals(expResult, result, 0);
    }
    
}