package com.danieltoms.junit.order;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.danieltoms.junit.order.simple.SimpleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		// suite order is guaranteed
        ExecutionOrderTest.class,
        SimpleTest.class
})
/**
 * Demonstrates how the Suite runner runs Test classes in order
 * @author dtoms
 *
 */
public class ExecutionOrderSuiteTest {

}
