package com.nttdata.bootcamp.grupo02.app.services.impl;

import com.nttdata.bootcamp.grupo02.app.dao.ProductBillDao;
import com.nttdata.bootcamp.grupo02.app.documents.ProductBill;
import com.nttdata.bootcamp.grupo02.app.services.ProductBillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductBillServiceImpl implements ProductBillService {

    private static final Logger log = LoggerFactory.getLogger(ProductBillService.class);

    @Autowired
    private ProductBillDao productBillDao;

    @Override
    public Mono<ProductBill> create(final ProductBill productBill) {
        return productBillDao.save(productBill);
    }

    @Override
    public Mono<ProductBill> update(final String id, final ProductBill productBill) {
        return productBillDao.save(productBill);
    }

    @Override
    public Mono<Void> delete(final String id) {
        return productBillDao.deleteById(id);
    }

    @Override
    public Flux<ProductBill> readAll() {
        Flux<ProductBill> objectsFlux = productBillDao.findAll().doOnNext(objectFlux -> log.info(objectFlux.getName()));
        return objectsFlux;
    }

}