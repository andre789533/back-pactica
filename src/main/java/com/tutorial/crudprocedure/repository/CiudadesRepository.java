package com.tutorial.crudprocedure.repository;

import com.tutorial.crudprocedure.entity.Region;
import com.tutorial.crudprocedure.entity.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CiudadesRepository extends JpaRepository<Region, Integer> {

    @Query(value = "{call lista_procedure()}", nativeQuery = true)
    List<Region> listaProcedure();

//    @Query(value = "{call id_procedure(:CATEGORYIDIn)}", nativeQuery = true)
//    Optional<Coche> idProcedure(@Param("CATEGORYIDIn") int CATEGORYIDIn);
//
//    @Query(value = "{call marca_procedure(:marcaIn)}", nativeQuery = true)
//    List<Coche> marcaProcedure(@Param("marcaIn") String marcaIn);
//
//    @Query(value = "{call save_procedure(:marcaIn,"
//    		+ " :modeloIn, :anyoIn, :kmIn)}", nativeQuery = true)
//    void saveProcedure(
//            @Param("marcaIn")String marcaIn,
//            @Param("modeloIn")String modeloIn,
//            @Param("anyoIn")int anyoIn,
//            @Param("kmIn")int kmIn
//    );
//
//    @Query(value = "{call media_procedure()}", nativeQuery = true)
//    float mediaKm();
//
//    @Query(value = "{call borrar_procedure(:idIn)}", nativeQuery = true)
//    void borrarProcedure(@Param("idIn") int idIN);
}
