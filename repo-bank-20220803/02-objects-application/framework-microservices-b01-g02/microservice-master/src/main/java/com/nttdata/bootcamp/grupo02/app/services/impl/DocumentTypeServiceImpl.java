package com.nttdata.bootcamp.grupo02.app.services.impl;

import com.nttdata.bootcamp.grupo02.app.dao.DocumentTypeDao;
import com.nttdata.bootcamp.grupo02.app.documents.DocumentType;
import com.nttdata.bootcamp.grupo02.app.services.DocumentTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
public class DocumentTypeServiceImpl implements DocumentTypeService {

    private static final Logger log = LoggerFactory.getLogger(DocumentTypeService.class);

    @Autowired
    private DocumentTypeDao documentTypeDao;

    @Override
    public Flux<DocumentType> readAll() {
        Flux<DocumentType> types = documentTypeDao.findAll()
                .doOnNext(type -> log.info(type.getName()));
        return types;
    }

    @Override
    public Mono<DocumentType> create(final DocumentType documentType) {
        return documentTypeDao.save(documentType);
    }

    /*
    public void insert(Mono<DocumentType> documentType) {


        Flux.just(new DocumentType("4","TDOC-0004", "OTR", "Otro Documento", "1"))
                .flatMap(type -> {
                    return documentTypeDao.insert(type);
                })
                .subscribe(type -> log.info("Insert: " + type.getId() + " " + type.getName()));


    }
    */

}
