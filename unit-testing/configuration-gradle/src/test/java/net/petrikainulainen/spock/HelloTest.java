package net.petrikainulainen.spock;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petri Kainulainen
 */
public class HelloTest {

    private Hello hello;

    @Before
    public void createHelloObject() {
        hello = new Hello();
    }

    @Test
    public void sayHello_ShouldSayHelloToPersonWhoseNameIsGivenAsMethodParameter() {
        String greeting = hello.sayHello("Petri");
        assertThat(greeting, is("Hello Petri"));
    }
}
