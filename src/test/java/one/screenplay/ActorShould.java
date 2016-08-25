package one.screenplay;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    public void remember() {
        tester.remember(new Memorable<>("Hey!"));

        assertThat(tester.remember().value()).isEqualTo("Hey!");
    }

    @Test
    public void attemptToPerformATask() {
        PerformDouble task = new PerformDouble();
        tester.attemptTo(task);

        assertThat(task.wasCalledWith(tester)).isTrue();
    }

    @Test
    public void attemptToPerformManyTasks() {
        tester.attemptTo(new PerformDouble(), new PerformDouble());
    }

    private static class TestCode implements Ability {

        @Override
        public String skills() {
            return "";
        }
    }

    private class PerformDouble implements Perform {
        private Actor caller;
        private boolean performAsCalled = false;

        @Override
        public void performAs(Actor role) {
            performAsCalled = true;
            this.caller = role;
        }

        public boolean wasCalledWith(Actor role) {
            return role == caller && performAsCalled;
        }
    }
}
