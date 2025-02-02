package com.zinnia.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.zinnia.enums.AuthorType;
import com.zinnia.enums.CategoryType;

/**
 * Framework Annotation is user built annotation which is annotated on top of test methods to log the author details and
 * category details to the extent report.<p>
 *
 * Runtime retention value indicate that this annotation will be available at run time for reflection operations.
 *
 * @see com.zinnia.tests;
 * @see com.zinnia.enums.CategoryType
 */


@Retention(RUNTIME)
@Target(METHOD)
@Documented
public @interface FrameworkAnnotation {
	/**
	 * Store the authors who created the tests in String[]
	 * Manadatory to enter atleast a value
	 */
	public AuthorType[] author();

	/**
	 * Stores the category in form of Enum Array. Include the possible values in {@link com.zinnia.enums.CategoryType}
	 */
	public CategoryType[] category();

}
