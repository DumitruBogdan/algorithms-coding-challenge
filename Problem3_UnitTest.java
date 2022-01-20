import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class Problem3_UnitTest {

    @Test
    public void exampleTestCase1() {
        Stack<Character> jenny = new Stack<>();
        Stack<Character> stephanie = new Stack<>();
        jenny.push('A');
        jenny.push('C');
        jenny.push('A');
        stephanie.push('F');
        stephanie.push('C');
        stephanie.push('B');
        String result = Problem3.game(jenny, stephanie);
        Assert.assertEquals("ABCACF", result);
    }

    @Test
    // [MAXBOUNDARY, C) U (C, MINBOUNDDARY]
    public void maxBoundaryCheck() {
        Stack<Character> jenny = new Stack<>();
        Stack<Character> stephanie = new Stack<>();
        jenny.push('Z');
        stephanie.push('C');
        String result = Problem3.game(jenny, stephanie);
        Assert.assertEquals("CZ", result);
    }

    @Test
    // [MAXBOUNDARY, C) U (C, MINBOUNDDARY]
    public void minValueInFirstInterval() {
        Stack<Character> jenny = new Stack<>();
        Stack<Character> stephanie = new Stack<>();
        jenny.push('D');
        stephanie.push('C');
        String result = Problem3.game(jenny, stephanie);
        Assert.assertEquals("CD", result);
    }

    @Test
    // [MAXBOUNDARY, C) U (C, MINBOUNDDARY]
    public void maxValueInSecondInterval() {
        Stack<Character> jenny = new Stack<>();
        Stack<Character> stephanie = new Stack<>();
        jenny.push('B');
        stephanie.push('C');
        String result = Problem3.game(jenny, stephanie);
        Assert.assertEquals("BC", result);
    }

    @Test
    // [MAXBOUNDARY, C) U (C, MINBOUNDDARY]
    public void minBoundaryValue() {
        Stack<Character> jenny = new Stack<>();
        Stack<Character> stephanie = new Stack<>();
        jenny.push('A');
        stephanie.push('C');
        String result = Problem3.game(jenny, stephanie);
        Assert.assertEquals("AC", result);
    }
}
