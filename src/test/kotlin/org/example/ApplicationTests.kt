package org.example

import org.example.controller.PingController
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {
    @Test
    fun ping(@Autowired pingController: PingController) {
        Assertions.assertEquals("Testing123", pingController.ping())
    }
}
