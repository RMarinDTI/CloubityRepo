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

import es.davinciti.liferay.model.ConnectionData;

import java.util.List;

/**
 * The persistence utility for the connection data service. This utility wraps {@link ConnectionDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Cmes
 * @see ConnectionDataPersistence
 * @see ConnectionDataPersistenceImpl
 * @generated
 */
public class ConnectionDataUtil {
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
	public static void clearCache(ConnectionData connectionData) {
		getPersistence().clearCache(connectionData);
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
	public static List<ConnectionData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ConnectionData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ConnectionData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ConnectionData update(ConnectionData connectionData)
		throws SystemException {
		return getPersistence().update(connectionData);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ConnectionData update(ConnectionData connectionData,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(connectionData, serviceContext);
	}

	/**
	* Caches the connection data in the entity cache if it is enabled.
	*
	* @param connectionData the connection data
	*/
	public static void cacheResult(
		es.davinciti.liferay.model.ConnectionData connectionData) {
		getPersistence().cacheResult(connectionData);
	}

	/**
	* Caches the connection datas in the entity cache if it is enabled.
	*
	* @param connectionDatas the connection datas
	*/
	public static void cacheResult(
		java.util.List<es.davinciti.liferay.model.ConnectionData> connectionDatas) {
		getPersistence().cacheResult(connectionDatas);
	}

	/**
	* Creates a new connection data with the primary key. Does not add the connection data to the database.
	*
	* @param connectionDataId the primary key for the new connection data
	* @return the new connection data
	*/
	public static es.davinciti.liferay.model.ConnectionData create(
		long connectionDataId) {
		return getPersistence().create(connectionDataId);
	}

	/**
	* Removes the connection data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionDataId the primary key of the connection data
	* @return the connection data that was removed
	* @throws es.davinciti.liferay.NoSuchConnectionDataException if a connection data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionData remove(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionDataException {
		return getPersistence().remove(connectionDataId);
	}

	public static es.davinciti.liferay.model.ConnectionData updateImpl(
		es.davinciti.liferay.model.ConnectionData connectionData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(connectionData);
	}

	/**
	* Returns the connection data with the primary key or throws a {@link es.davinciti.liferay.NoSuchConnectionDataException} if it could not be found.
	*
	* @param connectionDataId the primary key of the connection data
	* @return the connection data
	* @throws es.davinciti.liferay.NoSuchConnectionDataException if a connection data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionData findByPrimaryKey(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.davinciti.liferay.NoSuchConnectionDataException {
		return getPersistence().findByPrimaryKey(connectionDataId);
	}

	/**
	* Returns the connection data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param connectionDataId the primary key of the connection data
	* @return the connection data, or <code>null</code> if a connection data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.davinciti.liferay.model.ConnectionData fetchByPrimaryKey(
		long connectionDataId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(connectionDataId);
	}

	/**
	* Returns all the connection datas.
	*
	* @return the connection datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionData> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the connection datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connection datas
	* @param end the upper bound of the range of connection datas (not inclusive)
	* @return the range of connection datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionData> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the connection datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of connection datas
	* @param end the upper bound of the range of connection datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection datas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the connection datas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of connection datas.
	*
	* @return the number of connection datas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the connection configses associated with the connection data.
	*
	* @param pk the primary key of the connection data
	* @return the connection configses associated with the connection data
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getConnectionConfigses(pk);
	}

	/**
	* Returns a range of all the connection configses associated with the connection data.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection data
	* @param start the lower bound of the range of connection datas
	* @param end the upper bound of the range of connection datas (not inclusive)
	* @return the range of connection configses associated with the connection data
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getConnectionConfigses(pk, start, end);
	}

	/**
	* Returns an ordered range of all the connection configses associated with the connection data.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.davinciti.liferay.model.impl.ConnectionDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the connection data
	* @param start the lower bound of the range of connection datas
	* @param end the upper bound of the range of connection datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of connection configses associated with the connection data
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.davinciti.liferay.model.ConnectionConfigs> getConnectionConfigses(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getConnectionConfigses(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of connection configses associated with the connection data.
	*
	* @param pk the primary key of the connection data
	* @return the number of connection configses associated with the connection data
	* @throws SystemException if a system exception occurred
	*/
	public static int getConnectionConfigsesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getConnectionConfigsesSize(pk);
	}

	/**
	* Returns <code>true</code> if the connection configs is associated with the connection data.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigsPK the primary key of the connection configs
	* @return <code>true</code> if the connection configs is associated with the connection data; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsConnectionConfigs(long pk,
		long connectionConfigsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsConnectionConfigs(pk, connectionConfigsPK);
	}

	/**
	* Returns <code>true</code> if the connection data has any connection configses associated with it.
	*
	* @param pk the primary key of the connection data to check for associations with connection configses
	* @return <code>true</code> if the connection data has any connection configses associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsConnectionConfigses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsConnectionConfigses(pk);
	}

	/**
	* Adds an association between the connection data and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigsPK the primary key of the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionConfigs(long pk, long connectionConfigsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addConnectionConfigs(pk, connectionConfigsPK);
	}

	/**
	* Adds an association between the connection data and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigs the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addConnectionConfigs(pk, connectionConfigs);
	}

	/**
	* Adds an association between the connection data and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigsPKs the primary keys of the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionConfigses(long pk,
		long[] connectionConfigsPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addConnectionConfigses(pk, connectionConfigsPKs);
	}

	/**
	* Adds an association between the connection data and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigses the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public static void addConnectionConfigses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addConnectionConfigses(pk, connectionConfigses);
	}

	/**
	* Clears all associations between the connection data and its connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data to clear the associated connection configses from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearConnectionConfigses(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearConnectionConfigses(pk);
	}

	/**
	* Removes the association between the connection data and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigsPK the primary key of the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public static void removeConnectionConfigs(long pk, long connectionConfigsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeConnectionConfigs(pk, connectionConfigsPK);
	}

	/**
	* Removes the association between the connection data and the connection configs. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigs the connection configs
	* @throws SystemException if a system exception occurred
	*/
	public static void removeConnectionConfigs(long pk,
		es.davinciti.liferay.model.ConnectionConfigs connectionConfigs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeConnectionConfigs(pk, connectionConfigs);
	}

	/**
	* Removes the association between the connection data and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigsPKs the primary keys of the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeConnectionConfigses(long pk,
		long[] connectionConfigsPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeConnectionConfigses(pk, connectionConfigsPKs);
	}

	/**
	* Removes the association between the connection data and the connection configses. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigses the connection configses
	* @throws SystemException if a system exception occurred
	*/
	public static void removeConnectionConfigses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeConnectionConfigses(pk, connectionConfigses);
	}

	/**
	* Sets the connection configses associated with the connection data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigsPKs the primary keys of the connection configses to be associated with the connection data
	* @throws SystemException if a system exception occurred
	*/
	public static void setConnectionConfigses(long pk,
		long[] connectionConfigsPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setConnectionConfigses(pk, connectionConfigsPKs);
	}

	/**
	* Sets the connection configses associated with the connection data, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the connection data
	* @param connectionConfigses the connection configses to be associated with the connection data
	* @throws SystemException if a system exception occurred
	*/
	public static void setConnectionConfigses(long pk,
		java.util.List<es.davinciti.liferay.model.ConnectionConfigs> connectionConfigses)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setConnectionConfigses(pk, connectionConfigses);
	}

	public static ConnectionDataPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ConnectionDataPersistence)PortletBeanLocatorUtil.locate(es.davinciti.liferay.service.ClpSerializer.getServletContextName(),
					ConnectionDataPersistence.class.getName());

			ReferenceRegistry.registerReference(ConnectionDataUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ConnectionDataPersistence persistence) {
	}

	private static ConnectionDataPersistence _persistence;
}