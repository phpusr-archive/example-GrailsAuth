package auth

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    void "testSave"() {
        when: "Create book"
        def book = new Book(title: 'Sample book', description: 'The best book ever!').save(failOnError: true)

        then: "Book size must be 1"
        Book.count == 1
    }

}
