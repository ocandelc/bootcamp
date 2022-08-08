package com.nttdata.bootcamp.grupo02.app.controllers;

import com.nttdata.bootcamp.grupo02.app.documents.ProductBill;
import com.nttdata.bootcamp.grupo02.app.services.ProductBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/productbills")
public class ProductBillRestController {

    @Autowired
    private ProductBillService productBillService;

    @PostMapping
    public Mono<ProductBill> create(@RequestBody final ProductBill productBill) {
        System.out.println("Will register the create :: "+ productBill.getId());
        return productBillService.create(productBill);
    }

    @PutMapping("{id}")
    public Mono<ProductBill> update(@PathVariable("id") final String id, @RequestBody final ProductBill productBill) {
        System.out.println("Will register the update :: "+ productBill.getId());
        return productBillService.update(id, productBill);
    }

    @DeleteMapping("{id}")
    public Mono<Void> delete(@PathVariable final String id) {
        System.out.println("::Will delete a ProductBill::");
        return productBillService.delete(id);
    }

    @GetMapping
    public Flux<ProductBill> readAll() {
        System.out.println("Will register the readAll :: ");
        return productBillService.readAll();
    }

}