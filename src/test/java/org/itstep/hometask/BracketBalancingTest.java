package org.itstep.hometask;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BracketBalancingTest {
    @Test
    public void testIsBalanced_ValidSequence() {
        String sequence = "([])";
        assertTrue(BracketBalancing.isBalanced(sequence));
    }

    @Test
    public void testIsBalanced_InvalidSequence() {
        String sequence = "[{]}";
        assertFalse(BracketBalancing.isBalanced(sequence));
    }

    @Test
    public void testIsBalanced_EmptySequence() {
        String sequence = "";
        assertTrue(BracketBalancing.isBalanced(sequence));
    }

    @Test
    public void testIsBalanced_UnbalancedOpenBrackets() {
        String sequence = "([)]";
        assertFalse(BracketBalancing.isBalanced(sequence));
    }

    @Test
    public void testIsBalanced_UnbalancedCloseBrackets() {
        String sequence = "({]";
        assertFalse(BracketBalancing.isBalanced(sequence));
    }
}