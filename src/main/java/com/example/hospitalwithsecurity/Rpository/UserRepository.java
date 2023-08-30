package com.example.hospitalwithsecurity.Rpository;

import com.example.hospitalwithsecurity.Model.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUsername(String username);
}
