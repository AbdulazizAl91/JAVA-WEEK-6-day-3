package com.example.hospitalwithsecurity.Service;

import com.example.hospitalwithsecurity.Model.Clinic;
import com.example.hospitalwithsecurity.Model.ClinicEmployee;
import com.example.hospitalwithsecurity.Model.Patient;
import com.example.hospitalwithsecurity.Rpository.ClinicEmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClinicEmployeeService {
    private final ClinicEmployeeRepository clinicEmployeeRepository;

    public void register(ClinicEmployee clinicEmployee){
        String hash= new BCryptPasswordEncoder().encode(clinicEmployee.getPassword());
        clinicEmployee.setPassword(hash);


        clinicEmployeeRepository.save(clinicEmployee);
    }
    public void updateClinicEmployee(Integer clinicEmployee_id, ClinicEmployee clinicEmployee_info){
        ClinicEmployee clinicEmployee = clinicEmployeeRepository.findClinicEmployeeById(clinicEmployee_id);
        String hash= new BCryptPasswordEncoder().encode(clinicEmployee.getPassword());
        clinicEmployee.setUsername(clinicEmployee.getUsername());
        clinicEmployee.setPassword(hash);
        clinicEmployeeRepository.save(clinicEmployee);

    }
    public void deleteClinicEmployee(Integer clinicEmployee_id){
        ClinicEmployee clinicEmployee = clinicEmployeeRepository.findClinicEmployeeById(clinicEmployee_id);
        clinicEmployeeRepository.delete(clinicEmployee);
    }
}
