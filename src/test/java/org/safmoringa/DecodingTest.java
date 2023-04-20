package org.safmoringa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {

    @Test
    @DisplayName("Testing Decoding Program")
    void decode() {
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", Decode.decrypt("kyv hlztb sifne wfo aldgj fmvi kyv crqp ufx", 23));
        assertEquals("B@#",  Decode.decrypt("A@#", -1));
    }
}