package one.screenplay;

/**
 * Handcrafted in Europe with love by Enrique Comba Riepenhausen (ecomba).
 */
public interface Question<SUBJECT, ANSWER> {
    ANSWER answer();

    Question<SUBJECT, ANSWER> in(SUBJECT subject);
}
