package com.bootcamp.edad.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EdadDTO {
    private int edad;
    private DateDTO nacimiento;
}
