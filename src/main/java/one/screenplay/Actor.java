package one.screenplay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Handcrafted in Europe with love by Enrique Comba Riepenhausen (ecomba).
 */
public class Actor {
    private String name;
    private Map<Class, Ability> abilities;
    private Memorable<?> memory;

    private Actor(String name) {
        this.name = name;
        this.abilities = new HashMap<>();
    }

    public static Actor named(String name) {
        return new Actor(name);
    }

    public String name() {
        return name;
    }

    public void learnTo(Ability ability) {
        abilities.put(ability.getClass(), ability);
    }

    public boolean hasLearnedTo(Class abilityAcquired) {
        return abilities.containsKey(abilityAcquired);
    }

    public void remember(Memorable memorable) {
        memory = memorable;
    }

    public Memorable<?> remember() {
        return memory;
    }

    public void attemptTo(Perform... tasks) {
        Arrays.asList(tasks).forEach(this::attempt);
    }

    private void attempt(Perform task) {
        task.performAs(this);
    }
}
