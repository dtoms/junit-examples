package com.danieltoms.junit.order;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.danieltoms.junit.order.simple.SimpleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		// suite order is guaranteed
        ExecutionOrderTest.class,
        SimpleTest.class
})
/**
 * Demonstrates how a suite can also have @BeforeClass and @AfterClass
 * @author dtoms
 *
 */
public class ExecutionOrderWithBeforeAfterClassSuiteTest {

	private final static Logger log = LoggerFactory
			.getLogger(ExecutionOrderWithBeforeAfterClassSuiteTest.class);


	@BeforeClass
	public static void setupSuiteResourceOne()
	{
		log.info("@BeforeClass: setupSuiteResourceOne");
	}
	
	@AfterClass
	public static void teardownSuiteResourceOne()
	{
		log.info("@AfterClass: setupSuiteResourceOne");
	}
}
