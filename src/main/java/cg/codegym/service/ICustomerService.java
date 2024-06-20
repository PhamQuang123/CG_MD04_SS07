package cg.codegym.service;

import cg.codegym.model.Customer;
import cg.codegym.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGenerateService<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);
}
