/**
 *
 */
package com.ebook.facades.populators;

import de.hybris.platform.commercefacades.order.converters.populator.OrderEntryPopulator;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;


/**
 * @author ckumar16
 *
 */
public class EbookOrderEntryPopulator extends OrderEntryPopulator
{
	@Override
	public void populate(final AbstractOrderEntryModel source, final OrderEntryData target)
	{
		System.out.println("Befor Setting OderAddons===" + source.getOrderAddons());
		if (source.getOrderAddons() != null)
		{

			super.populate(source, target);
			target.setOrderAddons(source.getOrderAddons());
			System.out.println("After Setting...OrderAddons not null");
			System.out.println("After OrderAddons are....=" + target.getOrderAddons());
		}


	}
}
