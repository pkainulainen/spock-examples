package net.petrikainulainen.spock

import spock.lang.Specification

/**
 * @author Petri Kainulainen
 */
class ExpectSpec extends Specification {

    def 'Return maximum value'() {

        expect: 'Should return max value when the max value is the second method parameter'
        Math.max(2, 3) == 3

        and: 'Should return max value when the max value is the first method parameter'

        Math.max(3, 2) == 3
    }
}
