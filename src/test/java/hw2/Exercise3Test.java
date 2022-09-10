package hw2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class Exercise3Test {

    Exercise3 ex3 = new Exercise3();

    @Test
    void fuzzySearchTest() {
        Assertions.assertTrue(ex3.fuzzySearch("car", "ca6$$#_rtwheel"));
        Assertions.assertTrue(ex3.fuzzySearch("cwhl", "cartwheel"));
        Assertions.assertTrue(ex3.fuzzySearch("cwhee", "cartwheel"));
        Assertions.assertTrue(ex3.fuzzySearch("cartwheel", "cartwheel"));
        Assertions.assertFalse(ex3.fuzzySearch("cwheeel", "cartwheel"));
        Assertions.assertFalse(ex3.fuzzySearch("lw", "cartwheel"));
    }
}