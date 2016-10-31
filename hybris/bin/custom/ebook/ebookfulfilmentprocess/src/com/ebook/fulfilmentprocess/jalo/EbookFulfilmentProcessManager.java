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
 *
 *  
 */
package com.ebook.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.ebook.fulfilmentprocess.constants.EbookFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class EbookFulfilmentProcessManager extends GeneratedEbookFulfilmentProcessManager
{
	public static final EbookFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (EbookFulfilmentProcessManager) em.getExtension(EbookFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
