package com.company.sakila.db0.sakila.customer.generated;

import com.company.sakila.db0.sakila.customer.Customer;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.db0.sakila.customer.Customer} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCustomerManager extends Manager<Customer> {
    
    TableIdentifier<Customer> IDENTIFIER = TableIdentifier.of("db0", "sakila", "customer");
    List<Field<Customer>> FIELDS = unmodifiableList(asList(
        Customer.CUSTOMER_ID,
        Customer.STORE_ID,
        Customer.FIRST_NAME,
        Customer.LAST_NAME,
        Customer.EMAIL,
        Customer.ADDRESS_ID,
        Customer.ACTIVE,
        Customer.CREATE_DATE,
        Customer.LAST_UPDATE
    ));
    
    @Override
    default Class<Customer> getEntityClass() {
        return Customer.class;
    }
}