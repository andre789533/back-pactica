package com.tutorial.crudprocedure.service;


import com.tutorial.crudprocedure.entity.Region;
import com.tutorial.crudprocedure.entity.Coche;
import com.tutorial.crudprocedure.repository.CiudadesRepository;
import com.tutorial.crudprocedure.repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadesService2 {

    @Autowired
    CiudadesRepository cocheRepository;

    public List<Region> lista(){
    	
        return cocheRepository.listaProcedure();
    }

//    public Optional<Coche> getById(int id){
//    	
//        return cocheRepository.idProcedure(id);
//        
//    }
//
//    public List<Coche> getByMarca(String marca){
//        return cocheRepository.marcaProcedure(marca);
//    }
//
//    public void saveProcedure(Coche coche){
//       
//    }
//
//    public float mediaKm(){
//        return cocheRepository.mediaKm();
//    }
//
//    public void borrarProcedure(int id){
//        cocheRepository.borrarProcedure(id);
//    }
}
