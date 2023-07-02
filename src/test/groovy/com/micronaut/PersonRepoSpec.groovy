package com.micronaut

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class PersonRepoSpec extends Specification {

    @Inject
    PersonRepo personRepo

    def "save"() {
        given:
        def person = new Person(name: 'Fred')

        when:
        def result = personRepo.save(person)

        then:
        result.dateCreated

        when:
        result = personRepo.findById(person.id)

        then:
        result.isPresent()
        result.get().dateCreated
    }
}
