package com.nttdata.bootcamp.grupo02.app.services;

import com.nttdata.bootcamp.grupo02.app.documents.DocumentType;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DocumentTypeService {


   /* void insert(Mono<DocumentType> documentType);*/
   public Mono<DocumentType> create(final DocumentType documentType);

    Flux<DocumentType> readAll();



}
