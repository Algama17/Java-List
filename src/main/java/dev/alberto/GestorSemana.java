package dev.alberto;

import java.util.ArrayList;
import java.util.List;

public class GestorSemana {

     private List<String> diasDeLaSemana;

    public GestorSemana() {
        this.diasDeLaSemana = new ArrayList<>();
    }

    public void crearListaDias() {
        diasDeLaSemana.clear();
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miércoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sábado");
        diasDeLaSemana.add("Domingo");
    }

    public List<String> obtenerDias() {
        return new ArrayList<>(diasDeLaSemana);
    }
}
