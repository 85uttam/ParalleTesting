package com.zinnia.exceptions;

/**
 * Runtime Exception occurs when the path given for any of the files is incorrect.
 * @version 1.0
 * @since 1.0
 * @see com.zinnia.exceptions.InvalidPathForExcelException
 * @see com.zinnia.exceptions.InvalidPathForPropertyFileException
 */
@SuppressWarnings("serial")
public class InvalidPathForFilesException extends FrameworkException{

	/**
	 * Pass the message that needs to be appended to the stacktrace
	 * @param message Details about the exception or custom message
	 */
	public InvalidPathForFilesException(String message) {
		super(message);
	}

	/**
	 *
	 * @param message Details about the exception or custom message
	 * @param cause Pass the enriched stacktrace or customised stacktrace
	 */
	public InvalidPathForFilesException(String message,Throwable cause) {
		super(message,cause);
	}

}
