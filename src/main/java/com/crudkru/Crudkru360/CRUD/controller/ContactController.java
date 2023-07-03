package com.crudkru.Crudkru360.CRUD.controller;

import com.crudkru.Crudkru360.CRUD.dto.ContactDto;
import com.crudkru.Crudkru360.CRUD.entity.Contact;
import com.crudkru.Crudkru360.CRUD.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping
    public ResponseEntity<List<Contact>> getAll(){
        return ResponseEntity.ok(contactService.getAll());
    };

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getById(@PathVariable("id") String id){
        return ResponseEntity.ok(contactService.getById(id));
    };

    @PostMapping
    public ResponseEntity<Contact> save(@RequestBody ContactDto dto ) {
        return ResponseEntity.ok(contactService.save(dto));
    };

    @PutMapping("/{id}")
    public ResponseEntity<Contact> update(@PathVariable("id") String id,@RequestBody ContactDto dto ) {
        return ResponseEntity.ok(contactService.update(id,dto));
    };

    @DeleteMapping("/{id}")
    public ResponseEntity<Contact> delete(@PathVariable("id") String id){
        return ResponseEntity.ok(contactService.delete(id));
    };
}
