package io.kotlintest.specs

import io.kotlintest.KTestJUnitRunner
import io.kotlintest.TestBase
import io.kotlintest.TestCase
import org.junit.runner.RunWith

@RunWith(KTestJUnitRunner::class)
abstract class StringSpec : TestBase() {

  operator fun String.invoke(test: () -> Unit): TestCase {
    val tc = TestCase(suite = root, name = this, test = test, config = defaultTestCaseConfig)
    root.cases.add(tc)
    return tc
  }
}