package com.nttdata.bootcamp.grupo02.app.controllers;

import com.nttdata.bootcamp.grupo02.app.documents.DocumentType;
import com.nttdata.bootcamp.grupo02.app.services.DocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/documenttypes")
public class DocumentTypeRestController {

    @Autowired
    private DocumentTypeService documentTypeService;

    @PostMapping
    /*public void create(@RequestBody Mono<DocumentType> documentType) {
        documentTypeService.insert(documentType);
    }*/
    public Mono<DocumentType> save(@RequestBody final DocumentType documentType) {
        System.out.println("Will register the student :: "+ documentType.getId());
        return documentTypeService.create(documentType);
    }

    @GetMapping
    public Flux<DocumentType> readAll() {
        return documentTypeService.readAll();
    }

}
