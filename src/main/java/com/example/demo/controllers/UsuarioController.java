package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ReqeuestMapping("/car")
public class UsuarioController{
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerCars(){
        return usuarioService.obtenerCars();
    }

    @PostMapping()
    public UsuarioModel guardarCar(@RequestBody UsuarioModel car){
        return this.usuarioService.guardarCar(car);
    }

    @GetMapping( path = "/{id}")
    public Optional<UsuarioModel> obtenerCarPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerCarPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarCar(id);
        if (ok){
            return "Se eliminó el carro con id " + id;
        }else{
            return "No pudo eliminar el carro con id" + id;
        }
    }

}