package com.danieltoms.junit.order.simple;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dtoms
 */
public class SimpleTest {
	
	protected final static Logger log = LoggerFactory
			.getLogger(SimpleTest.class);

	@Test
	public void calculateSimple()
	{
		log.info("@Test: calculateSimple");
	}
}
