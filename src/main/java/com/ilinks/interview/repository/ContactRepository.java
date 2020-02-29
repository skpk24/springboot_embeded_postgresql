package com.ilinks.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ilinks.interview.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
