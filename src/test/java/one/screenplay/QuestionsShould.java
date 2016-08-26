package one.screenplay;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Handcrafted in Europe with love by Enrique Comba Riepenhausen (ecomba).
 */
public class QuestionsShould {

    @Test
    public void haveAnAnswer() {
        Question<String, Integer> question = new Question<String, Integer>() {
            String subject;

            @Override
            public Integer answer() {
                return subject.length();
            }

            @Override
            public Question<String, Integer> in(String subject) {
                this.subject = subject;
                return this;
            }
        }.in("This should be 17");

        assertThat(question.answer()).isEqualTo(17);
    }
}