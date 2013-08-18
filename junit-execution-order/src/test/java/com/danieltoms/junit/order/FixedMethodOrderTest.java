package com.danieltoms.junit.order;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demonstrates JUnit 4.11 MethodSorters for guaranteed ordering.
 * @author dtoms
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedMethodOrderTest {
	
	protected final static Logger log = LoggerFactory
			.getLogger(FixedMethodOrderTest.class);

	@Test
	public void bCalculateSimple()
	{
		log.info("@Test: bCalculateSimple");
	}
	
	@Test
	public void cCalculateSimple()
	{
		log.info("@Test: cCalculateSimple");
	}
	
	@Test
	public void aCalculateSimple()
	{
		log.info("@Test: aCalculateSimple");
	}
	
	@Test
	public void t005_CalculateSimple()
	{
		log.info("@Test: t005_CalculateSimple");
	}
	@Test
	public void t001_aCalculateSimple()
	{
		log.info("@Test: t001_aCalculateSimple");
	}
	@Test
	public void t003_aCalculateSimple()
	{
		log.info("@Test: t003_aCalculateSimple");
	}
}
