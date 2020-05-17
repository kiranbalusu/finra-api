package com.finra.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FinraLogger {
	private Logger logger;

	/**
	 * Initialize logger object
	 * 
	 * @param clazz
	 */
	public FinraLogger(Class<?> clazz) {
		this.logger = LoggerFactory.getLogger(clazz);
	}

	/**
	 * Initialize Logger object
	 * 
	 * @param name
	 */
	public FinraLogger(String name) {
		this.logger = LoggerFactory.getLogger(name);
	}

	/**
	 * A simple implementation which logs messages of level
	 * 
	 * @param msg
	 */
	public void trace(String msg) {
		logger.trace(msg);
	}

	/**
	 * Log a message of level TRACE, including an exception
	 * 
	 * @param msg
	 * @param t
	 */
	public void trace(String msg, Throwable t) {
		logger.trace(msg, t);
	}

	/**
	 * Perform double parameter substitution before logging the message of level
	 * 
	 * @param format
	 * @param arguments
	 */
	public void trace(String format, Object... arguments) {
		logger.trace(format, arguments);
	}

	/**
	 * A simple implementation which logs messages of level
	 * 
	 * @param msg
	 */
	public void debug(String msg) {
		logger.debug(msg);
	}

	/**
	 * Log a message of level DEBUG, including an exception
	 * 
	 * @param msg
	 * @param t
	 */
	public void debug(String msg, Throwable t) {
		logger.debug(msg, t);
	}

	/**
	 * Perform double parameter substitution before logging the message of level
	 * 
	 * @param format
	 * @param arguments
	 */
	public void debug(String format, Object... arguments) {
		logger.debug(format, arguments);
	}

	/**
	 * A simple implementation which logs messages of level
	 * 
	 * @param msg
	 */
	public void info(String msg) {
		logger.info(msg);
	}

	/**
	 * Perform single parameter substitution before logging the message of level
	 * 
	 * @param format
	 * @param arg
	 */
	public void info(String format, Object arg) {
		logger.info(format, arg);
	}

	/**
	 * Log a message of level INFO, including an exception
	 * 
	 * @param msg
	 * @param t
	 */
	public void info(String msg, Throwable t) {
		logger.info(msg, t);
	}

	/**
	 * Perform double parameter substitution before logging the message of level
	 * 
	 * @param format
	 * @param arguments
	 */
	public void info(String format, Object... arguments) {
		logger.info(format, arguments);
	}
	
	/**
	 * A simple implementation which logs messages of level
	 * 
	 * @param msg
	 */
	public void warn(String msg) {
		logger.warn(msg);
	}

	/**
	 * Log a message of level WARN, including an exception
	 * 
	 * @param msg
	 * @param t
	 */
	public void warn(String msg, Throwable t) {
		logger.warn(msg, t);
	}

	/**
	 * Perform double parameter substitution before logging the message of level
	 * 
	 * @param format
	 * @param arguments
	 */
	public void warn(String format, Object... arguments) {
		logger.warn(format, arguments);
	}

	/**
	 * A simple implementation which logs messages of level
	 * 
	 * @param msg
	 */
	public void error(String msg) {
		logger.error(msg);
	}

	/**
	 * Log a message of level ERROR, including an exception
	 * 
	 * @param msg
	 * @param t
	 */
	public void error(String msg, Throwable t) {
		logger.trace(msg, t);
	}

	/**
	 * Perform double parameter substitution before logging the message of level
	 * 
	 * @param format
	 * @param arguments
	 */
	public void error(String format, Object... arguments) {
		logger.error(format, arguments);
	}

	/**
	 * A simple implementation which logs messages of level
	 * 
	 * @param msg
	 */
	public void fatal(String msg) {
		logger.trace(msg);
	}

	/**
	 * Log a message of level FATAL, including an exception
	 * 
	 * @param msg
	 * @param t
	 */
	public void fatal(String msg, Throwable t) {
		logger.trace(msg, t);
	}

	/**
	 * Perform double parameter substitution before logging the message of level
	 * 
	 * @param format
	 * @param arguments
	 */
	public void fatal(String format, Object... arguments) {
		logger.trace(format, arguments);
	}

}
