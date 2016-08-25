package org.ecomba.screenplay;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Handcrafted in Europe with love by Enrique Comba Riepenhausen (ecomba).
 */
public class ActorShould {

    private Actor tester;

    @Before
    public void tester() {
        tester = Actor.named("Gerome");
    }

    @Test
    public void haveAName() {
        assertThat(tester.name()).isEqualTo("Gerome");
    }

    @Test
    public void learnNewAbilities() {
        tester.learnTo(new TestCode());

        assertThat(tester.hasLearnedTo(TestCode.class)).isTrue();
    }

    private static class TestCode implements Ability {

        @Override
        public String skills() {
            return "";
        }
    }
}
