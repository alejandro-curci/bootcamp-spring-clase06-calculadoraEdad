package com.bootcamp.edad.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DateDTO {
    private int year;
    private int month;
    private int day;
}
