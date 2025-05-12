package com.hospital_vm.cl.hospital.vm.service;

import com.hospital_vm.cl.hospital.vm.repository.PacienteRepository;
import com.hospital_vm.cl.hospital.vm.model.Paciente;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }
    public Paciente findById(long id) {
        return pacienteRepository.findById(id).get();
    }
    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
    public void delete(Long id) {
        pacienteRepository.deleteById(id);
    }
}
