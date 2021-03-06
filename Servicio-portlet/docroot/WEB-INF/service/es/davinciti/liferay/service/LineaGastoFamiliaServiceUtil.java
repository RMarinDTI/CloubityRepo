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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for LineaGastoFamilia. This utility wraps
 * {@link es.davinciti.liferay.service.impl.LineaGastoFamiliaServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Cmes
 * @see LineaGastoFamiliaService
 * @see es.davinciti.liferay.service.base.LineaGastoFamiliaServiceBaseImpl
 * @see es.davinciti.liferay.service.impl.LineaGastoFamiliaServiceImpl
 * @generated
 */
public class LineaGastoFamiliaServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.davinciti.liferay.service.impl.LineaGastoFamiliaServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Devuelve las Familias de la Company
	*/
	public static java.util.List<es.davinciti.liferay.model.LineaGastoFamilia> getFamilias(
		long companyId) {
		return getService().getFamilias(companyId);
	}

	/**
	* Devuelve la Familia de la Linea de Gasto
	*/
	public static es.davinciti.liferay.model.LineaGastoFamilia getFamiliaLineaGasto(
		long lineagastoId) {
		return getService().getFamiliaLineaGasto(lineagastoId);
	}

	public static void clearService() {
		_service = null;
	}

	public static LineaGastoFamiliaService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LineaGastoFamiliaService.class.getName());

			if (invokableService instanceof LineaGastoFamiliaService) {
				_service = (LineaGastoFamiliaService)invokableService;
			}
			else {
				_service = new LineaGastoFamiliaServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(LineaGastoFamiliaServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LineaGastoFamiliaService service) {
	}

	private static LineaGastoFamiliaService _service;
}