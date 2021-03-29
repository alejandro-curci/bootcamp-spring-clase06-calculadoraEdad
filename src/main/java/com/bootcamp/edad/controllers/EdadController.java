package com.bootcamp.edad.controllers;

import com.bootcamp.edad.dto.DateDTO;
import com.bootcamp.edad.services.EdadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/edad")
public class EdadController {

    // GET request: paso datos a traves de la URI
    @GetMapping("/{day}/{month}/{year}")
    public ResponseEntity devolverEdad(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        return new ResponseEntity(EdadService.calcularEdad(year, month, day), HttpStatus.OK);
    }

    // POST request: paso datos en el body
    @PostMapping("/obtener")
    public ResponseEntity devolverEdadDTO(@RequestBody DateDTO date) {
        return new ResponseEntity(EdadService.obtenerEdad(date), HttpStatus.OK);
    }

}
