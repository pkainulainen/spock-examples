package net.petrikainulainen.spock

import spock.lang.Specification

/**
 * @author Petri Kainulainen
 */
class HelloSpec extends Specification {

    def hello = new Hello();

    def sayHello() {
        given: "A person's name is given as a method parameter."
        def greeting = hello.sayHello("Petri");

        expect: "Should say hello to the person whose name is given as a method parameter"
        greeting == "Hello Petri";
    }
}

