package com.albertattard.blueprint

import kotlin.test.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.TestInstance

@Suppress("ClassName")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HelloTest {

    @Nested
    inner class `Showing Use Of Nesting` {
        @Test
        fun `should return hello world when world is given as a parameter`() {
            assertEquals("Hello World", Hello.greet("World"))
        }
    }
}
