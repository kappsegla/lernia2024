package se.lernia.java.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class TDExampleTest {

    @Test
    void givenValidUsernameAndPasswordWhenDoStuffRunsThenHasDoneStuffIsTrue() {
        Authorizer authorizer = new StubAuthorizer();
        //Authorizer authorizer = Mockito.mock(Authorizer.class);
        //Mockito.when(authorizer.authorize(Mockito.anyString(), Mockito.anyString())).thenReturn(true);

        TDExample example = new TDExample(authorizer);

        example.doStuff("username","P@ssword");

        assertThat(example.hasDoneStuff()).isTrue();
    }
    
}
