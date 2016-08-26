package one.screenplay;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Handcrafted in Europe with love by Enrique Comba Riepenhausen (ecomba).
 */
public class MemorableShould {

    @Test
    public void containAStringMemory() {
        Memorable memorable = new Memorable<>("Hey!");

        assertThat(memorable.value()).isEqualTo("Hey!");
    }

    @Test
    public void containAnIntMemory() {
        Memorable memorable = new Memorable<>(42);

        assertThat(memorable.value()).isEqualTo(42);
    }
}