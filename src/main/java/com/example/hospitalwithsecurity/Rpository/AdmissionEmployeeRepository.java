package com.example.hospitalwithsecurity.Rpository;

import com.example.hospitalwithsecurity.Model.AdmissionEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionEmployeeRepository extends JpaRepository<AdmissionEmployee,Integer> {
        AdmissionEmployee findAdmissionEmployeeById(Integer id);
}
