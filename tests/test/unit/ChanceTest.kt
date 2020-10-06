/*
 * Copyright (c) 2020 by Fred George
 * May be used freely except for training; license required for training.
 * @author Fred George
 */

package unit

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.fail

// Ensures Rectangle operates correctly
class ChanceTest {

    @Test
    fun chance() {
        assertEquals(Chance(1.0), Chance(1.0))

        try {
            Chance(2.0)
            fail()
        } catch (IllegalArgumentException e) {

        }
    }
}

class Chance(private val value: Double) {
    override fun equals(other: Any?): Boolean {
        if (other !is Chance) return false
        return this.value.equals(other.value)
    }
}
