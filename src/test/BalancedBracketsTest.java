package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Before

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String spec = "a single set of balanced brackets returns true";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void noBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBrackets("Mitchell"));
    }

    @Test
    public void hasBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBrackets("[Mitchell]"));
        assertTrue(BalancedBrackets.hasBrackets("[Mitchell"));
        assertTrue(BalancedBrackets.hasBrackets("Mitchell]"));

    }

    @Test
    public void singleBracketsBeforeChar(){
        String spec = "a pair of brackets before other characters returns true";
        boolean result = BalancedBrackets.hasBalancedBrackets("[]Mitchell");
//        boolean expected = true;
        assertTrue(spec, result);

    }

    @Test
    public void hasUnbalancedBracketsReturnsTrue() {
        String specLeftBracket = "hasUnbalancedBrackets returns true if str contains [ ";
        boolean actualLeftBracket = BalancedBrackets.hasUnbalancedBrackets("[Mitchell");
        boolean expectedLeftBracket = true;
        assertEquals(specLeftBracket,expectedLeftBracket,actualLeftBracket);

        String specRightBracket = "hasUnbalancedBrackets returns true if str contains ] ";
        boolean actualRightBracket = BalancedBrackets.hasUnbalancedBrackets("Mitchell]");
        boolean expectedRightBracket = true;
        assertEquals(specRightBracket,expectedRightBracket,actualRightBracket);

        String specOddBracket = "hasUnbalancedBrackets returns true if str contains odd number of [ and ] ";
        boolean actualOddBracket = BalancedBrackets.hasUnbalancedBrackets("[Mitchell][");
        boolean expectedOddBracket = true;
        assertEquals(specOddBracket,expectedOddBracket,actualOddBracket);

    }

    @Test
    public void hasUnbalancedBracketsReturnsFalse() {
        String specEvenBracket = "hasUnbalancedBrackets returns true if str contains even number of [ and ] ";
        boolean actualEvenBracket = BalancedBrackets.hasUnbalancedBrackets("[Mitchell]");
        boolean expectedEvenBracket = false;
        assertEquals(specEvenBracket,expectedEvenBracket,actualEvenBracket);

        String specEvenBrackets = "hasUnbalancedBrackets returns true if str contains even number of [ and ] ";
        boolean actualEvenBrackets = BalancedBrackets.hasUnbalancedBrackets("[[Mitchell]]");
        boolean expectedEvenBrackets = false;
        assertEquals(specEvenBrackets,expectedEvenBrackets,actualEvenBrackets);

        String specNoBracket = "hasUnbalancedBrackets returns true if str contains even number of [ and ] ";
        boolean actualNoBracket = BalancedBrackets.hasUnbalancedBrackets("Mitchell");
        boolean expectedNoBracket = false;
        assertEquals(specNoBracket,expectedNoBracket,actualNoBracket);
    }

    @Test
    public void hasReversedBrackets() {
        String spec = "hasUnbalancedBrackets returns true if str contains even number of [ and ] ";
        boolean result = BalancedBrackets.hasBalancedBrackets("][");
        boolean expected= false;
        assertEquals(spec, expected, result);
    }

    @Test
    public void hasReversedBracketsAmongCharacters() {
        String spec = "hasUnbalancedBrackets returns true if str contains even number of [ and ] ";
        boolean result = BalancedBrackets.hasBalancedBrackets("a]b[c");
        boolean expected= false;
        assertEquals(spec, expected, result);
    }

    @Test
    public void hasMultipleReversedBrackets() {
        String spec = "hasUnbalancedBrackets returns true if str contains even number of [ and ] ";
        boolean result = BalancedBrackets.hasBalancedBrackets("][][");
        boolean expected= false;
        assertEquals(spec, expected, result);
    }

    @Test
    public void stringWithNoReturnsTrue() {
        String spec = "a string with no brackets returns true";
        String testData = "Mitchell";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }
//    @Test
//    public void isValidStringReturnsTrue() {
//        assertTrue(BalancedBrackets.isValidString("Valid String"));
//    }

}
