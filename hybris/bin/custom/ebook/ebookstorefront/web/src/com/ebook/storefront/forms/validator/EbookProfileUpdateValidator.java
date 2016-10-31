/**
 *
 */
package com.ebook.storefront.forms.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.metadata.BeanDescriptor;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.ebook.storefront.forms.EbookUpdateProfileForm;


/**
 * @author raghared
 *
 */
@Component("ebookProfileValidator")
public class EbookProfileUpdateValidator implements Validator
{


	public boolean supports(final Class<?> aClass)
	{
		return EbookUpdateProfileForm.class.equals(aClass);
	}

	public void validate(final Object object, final Errors errors)
	{
		final EbookUpdateProfileForm profileForm = (EbookUpdateProfileForm) object;
		final String title = profileForm.getTitleCode();
		final String firstName = profileForm.getFirstName();
		final String lastName = profileForm.getLastName();
		final String contactNumber = profileForm.getContactNumber();
		final String currentLocation = profileForm.getCurrentLocation();

		if (StringUtils.isEmpty(title))
		{
			errors.rejectValue("titleCode", "profile.title.invalid");
		}
		else if (StringUtils.length(title) > 255)
		{
			errors.rejectValue("titleCode", "profile.title.invalid");
		}

		if (StringUtils.isBlank(firstName))
		{
			errors.rejectValue("firstName", "profile.firstName.invalid");
		}
		else if (StringUtils.length(firstName) > 255)
		{
			errors.rejectValue("firstName", "profile.firstName.invalid");
		}

		if (StringUtils.isBlank(lastName))
		{
			errors.rejectValue("lastName", "profile.lastName.invalid");
		}
		else if (StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "profile.lastName.invalid");
		}

		else if (contactNumber.length() != 10)
		{
			errors.rejectValue("contactNumber", "profile.contactNumber.invalid");
		}
		else if (StringUtils.length(currentLocation) > 255)
		{
			errors.rejectValue("currentLocation", "profile.currentLocation.invalid");
		}


	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#getConstraintsForClass(java.lang.Class)
	 */
	@Override
	public BeanDescriptor getConstraintsForClass(final Class<?> arg0)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#unwrap(java.lang.Class)
	 */
	@Override
	public <T> T unwrap(final Class<T> arg0)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#validate(java.lang.Object, java.lang.Class[])
	 */
	@Override
	public <T> Set<ConstraintViolation<T>> validate(final T arg0, final Class<?>... arg1)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#validateProperty(java.lang.Object, java.lang.String, java.lang.Class[])
	 */
	@Override
	public <T> Set<ConstraintViolation<T>> validateProperty(final T arg0, final String arg1, final Class<?>... arg2)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.validation.Validator#validateValue(java.lang.Class, java.lang.String, java.lang.Object,
	 * java.lang.Class[])
	 */
	@Override
	public <T> Set<ConstraintViolation<T>> validateValue(final Class<T> arg0, final String arg1, final Object arg2,
			final Class<?>... arg3)
	{
		// YTODO Auto-generated method stub
		return null;
	}

}
