package com.crudkru.Crudkru360.CRUD.repository;

import com.crudkru.Crudkru360.CRUD.entity.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends MongoRepository<Contact,String> {
}
