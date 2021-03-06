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

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.davinciti.liferay.model.TipoDiaCalendar;
import es.davinciti.liferay.service.TipoDiaCalendarLocalServiceUtil;

/**
 * @author Cmes
 * @generated
 */
public abstract class TipoDiaCalendarActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public TipoDiaCalendarActionableDynamicQuery() throws SystemException {
		setBaseLocalService(TipoDiaCalendarLocalServiceUtil.getService());
		setClass(TipoDiaCalendar.class);

		setClassLoader(es.davinciti.liferay.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("tipoDiaCalendarId");
	}
}