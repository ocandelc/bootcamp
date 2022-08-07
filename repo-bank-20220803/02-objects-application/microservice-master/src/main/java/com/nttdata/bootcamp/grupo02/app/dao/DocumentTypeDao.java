package com.nttdata.bootcamp.grupo02.app.dao;

import com.nttdata.bootcamp.grupo02.app.documents.DocumentType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DocumentTypeDao extends ReactiveMongoRepository<DocumentType, String> {

}
