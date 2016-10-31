/**
 *
 */
package com.ebook.core.comingsoon.service;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import javax.annotation.Resource;

import com.ebook.core.comingsoon.dao.ComingSoonDao;


/**
 * @author raghared
 *
 */
public class ComingSoonService
{
	@Resource(name = "comingSoonDao")
	private ComingSoonDao comingSoonDao;


	public List<ProductModel> productreturnedlist()
	{
		final List<ProductModel> listproducts = comingSoonDao.findcomingsoonproduct();
		return listproducts;
	}


}
