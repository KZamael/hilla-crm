package com.example.application.data.repository;


import java.util.List;

import com.example.application.data.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    @Query("SELECT c FROM Contact c JOIN FETCH c.company")
    List<Contact> findAllWithCompany();
}
