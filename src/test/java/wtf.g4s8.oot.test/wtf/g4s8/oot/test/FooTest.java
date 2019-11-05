package wtf.g4s8.oot.test;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import wtf.g4s8.oot.Foo;

public final class FooTest {

    @Test
    public void addTest() {
        MatcherAssert.assertThat(new Foo(1).add(1), Matchers.equalTo(2));
    }
}
