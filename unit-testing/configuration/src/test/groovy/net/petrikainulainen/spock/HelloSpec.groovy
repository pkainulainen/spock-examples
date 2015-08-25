package net.petrikainulainen.spock

import spock.lang.Specification

/**
 * @author Petri Kainulainen
 */
class HelloSpec extends Specification {

    def sayHello() {
        given: "A new Hello object is created"
        def hello = new Hello();

        expect: "Should say hello to person whose name is given as a method parameter"
        hello.sayHello("Petri") == "Hello Petri";
    }
}
