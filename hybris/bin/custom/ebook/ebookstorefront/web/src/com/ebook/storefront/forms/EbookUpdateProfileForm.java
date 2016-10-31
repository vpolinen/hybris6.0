/**
 *
 */
package com.ebook.storefront.forms;

/**
 * @author raghared
 *
 */
public class EbookUpdateProfileForm
{
	private String titleCode;
	private String firstName;
	private String lastName;


	private String contactNumber;
	private String currentLocation;

	/**
	 * @return the titleCode
	 */
	public String getTitleCode()
	{
		return titleCode;
	}

	/**
	 * @param titleCode
	 *           the titleCode to set
	 */
	public void setTitleCode(final String titleCode)
	{
		this.titleCode = titleCode;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName
	 *           the firstName to set
	 */
	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName
	 *           the lastName to set
	 */
	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}

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
