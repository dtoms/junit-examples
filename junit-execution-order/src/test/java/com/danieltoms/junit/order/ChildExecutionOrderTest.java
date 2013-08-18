package com.danieltoms.junit.order;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demonstrates the execution order in a JUnit Test class hierarchy.
 * @author dtoms
 */
public class ChildExecutionOrderTest extends AbstractParentExecutionOrderTest {
	private final static Logger log = LoggerFactory
			.getLogger(ChildExecutionOrderTest.class);

	@BeforeClass
	public static void setupChildClassResourceOne()
	{
		log.info("@BeforeClass: setupChildClassResourceOne");
	}
	
	@AfterClass
	public static void teardownChildClassResourceOne()
	{
		log.info("@AfterClass: teardownChildClassResourceOne");
	}
	
	@Before
	public void setupChildResourceOne() {
		log.info("@Before: setupChildResourceOne");
	}

	@After
	public void tearDownChildResourceOne() {
		log.info("@After: tearDownChildResourceOne");
	}

	@Test
	public void calculateChildOne() {
		log.info("@Test: calculateChildOne");
	}
	
	@Test
	public void calculateChildTwo() {
		log.info("@Test: calculateChildTwo");
	}
}
