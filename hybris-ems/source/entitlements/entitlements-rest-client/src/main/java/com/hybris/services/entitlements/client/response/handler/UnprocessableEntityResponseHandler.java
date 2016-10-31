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
package com.hybris.services.entitlements.client.response.handler;

import com.hybris.commons.client.RestResponse;
import com.hybris.services.entitlements.api.UnprocessableEntityException;
import com.hybris.services.entitlements.api.codes.ResourceCode;

/**
 * Response handler for 422 response code - Unprocessable Entity.
 */
public class UnprocessableEntityResponseHandler extends AbstractEntitlementRestResponseHandler
{
	/**
	 * The constructor.
	 */
    public UnprocessableEntityResponseHandler()
	{
        super(ResourceCode.CODE_422);
    }

    @Override
    protected Exception buildException(final RestResponse<?> response)
	{
        return new UnprocessableEntityException(getExceptionMessage(response));
    }
}
