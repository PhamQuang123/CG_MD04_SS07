package cg.codegym.service;

import cg.codegym.model.Customer;
import cg.codegym.model.Province;

public interface ICustomerService extends IGenerateService<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
