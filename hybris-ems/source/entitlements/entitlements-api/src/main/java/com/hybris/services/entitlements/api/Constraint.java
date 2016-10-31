/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */

package com.hybris.services.entitlements.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation binds annotated field to a custom validator.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraint
{
	/**
	 * Spring bean id of com.hybris.services.entitlements.validation.Validator descendant, what will validate annotated field.
	 *
	 * @return bean id
	 */
	String value();
}
