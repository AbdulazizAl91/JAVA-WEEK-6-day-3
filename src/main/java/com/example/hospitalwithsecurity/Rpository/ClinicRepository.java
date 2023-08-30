package com.example.hospitalwithsecurity.Rpository;

import com.example.hospitalwithsecurity.Model.Clinic;
import com.example.hospitalwithsecurity.Model.ClinicEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic,Integer> {
     Clinic findClinicById(Integer id);
     Clinic findClinicByPatientName(String patientName);

     List<Clinic> findClinicByClinicName(String clinicName);


     @Query("select c from Clinic c where c.doctorName=?1")
     List<Clinic>whereDoctor_name(String doctorName);
     List<Clinic>findClinicByPrice(Integer price);
     List<Clinic>findAllByClinicEmployee(ClinicEmployee clinicEmployee);




}
