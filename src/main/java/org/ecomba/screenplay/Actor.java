package org.ecomba.screenplay;

import java.util.HashMap;
import java.util.Map;

/**
 * Handcrafted in Europe with love by Enrique Comba Riepenhausen (ecomba).
 */
public class Actor {
    private String name;
    private Map<Class, Ability> abilities;

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
}
