/**
 *
 */
package com.ebook.facades.customer.impl;

import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.impl.DefaultCartFacade;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;


/**
 * @author ckumar16
 *
 */
public class EbookDefaultCartFacade extends DefaultCartFacade
{
	public CartModificationData addToCart(final String code, final long quantity, final List<String> addonsList)
			throws CommerceCartModificationException
	{
		final ProductModel product = getProductService().getProductForCode(code);
		final CartModel cartModel = getCartService().getSessionCart();
		final CommerceCartParameter cartParameter = new CommerceCartParameter();
		cartParameter.setEnableHooks(true);
		cartParameter.setCart(cartModel);
		cartParameter.setQuantity(quantity);
		cartParameter.setProduct(product);
		cartParameter.setUnit(product.getUnit());
		cartParameter.setCreateNewEntry(false);
		cartParameter.setCartEntryAddons(addonsList);
		final CommerceCartModification modification = getCommerceCartService().addToCart(cartParameter);

		return getCartModificationConverter().convert(modification);
	}
}
