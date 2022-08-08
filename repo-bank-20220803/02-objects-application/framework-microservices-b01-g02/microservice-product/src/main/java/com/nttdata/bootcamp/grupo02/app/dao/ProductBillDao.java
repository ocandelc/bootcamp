package com.nttdata.bootcamp.grupo02.app.dao;

import com.nttdata.bootcamp.grupo02.app.documents.ProductBill;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductBillDao extends ReactiveMongoRepository<ProductBill, String> {

}
