package com.zinnia.enums;

/**
 * Enums to restrict the users to choose an appropriate waiting strategy before operating an element.
 *
 * @version 1.0
 * @since 1.0
 * @see com.zinnia.factories.ExplicitWaitFactory
 * @see com.zinnia.pages.BasePage
 */
public enum WaitStrategy {


	CLICKABLE,
	PRESENCE,
	VISIBLE,
	NONE

}
