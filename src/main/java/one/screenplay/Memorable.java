package one.screenplay;

/**
 * Handcrafted in Europe with love by Enrique Comba Riepenhausen (ecomba).
 */
public class Memorable<T> {

    private final T THING_TO_REMEMBER;

    public Memorable(T memory) {
        THING_TO_REMEMBER = memory;
    }

    public T value() {
        return THING_TO_REMEMBER;
    }
}
