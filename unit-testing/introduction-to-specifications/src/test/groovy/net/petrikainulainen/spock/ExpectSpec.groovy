package net.petrikainulainen.spock

import spock.lang.Specification

/**
 * @author Petri Kainulainen
 */
class ExpectSpec extends Specification {
    
    def 'Get value from a map'() {

        given: 'Map contains one key-value pair'
        def incorrectKey = 'incorrectKey'
        def key = 'key'
        def value = 1

        def map = new HashMap()
        map.put(key, value)

        expect: 'Should return the found value when a value is found with the given key'
        map.get(key) == value

        and: 'Should return null when a value is not found with the given key'
        map.get(incorrectKey) == null
    }
}
