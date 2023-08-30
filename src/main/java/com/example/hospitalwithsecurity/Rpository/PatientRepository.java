package com.example.hospitalwithsecurity.Rpository;

import com.example.hospitalwithsecurity.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
    Patient findPatientById(Integer id);
}
