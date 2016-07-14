/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.davinciti.liferay.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for Currency. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Cmes
 * @see CurrencyLocalServiceUtil
 * @see es.davinciti.liferay.service.base.CurrencyLocalServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.CurrencyLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CurrencyLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CurrencyLocalServiceUtil} to access the currency local service. Add custom service methods to {@link es.davinciti.liferay.service.impl.CurrencyLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the currency to the database. Also notifies the appropriate model listeners.
	*
	* @param currency the currency
	* @return the currency that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public es.davinciti.liferay.model.Currency addCurrency(
		es.davinciti.liferay.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new currency with the primary key. Does not add the currency to the database.
	*
	* @param currencyId the primary key for the new currency
	* @return the new currency
	*/
	public es.davinciti.liferay.model.Currency createCurrency(long currencyId);

	/**
	* Deletes the currency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param currencyId the primary key of the currency
	* @return the currency that was removed
	* @throws PortalException if a currency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public es.davinciti.liferay.model.Currency deleteCurrency(long currencyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the currency from the database. Also notifies the appropriate model listeners.
	*
	* @param currency the currency
	* @return the currency that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public es.davinciti.liferay.model.Currency deleteCurrency(
		es.davinciti.liferay.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public es.davinciti.liferay.model.Currency fetchCurrency(long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the currency with the primary key.
	*
	* @param currencyId the primary key of the currency
	* @return the currency
	* @throws PortalException if a currency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public es.davinciti.liferay.model.Currency getCurrency(long currencyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the currencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.CurrencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of currencies
	* @param end the upper bound of the range of currencies (not inclusive)
	* @return the range of currencies
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<es.davinciti.liferay.model.Currency> getCurrencies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of currencies.
	*
	* @return the number of currencies
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCurrenciesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the currency in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param currency the currency
	* @return the currency that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public es.davinciti.liferay.model.Currency updateCurrency(
		es.davinciti.liferay.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCurrency(long lineagastoId, long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCurrency(long lineagastoId,
		es.davinciti.liferay.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCurrencies(long lineagastoId, long[] currencyIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addLineaGastoCurrencies(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.Currency> Currencies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void clearLineaGastoCurrencies(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteLineaGastoCurrency(long lineagastoId, long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteLineaGastoCurrency(long lineagastoId,
		es.davinciti.liferay.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteLineaGastoCurrencies(long lineagastoId, long[] currencyIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteLineaGastoCurrencies(long lineagastoId,
		java.util.List<es.davinciti.liferay.model.Currency> Currencies)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<es.davinciti.liferay.model.Currency> getLineaGastoCurrencies(
		long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<es.davinciti.liferay.model.Currency> getLineaGastoCurrencies(
		long lineagastoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<es.davinciti.liferay.model.Currency> getLineaGastoCurrencies(
		long lineagastoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLineaGastoCurrenciesCount(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasLineaGastoCurrency(long lineagastoId, long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasLineaGastoCurrencies(long lineagastoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void setLineaGastoCurrencies(long lineagastoId, long[] currencyIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;
}