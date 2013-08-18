package com.danieltoms.junit.order;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

	ExecutionOrderSuiteTest.class,
	FixedMethodOrderTest.class,
	ExecutionOrderWithRulesTest.class,
	ChildExecutionOrderTest.class,
	ExecutionOrderWithRulesSuiteTest.class,
	ExecutionOrderWithBeforeAfterClassSuiteTest.class
})
/**
 * Just for fun
 * @author dtoms
 *
 */
public class ExcessiveSuiteTest {

}
