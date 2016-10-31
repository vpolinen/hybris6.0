/**
 *
 */
package com.ebook.storefront.forms.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ebook.storefront.forms.NotifyRegisterForm;


/**
 * @author raghared
 *
 */
@Component
public abstract class NotifyRegisterFormValidator implements Validator
{
	public static final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */

	public boolean supports(final Class<?> aClass)
	{
		// YTODO Auto-generated method stub
		return NotifyRegisterForm.class.equals(aClass);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */

	public void validate(final Object object, final Errors errors)
	{
		// YTODO Auto-generated method stub
		final NotifyRegisterForm form = new NotifyRegisterForm();

		final String firstName = form.getFirstName();
		final String lastName = form.getLastName();
		final String email = form.getEmail();
		final String productCode = form.getProductCode();
		final String productName = form.getProductName();

		if (StringUtils.isBlank(firstName))
		{
			errors.rejectValue("firstName", "register.firstName.invalid");
		}
		else if (StringUtils.length(firstName) > 255)
		{
			errors.rejectValue("firstName", "register.firstName.invalid");
		}

		if (StringUtils.isBlank(lastName))
		{
			errors.rejectValue("lastName", "register.lastName.invalid");
		}
		else if (StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.lastName.invalid");
		}

		if (StringUtils.isBlank(productCode))
		{
			errors.rejectValue("productCode", "register.productCode.invalid");
		}
		else if (StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("productCode", "register.productCode.invalid");
		}

		if (StringUtils.isBlank(productName))
		{
			errors.rejectValue("productName", "register.productName.invalid");
		}
		else if (StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("productName", "register.productName.invalid");
		}

		if (StringUtils.length(firstName) + StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.name.invalid");
			errors.rejectValue("firstName", "register.name.invalid");
			errors.rejectValue("productName", "register.name.invalid");
			errors.rejectValue("productCode", "register.name.invalid");
		}

		if (StringUtils.isEmpty(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}
		else if (StringUtils.length(email) > 255 || !validateEmailAddress(email))
		{
			errors.rejectValue("email", "register.email.invalid");
		}

	}

	public boolean validateEmailAddress(final String email)
	{
		final Matcher matcher = EMAIL_REGEX.matcher(email);
		return matcher.matches();
	}

}
