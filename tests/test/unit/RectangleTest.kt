/*
 * Copyright (c) 2020 by Fred George
 * May be used freely except for training; license required for training.
 * @author Fred George
 */

package unit

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

// Ensures Rectangle operates correctly
class RectangleTest {

    @Test fun area() {
        assertEquals(24.0, Rectangle(6, 4).area())
    }
}