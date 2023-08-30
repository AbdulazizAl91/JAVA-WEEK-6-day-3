package com.example.hospitalwithsecurity.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdmissionEmployee {
    @Id
    private Integer id;
    private String username;
    private String  password;
    private String role;




    @OneToOne
    @MapsId
    @JsonIgnore
    private User user;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "AdmissionEmployee")
    private Set<Admission> admissions;
}
