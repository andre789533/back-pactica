package com.tutorial.crudprocedure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.crudprocedure.entity.Region;
import com.tutorial.crudprocedure.service.CiudadesService2;

@RestController
@RequestMapping("/ciudades")
public class CocheControllerCiudades {

    @Autowired
    CiudadesService2 cocheService;

    @GetMapping("/listaCiudades")
    public ResponseEntity<List<Region>> lista(){
    	List<Region> lista = cocheService.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
}
