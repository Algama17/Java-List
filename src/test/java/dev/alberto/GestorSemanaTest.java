package dev.alberto;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorSemanaTest {
    private GestorSemana gestorSemana;

    @BeforeEach
    void setUp() {
        gestorSemana = new GestorSemana();
    }

    @Test
    void testCrearListaDias() {
        gestorSemana.crearListaDias();
        List<String> diasEsperados = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
        assertEquals(diasEsperados, gestorSemana.obtenerDias());
}


    @Test
    void testObtenerTamañoLista() {
        gestorSemana.crearListaDias();
        assertEquals(7, gestorSemana.obtenerTamañoLista());
    }


    @Test
    void testEliminarDia() {
        gestorSemana.crearListaDias();
        assertTrue(gestorSemana.eliminarDia("Miércoles"));
        assertFalse(gestorSemana.existeDia("Miércoles"));
        assertEquals(6, gestorSemana.obtenerTamañoLista());
    }
}
