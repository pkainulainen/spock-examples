package net.petrikainulainen.spock

import spock.lang.Specification

/**
 * @author Petri Kainulainen
 */
class MapSpec extends Specification {

    def 'Get element from a map (with setup block)'() {

        setup:
        def map = new HashMap()
        def key = 'element'
        def value = 1

        when: 'Element is put to the map'
        map.put(key, value)

        then: 'Element should be found by using the correct key'
        map.get(key) == 1
    }

    def 'Get element from a map (with implicit setup block)'() {

        def map = new HashMap()
        def key = 'element'
        def value = 1

        when: 'Element is put to the map'
        map.put(key, value)

        then: 'Element should by found by using the correct key'
        map.get(key) == 1
    }

    def 'Get element from a map (with given block)'() {

        given: 'Map is empty'
        def map = new HashMap()
        def key = 'element'
        def value = 1

        when: 'One element is put to the map'
        map.put(key, value)

        then: 'Element should be found by using the correct key'
        map.get(key) == 1
    }

    def 'Get element from a map (with multiple when-then blocks)'() {

        def map = new HashMap()
        def key = 'element'
        def value = 1

        when: 'One element is put to the map'
        map.put(key, value)

        then: 'Element should be found by using the correct key'
        map.get(key) == 1

        when: 'Map is empty'
        map.clear()

        then: 'Element should not be found by using the correct key'
        map.get(key) == null
    }
}
