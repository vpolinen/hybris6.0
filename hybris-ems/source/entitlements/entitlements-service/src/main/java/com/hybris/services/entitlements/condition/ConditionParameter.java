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

package com.hybris.services.entitlements.condition;

import com.hybris.services.entitlements.validation.AbstractConversionStrategy;

/**
 * Definition of condition parameter.
 *
 * <p>Used for parameter validation</p>
 */
public class ConditionParameter
{
	private final String name;
	private final boolean required;
	private final AbstractConversionStrategy validator;

	/**
	 * Create definition of required parameter.
	 *
	 * @param name Parameter name as it should appear in input data.
	 */
	public ConditionParameter(final String name)
	{
		this.name = name;
		required = true;
		validator = null;
	}

	/**
	 * Extended constructor.
	 *
	 * @param name Parameter name as it should appear in input data.
	 * @param required true if the parameter is not optional
	 * @param validator policy to validate the parameter
	 */
	public ConditionParameter(final String name, final boolean required, final AbstractConversionStrategy validator)
	{
		this.name = name;
		this.required = required;
		this.validator = validator;
	}

	public String getName()
	{
		return name;
	}

	public boolean isRequired()
	{
		return required;
	}

	public AbstractConversionStrategy getValidator()
	{
		return validator;
	}
}
