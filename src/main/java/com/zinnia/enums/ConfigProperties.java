package com.zinnia.enums;

/**
 * Enums to restrict the values used on Property files. Without using enums there can be null pointer exceptions happening
 * because of typos.
 * <p>
 * Whenever a new value is added to property file, corressponding enum should be created here.
 *
 * @version 1.0
 * @since 1.0
 * @see com.zinnia.utils.PropertyUtils
 */
public enum ConfigProperties {

	URL,
	OVERRIDEREPORTS,
	PASSEDSTEPSSCREENSHOTS,
	FAILEDSTEPSSCREENSHOTS,
	SKIPPEDSTEPSCREENSHOT,
	RETRYFAILEDTESTS,
	RUNMODE,
	SENDRESULTTOELK,
	SELENIUMGRIDURL,
	ELASTICURL,
	BROWSER

}
