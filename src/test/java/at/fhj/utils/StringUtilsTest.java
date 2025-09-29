package at.fhj.utils;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testIsPalindrome() {
        String input = "madam";
        boolean result = StringUtils.isPalindrome(input);
        assert(result == true);
    }
    
}
