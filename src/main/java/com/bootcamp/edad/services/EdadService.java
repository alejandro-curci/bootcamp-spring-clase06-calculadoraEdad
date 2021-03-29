package com.bootcamp.edad.services;

import com.bootcamp.edad.dto.DateDTO;
import com.bootcamp.edad.dto.EdadDTO;

import java.time.LocalDate;
import java.time.Period;

public class EdadService {

    public static int calcularEdad(int year, int month, int day) {
        LocalDate nacimiento = LocalDate.of(year, month, day);
        Period periodo = Period.between(nacimiento, LocalDate.now());
        return periodo.getYears();
    }

    public static EdadDTO obtenerEdad(DateDTO date) {
        int edad = calcularEdad(date.getYear(), date.getMonth(), date.getDay());
        return new EdadDTO(edad, date);
    }


}
