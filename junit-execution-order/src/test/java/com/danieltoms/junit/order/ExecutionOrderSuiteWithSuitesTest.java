package com.danieltoms.junit.order;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		// suite order is guaranteed
	ChildExecutionOrderTest.class,
	ExecutionOrderSuiteTest.class,
	ExecutionOrderWithRulesSuiteTest.class
})
/**
 * Demonstrates how the Suite runner can run other Suites and Test Classes
 * @author dtoms
 *
 */
public class ExecutionOrderSuiteWithSuitesTest {

}
