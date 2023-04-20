package org.safmoringa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {

    @Test
    @DisplayName("Testing Encoding Program")
    void encode() {
        assertEquals("kyv hlztb sifne wfo aldgj fmvi kyv crqp ufx", Encode.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));
    }
}