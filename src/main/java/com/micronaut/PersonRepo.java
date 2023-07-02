package com.micronaut;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import jakarta.transaction.Transactional;

@Repository
@Transactional
abstract public class PersonRepo implements CrudRepository<Person, Long> {


}
