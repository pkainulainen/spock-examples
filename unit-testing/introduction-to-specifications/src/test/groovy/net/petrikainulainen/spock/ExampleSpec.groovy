package net.petrikainulainen.spock

import spock.lang.Shared
import spock.lang.Specification

/**
 * @author Petri Kainulainen
 */
class ExampleSpec extends Specification {

    def message = "Hello world!"

    def uniqueObject = new Object();
    @Shared sharedObject = new Object();

    def setup() {
        println "Setup"
    }

    def cleanup() {
        println "Clean up"
    }

    def setupSpec() {
        println "Setup specification"
    }

    def cleanupSpec() {
        println "Clean up specification"
    }

    def "first feature method"() {
        println "First feature method"
        println "unique object: " + uniqueObject
        println "shared object: " + sharedObject

        when: "Message is transformed into lowercase"
        message = message.toLowerCase()

        then: "Should transform message into lowercase"
        message == "hello world!"
    }

    def "second feature method"() {
        println "Second feature method"
        println "unique object: " + uniqueObject
        println "shared object: " + sharedObject

        when: "Message is transformed into uppercase"
        message = message.toUpperCase()

        then: "Should transform message into uppercase"
        message == "HELLO WORLD!"
    }
}
