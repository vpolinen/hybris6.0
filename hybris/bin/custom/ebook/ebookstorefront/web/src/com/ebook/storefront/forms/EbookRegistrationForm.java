/**
 *
 */
package com.ebook.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;


/**
 * @author raghared
 *
 */
public class EbookRegistrationForm extends RegisterForm
{
	private String contactNumber;
	private String currentLocation;

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber()
	{
		return contactNumber;
	}

	/**
	 * @param contactNumber
	 *           the contactNumber to set
	 */
	public void setContactNumber(final String contactNumber)
	{
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the currentLocation
	 */
	public String getCurrentLocation()
	{
		return currentLocation;
	}

	/**
	 * @param currentLocation
	 *           the currentLocation to set
	 */
	public void setCurrentLocation(final String currentLocation)
	{
		this.currentLocation = currentLocation;
	}
}
