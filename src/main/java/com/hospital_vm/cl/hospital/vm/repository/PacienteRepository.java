package com.hospital_vm.cl.hospital.vm.repository;

import com.hospital_vm.cl.hospital.vm.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

    //JPQL
    @Query(value = "SELECT * FROM paciente WHERE apellidos = :apellidos", nativeQuery = true)
    List<Paciente> findByApellidos(@Param("apellidos") String apellidos);

    //SQL Nativo
    @Query(value = "SELECT * FROM paciente WHERE correo = :correo", nativeQuery = true)
    Paciente findByCorreo(@Param("correo")String correo);

    List<Paciente> findByNombresAndApellidos(String nombres, String apellidos);
}
