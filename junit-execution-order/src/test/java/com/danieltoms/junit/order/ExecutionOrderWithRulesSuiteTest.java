package com.danieltoms.junit.order;

import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.danieltoms.junit.order.rule.LoggingRule;
import com.danieltoms.junit.order.simple.SimpleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		// suite order is guaranteed
        ExecutionOrderTest.class,
        SimpleTest.class
})
/**
 * Demonstrates how a suite can also have @ClassRule rules
 * @author dtoms
 *
 */
public class ExecutionOrderWithRulesSuiteTest {

	@ClassRule
	public static LoggingRule suiteClassResourcesOne = new LoggingRule().setClassScope(true).setFieldName("suiteClassResourcesOne");

	@ClassRule
	public static LoggingRule suiteClassResourcesTwo = new LoggingRule().setClassScope(true).setFieldName("suiteClassResourcesTwo");


}
