package net.petrikainulainen.spock

import spock.lang.Specification

/**
 * @author Petri Kainulainen
 */
class MapSpec extends Specification {

    def 'Get value from a map (with setup block)'() {

        setup:
        def key = 'key'
        def value = 1

        def map = new HashMap()
        map.put(key, value)

        when: 'Mapping is found for the given key'
        def found = map.get(key)

        then: 'Should return the mapped value'
        found == value
    }

    def 'Get value from a map (with implicit setup block)'() {

        def key = 'key'
        def value = 1

        def map = new HashMap()
        map.put(key, value)

        when: 'Mapping is found for the given key'
        def found = map.get(key)

        then: 'Should return the mapped value'
        found == value
    }

    def 'Get value from a map (with given block)'() {

        given: 'Map contains one key-value pair'
        def key = 'key'
        def value = 1

        def map = new HashMap()
        map.put(key, value)

        when: 'A value is found with the given key'
        def found = map.get(key)

        then: 'Should return the found value'
        found == value
    }

    def 'Get value from a map (with multiple when-then blocks)'() {

        given: 'Map contains one key-value pair'
        def incorrectKey = 'incorrectKey'
        def key = 'key'
        def value = 1

        def map = new HashMap()
        map.put(key, value)

        when: 'A value is found with the given key'
        def found = map.get(key)

        then: 'Should return the found value'
        found == value

        when: 'A value is not found with the given key'
        found = map.get(incorrectKey)

        then: 'Should return null'
        found == null
    }
}
