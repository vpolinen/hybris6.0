/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Oct 12, 2016 4:21:44 PM                     ---
 * ----------------------------------------------------------------
 */
package com.ebook.core.jalo;

import com.ebook.core.constants.EbookCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem DetailsComingSoon}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDetailsComingSoon extends GenericItem
{
	/** Qualifier of the <code>DetailsComingSoon.firstname</code> attribute **/
	public static final String FIRSTNAME = "firstname";
	/** Qualifier of the <code>DetailsComingSoon.lastname</code> attribute **/
	public static final String LASTNAME = "lastname";
	/** Qualifier of the <code>DetailsComingSoon.emailid</code> attribute **/
	public static final String EMAILID = "emailid";
	/** Qualifier of the <code>DetailsComingSoon.phoneno</code> attribute **/
	public static final String PHONENO = "phoneno";
	/** Qualifier of the <code>DetailsComingSoon.productCode</code> attribute **/
	public static final String PRODUCTCODE = "productCode";
	/** Qualifier of the <code>DetailsComingSoon.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>DetailsComingSoon.isExportedCustomer</code> attribute **/
	public static final String ISEXPORTEDCUSTOMER = "isExportedCustomer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(EMAILID, AttributeMode.INITIAL);
		tmp.put(PHONENO, AttributeMode.INITIAL);
		tmp.put(PRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(ISEXPORTEDCUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.emailid</code> attribute.
	 * @return the emailid
	 */
	public String getEmailid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.emailid</code> attribute.
	 * @return the emailid
	 */
	public String getEmailid()
	{
		return getEmailid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.emailid</code> attribute. 
	 * @param value the emailid
	 */
	public void setEmailid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.emailid</code> attribute. 
	 * @param value the emailid
	 */
	public void setEmailid(final String value)
	{
		setEmailid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.firstname</code> attribute.
	 * @return the firstname
	 */
	public String getFirstname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.firstname</code> attribute.
	 * @return the firstname
	 */
	public String getFirstname()
	{
		return getFirstname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.firstname</code> attribute. 
	 * @param value the firstname
	 */
	public void setFirstname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.firstname</code> attribute. 
	 * @param value the firstname
	 */
	public void setFirstname(final String value)
	{
		setFirstname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.isExportedCustomer</code> attribute.
	 * @return the isExportedCustomer - Export Customer details
	 */
	public Boolean isIsExportedCustomer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISEXPORTEDCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.isExportedCustomer</code> attribute.
	 * @return the isExportedCustomer - Export Customer details
	 */
	public Boolean isIsExportedCustomer()
	{
		return isIsExportedCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.isExportedCustomer</code> attribute. 
	 * @return the isExportedCustomer - Export Customer details
	 */
	public boolean isIsExportedCustomerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsExportedCustomer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.isExportedCustomer</code> attribute. 
	 * @return the isExportedCustomer - Export Customer details
	 */
	public boolean isIsExportedCustomerAsPrimitive()
	{
		return isIsExportedCustomerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.isExportedCustomer</code> attribute. 
	 * @param value the isExportedCustomer - Export Customer details
	 */
	public void setIsExportedCustomer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISEXPORTEDCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.isExportedCustomer</code> attribute. 
	 * @param value the isExportedCustomer - Export Customer details
	 */
	public void setIsExportedCustomer(final Boolean value)
	{
		setIsExportedCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.isExportedCustomer</code> attribute. 
	 * @param value the isExportedCustomer - Export Customer details
	 */
	public void setIsExportedCustomer(final SessionContext ctx, final boolean value)
	{
		setIsExportedCustomer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.isExportedCustomer</code> attribute. 
	 * @param value the isExportedCustomer - Export Customer details
	 */
	public void setIsExportedCustomer(final boolean value)
	{
		setIsExportedCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.lastname</code> attribute.
	 * @return the lastname
	 */
	public String getLastname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.lastname</code> attribute.
	 * @return the lastname
	 */
	public String getLastname()
	{
		return getLastname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.lastname</code> attribute. 
	 * @param value the lastname
	 */
	public void setLastname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.lastname</code> attribute. 
	 * @param value the lastname
	 */
	public void setLastname(final String value)
	{
		setLastname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.phoneno</code> attribute.
	 * @return the phoneno
	 */
	public String getPhoneno(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.phoneno</code> attribute.
	 * @return the phoneno
	 */
	public String getPhoneno()
	{
		return getPhoneno( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.phoneno</code> attribute. 
	 * @param value the phoneno
	 */
	public void setPhoneno(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONENO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.phoneno</code> attribute. 
	 * @param value the phoneno
	 */
	public void setPhoneno(final String value)
	{
		setPhoneno( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.productCode</code> attribute.
	 * @return the productCode
	 */
	public String getProductCode()
	{
		return getProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.productCode</code> attribute. 
	 * @param value the productCode
	 */
	public void setProductCode(final String value)
	{
		setProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DetailsComingSoon.productName</code> attribute.
	 * @return the productName
	 */
	public String getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DetailsComingSoon.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final String value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
}
