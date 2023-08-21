package com.crudkru.Crudkru360.CRUD.service;

import com.crudkru.Crudkru360.CRUD.dto.ContactDto;
import com.crudkru.Crudkru360.CRUD.entity.Contact;
import com.crudkru.Crudkru360.CRUD.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    public List<Contact> getAll(){
        return contactRepository.findAll();
    }

    public Contact getById(String id){
        return contactRepository.findById(id).get();
    }
    public Contact save(ContactDto dto){
        Contact contact=new Contact(dto.getName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhone(),
                dto.getBirthday(),
                dto.getAddress(),
                dto.getTypeContact(),
                dto.getOrigin(),
                dto.getId()
                );

        return contactRepository.save(contact);
    }
    public Contact update(String id,ContactDto dto){
        Contact contact=contactRepository.findById(id).get();
        contact.setName(dto.getName());
        contact.setLastName(dto.getLastName());
        contact.setTypeContact(dto.getTypeContact());
        contact.setAddress(dto.getAddress());
        contact.setEmail(dto.getEmail());
        contact.setOrigin(dto.getOrigin());
        contact.setPhone(dto.getPhone());
        contact.setBirthday(dto.getBirthday());


        return contactRepository.save(contact);
    }

    public Contact delete(String id){
        Contact contact = contactRepository.findById(id).get();
        contactRepository.delete(contact);
        return contact;
    }


}
