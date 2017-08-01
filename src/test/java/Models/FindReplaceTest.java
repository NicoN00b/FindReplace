package Models;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class FindReplaceTest {
    @Test
    public void wordReplacer_SingleWord_1() throws Exception {
        FindReplace findReplace = new FindReplace();
        String expected = "hello new universe";

        assertEquals(expected, findReplace.wordReplacer("hello new world", "world", "universe"));
    }

}