package one.screenplay;

import org.junit.Test;

import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Handcrafted in Europe with love by Enrique Comba Riepenhausen (ecomba).
 */
public class AbilityShould {

    @Test
    public void provideTheSkillsNeeded() {
        StringAbility beAString = new StringAbility();

        assertThat(beAString.skills()).isEqualTo("");
    }

    @Test
    public void provideAnyTypeOfSkill() {
        SystemOutAbility printOut = new SystemOutAbility();

        assertThat(printOut.skills()).isInstanceOf(PrintStream.class);
    }

    private class StringAbility implements Ability {
        private String skills = "";

        @Override
        public String skills() {
            return skills;
        }
    }

    private class SystemOutAbility implements Ability {
        private PrintStream skills = System.out;

        @Override
        public PrintStream skills() {
            return skills;
        }
    }
}
