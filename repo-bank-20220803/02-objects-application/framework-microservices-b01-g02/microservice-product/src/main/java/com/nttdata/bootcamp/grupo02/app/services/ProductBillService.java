package com.nttdata.bootcamp.grupo02.app.services;

import com.nttdata.bootcamp.grupo02.app.documents.ProductBill;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductBillService {

   public Mono<ProductBill> create(final ProductBill productBill);

    public Mono<ProductBill> update(final String id, final ProductBill productBill);

    public Mono<Void> delete(final String id);

    Flux<ProductBill> readAll();

}