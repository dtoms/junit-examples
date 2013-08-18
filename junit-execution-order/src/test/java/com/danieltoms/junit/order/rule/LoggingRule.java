package com.danieltoms.junit.order.rule;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingRule extends TestWatcher {
	private final static Logger log = LoggerFactory
			.getLogger(LoggingRule.class);

	private boolean classRule = false;

	private String prefix;

	private String fieldName;

	@Override
	protected void succeeded(Description description) {
		log.info(getMessage("succeeded", description));

	}

	private String getMessage(String status, Description description) {
		StringBuilder msg = new StringBuilder();
		msg.append(prefix);
		msg.append(". State: '");
		msg.append(status);
		msg.append("'. Field: ");
		msg.append(fieldName);
	

		if (!classRule) {
			msg.append(". Method: ");
			msg.append(description.getMethodName());
		}
		return msg.toString();
	}

	@Override
	protected void starting(Description description) {
		log.info(getMessage("starting", description));
	}

	@Override
	protected void finished(Description description) {
		log.info(getMessage("finished", description));

	}

	public LoggingRule setClassScope(boolean classScope) {
		classRule = classScope;

		if (classRule)
			prefix = "@ClassRule";
		else
			prefix = "@Rule";

		return this;
	}

	public LoggingRule setFieldName(String name) {
		fieldName = name;

		return this;
	}

}
