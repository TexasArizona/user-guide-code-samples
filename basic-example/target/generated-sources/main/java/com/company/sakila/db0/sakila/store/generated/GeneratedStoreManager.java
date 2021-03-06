package com.company.sakila.db0.sakila.store.generated;

import com.company.sakila.db0.sakila.store.Store;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.db0.sakila.store.Store} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStoreManager extends Manager<Store> {
    
    TableIdentifier<Store> IDENTIFIER = TableIdentifier.of("db0", "sakila", "store");
    List<Field<Store>> FIELDS = unmodifiableList(asList(
        Store.STORE_ID,
        Store.MANAGER_STAFF_ID,
        Store.ADDRESS_ID,
        Store.LAST_UPDATE
    ));
    
    @Override
    default Class<Store> getEntityClass() {
        return Store.class;
    }
}