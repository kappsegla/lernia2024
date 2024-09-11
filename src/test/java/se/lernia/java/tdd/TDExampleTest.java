package se.lernia.java.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TDExampleTest {

    @Test
    void givenValidUsernameAndPasswordWhenDoStuffRunsThenHasDoneStuffIsTrue() {
        Authorizer authorizer = new StubAuthorizer();
        TDExample example = new TDExample(authorizer);

        example.doStuff("username","P@ssword");

        assertThat(example.hasDoneStuff()).isTrue();
    }
    
}
