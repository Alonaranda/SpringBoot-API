package com.example.demo.services;

import com.example.demo.repositories.UsuarioRepository;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    //Obtener todo de la base de datos
    public ArrayList<UsuarioModel> obtenerCars(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    //Guardar dato
    public UsuarioModel guardarCar(UsuarioModel car){
        return usuarioRepository.save(car);
    }

    //Encontrar por id
    public Optional<UsuarioModel> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }

    //Encontrar por prioridad
    public ArrayList<UsuarioModel>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    //Eliminar
    public boolean eliminarCar(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}