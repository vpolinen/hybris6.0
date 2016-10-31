/**
 *
 */
package com.ebook.storefront.forms;

import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * @author ckumar16
 *
 */
public class EbookAddToCartForm
{
	@NotNull(message = "{basket.error.quantity.notNull}")
	@Min(value = 0, message = "{basket.error.quantity.invalid}")
	@Digits(fraction = 0, integer = 10, message = "{basket.error.quantity.invalid}")
	private long qty = 1L;

	private List<String> addons;

	/**
	 * @return the qty
	 */
	public long getQty()
	{
		return qty;
	}

	/**
	 * @param qty
	 *           the qty to set
	 */
	public void setQty(final long qty)
	{
		this.qty = qty;
	}

	/**
	 * @return the addons
	 */
	public List<String> getAddons()
	{
		return addons;
	}

	/**
	 * @param addons
	 *           the addons to set
	 */
	public void setAddons(final List<String> addons)
	{
		this.addons = addons;
	}

}
