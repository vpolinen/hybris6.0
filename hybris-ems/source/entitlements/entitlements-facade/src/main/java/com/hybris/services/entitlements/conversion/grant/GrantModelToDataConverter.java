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
package com.hybris.services.entitlements.conversion.grant;

import com.hybris.commons.conversion.impl.AbstractPopulatingConverter;
import com.hybris.services.entitlements.api.GrantData;
import com.hybris.services.entitlements.domain.Grant;

/**
 * Convert grant model to grant DTO.
 */
public class GrantModelToDataConverter extends AbstractPopulatingConverter<Grant, GrantData>
{
	@Override
	protected GrantData createTarget()
	{
		return new GrantData();
	}
}
