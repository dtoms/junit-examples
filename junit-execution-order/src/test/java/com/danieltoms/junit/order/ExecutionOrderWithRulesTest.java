package com.danieltoms.junit.order;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.danieltoms.junit.order.rule.LoggingRule;

/**
 * Demonstrates how @ClassRule, @Rule, @BeforeClass, @AfterClass, @Before, and @After all interact in a test.
 * @author dtoms
 */
public class ExecutionOrderWithRulesTest {
	
	private final static Logger log = LoggerFactory
			.getLogger(ExecutionOrderWithRulesTest.class);

	@ClassRule
	public static LoggingRule classResourcesOne = new LoggingRule().setClassScope(true).setFieldName("classResourcesOne");

	@ClassRule
	public static LoggingRule classResourcesTwo = new LoggingRule().setClassScope(true).setFieldName("classResourcesTwo");

	@Rule
	public LoggingRule methodResourcesOne = new LoggingRule().setClassScope(false).setFieldName("methodResourcesOne");

	@Rule
	public LoggingRule methodResourcesTwo = new LoggingRule().setClassScope(false).setFieldName("methodResourcesTwo");

	
	@BeforeClass
	public static void setupClassResourceOne()
	{
		log.info("@BeforeClass: setupClassResourceOne");
	}
	
	@BeforeClass
	public static void setupClassResourceTwo()
	{
		log.info("@BeforeClass: setupClassResourceTwo");
	}
	
	@AfterClass
	public static void teardownClassResourceOne()
	{
		log.info("@AfterClass: teardownClassResourceOne");
	}
	
	@AfterClass
	public static void teardownClassResourceTwo()
	{
		log.info("@AfterClass: teardownClassResourceTwo");
	}

	
	@Before
	public void setupResourceOne() {
		log.info("@Before: setupResourceOne");
	}

	@Before
	public void setupResourceTwo() {
		log.info("@Before: setupResourceTwo");
	}

	@After
	public void tearDownResourceOne() {
		log.info("@After: tearDownResourceOne");
	}

	@After
	public void tearDownResourceTwo() {
		log.info("@After: tearDownResourceTwo");
	}

	@Test
	public void calculateOne() {
		log.info("@Test: calculateOne");
	}

	@Test
	public void acalculateTwo() {
		log.info("@Test: calculateTwo");
	}
}
