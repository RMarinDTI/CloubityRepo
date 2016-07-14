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

package es.davinciti.liferay.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.davinciti.liferay.model.TipoDiaCalendar;

import java.util.List;

/**
 * The persistence utility for the tipo dia calendar service. This utility wraps {@link TipoDiaCalendarPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see TipoDiaCalendarPersistence
 * @see TipoDiaCalendarPersistenceImpl
 * @generated
 */
public class TipoDiaCalendarUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TipoDiaCalendar tipoDiaCalendar) {
		getPersistence().clearCache(tipoDiaCalendar);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TipoDiaCalendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TipoDiaCalendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TipoDiaCalendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TipoDiaCalendar update(TipoDiaCalendar tipoDiaCalendar)
		throws SystemException {
		return getPersistence().update(tipoDiaCalendar);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TipoDiaCalendar update(TipoDiaCalendar tipoDiaCalendar,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tipoDiaCalendar, serviceContext);
	}

	/**
	* Returns all the tipo dia calendars where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @return the matching tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> findByDescripcion(
		java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDescripcion(descripcion);
	}

	/**
	* Returns a range of all the tipo dia calendars where descripcion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of tipo dia calendars
	* @param end the upper bound of the range of tipo dia calendars (not inclusive)
	* @return the range of matching tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> findByDescripcion(
		java.lang.String descripcion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDescripcion(descripcion, start, end);
	}

	/**
	* Returns an ordered range of all the tipo dia calendars where descripcion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of tipo dia calendars
	* @param end the upper bound of the range of tipo dia calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> findByDescripcion(
		java.lang.String descripcion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDescripcion(descripcion, start, end, orderByComparator);
	}

	/**
	* Returns the first tipo dia calendar in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo dia calendar
	* @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a matching tipo dia calendar could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar findByDescripcion_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchTipoDiaCalendarException {
		return getPersistence()
				   .findByDescripcion_First(descripcion, orderByComparator);
	}

	/**
	* Returns the first tipo dia calendar in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo dia calendar, or <code>null</code> if a matching tipo dia calendar could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar fetchByDescripcion_First(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDescripcion_First(descripcion, orderByComparator);
	}

	/**
	* Returns the last tipo dia calendar in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo dia calendar
	* @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a matching tipo dia calendar could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar findByDescripcion_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchTipoDiaCalendarException {
		return getPersistence()
				   .findByDescripcion_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the last tipo dia calendar in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo dia calendar, or <code>null</code> if a matching tipo dia calendar could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar fetchByDescripcion_Last(
		java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDescripcion_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the tipo dia calendars before and after the current tipo dia calendar in the ordered set where descripcion = &#63;.
	*
	* @param tipoDiaCalendarId the primary key of the current tipo dia calendar
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tipo dia calendar
	* @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a tipo dia calendar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar[] findByDescripcion_PrevAndNext(
		long tipoDiaCalendarId, java.lang.String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchTipoDiaCalendarException {
		return getPersistence()
				   .findByDescripcion_PrevAndNext(tipoDiaCalendarId,
			descripcion, orderByComparator);
	}

	/**
	* Removes all the tipo dia calendars where descripcion = &#63; from the database.
	*
	* @param descripcion the descripcion
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDescripcion(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDescripcion(descripcion);
	}

	/**
	* Returns the number of tipo dia calendars where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @return the number of matching tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDescripcion(java.lang.String descripcion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDescripcion(descripcion);
	}

	/**
	* Caches the tipo dia calendar in the entity cache if it is enabled.
	*
	* @param tipoDiaCalendar the tipo dia calendar
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar) {
		getPersistence().cacheResult(tipoDiaCalendar);
	}

	/**
	* Caches the tipo dia calendars in the entity cache if it is enabled.
	*
	* @param tipoDiaCalendars the tipo dia calendars
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> tipoDiaCalendars) {
		getPersistence().cacheResult(tipoDiaCalendars);
	}

	/**
	* Creates a new tipo dia calendar with the primary key. Does not add the tipo dia calendar to the database.
	*
	* @param tipoDiaCalendarId the primary key for the new tipo dia calendar
	* @return the new tipo dia calendar
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar create(
		long tipoDiaCalendarId) {
		return getPersistence().create(tipoDiaCalendarId);
	}

	/**
	* Removes the tipo dia calendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoDiaCalendarId the primary key of the tipo dia calendar
	* @return the tipo dia calendar that was removed
	* @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a tipo dia calendar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar remove(
		long tipoDiaCalendarId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchTipoDiaCalendarException {
		return getPersistence().remove(tipoDiaCalendarId);
	}

	public static es.davinciti.liferay.model.TipoDiaCalendar updateImpl(
		es.davinciti.liferay.model.TipoDiaCalendar tipoDiaCalendar)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tipoDiaCalendar);
	}

	/**
	* Returns the tipo dia calendar with the primary key or throws a {@link es.davinciti.liferay.NoSuchTipoDiaCalendarException} if it could not be found.
	*
	* @param tipoDiaCalendarId the primary key of the tipo dia calendar
	* @return the tipo dia calendar
	* @throws es.davinciti.liferay.NoSuchTipoDiaCalendarException if a tipo dia calendar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar findByPrimaryKey(
		long tipoDiaCalendarId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchTipoDiaCalendarException {
		return getPersistence().findByPrimaryKey(tipoDiaCalendarId);
	}

	/**
	* Returns the tipo dia calendar with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipoDiaCalendarId the primary key of the tipo dia calendar
	* @return the tipo dia calendar, or <code>null</code> if a tipo dia calendar with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.TipoDiaCalendar fetchByPrimaryKey(
		long tipoDiaCalendarId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tipoDiaCalendarId);
	}

	/**
	* Returns all the tipo dia calendars.
	*
	* @return the tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tipo dia calendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo dia calendars
	* @param end the upper bound of the range of tipo dia calendars (not inclusive)
	* @return the range of tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tipo dia calendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.TipoDiaCalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo dia calendars
	* @param end the upper bound of the range of tipo dia calendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.TipoDiaCalendar> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tipo dia calendars from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tipo dia calendars.
	*
	* @return the number of tipo dia calendars
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TipoDiaCalendarPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TipoDiaCalendarPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					TipoDiaCalendarPersistence.class.getName());

			ReferenceRegistry.registerReference(TipoDiaCalendarUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TipoDiaCalendarPersistence persistence) {
	}

	private static TipoDiaCalendarPersistence _persistence;
}