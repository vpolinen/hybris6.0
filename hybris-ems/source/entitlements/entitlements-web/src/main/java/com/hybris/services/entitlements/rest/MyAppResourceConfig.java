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
package com.hybris.services.entitlements.rest;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * This class configures Jersey.
 */
public class MyAppResourceConfig extends ResourceConfig
{
    public MyAppResourceConfig()
    {
        register(JacksonJaxbJsonProvider.class); // Workaround for https://github.com/FasterXML/jackson-jaxrs-providers/issues/22
        packages("com.hybris.services.entitlements.rest.exception.mappers");
    }
}