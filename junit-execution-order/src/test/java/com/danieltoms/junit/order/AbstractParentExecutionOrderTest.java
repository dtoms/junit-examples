package com.danieltoms.junit.order;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Demonstrates the execution order of a parent class in a JUnit Test class hierarchy.
 * @author dtoms
 */
public abstract class AbstractParentExecutionOrderTest {
	
	private final static Logger log = LoggerFactory
			.getLogger(AbstractParentExecutionOrderTest.class);


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
	public void calculateTwo() {
		log.info("@Test: calculateTwo");
	}
}
