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

package es.davinciti.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ApplicationStatus service. Represents a row in the &quot;CMES_ApplicationStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.davinciti.liferay.model.impl.ApplicationStatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.davinciti.liferay.model.impl.ApplicationStatusImpl}.
 * </p>
 *
 * @author Cmes
 * @see ApplicationStatus
 * @see es.davinciti.liferay.model.impl.ApplicationStatusImpl
 * @see es.davinciti.liferay.model.impl.ApplicationStatusModelImpl
 * @generated
 */
public interface ApplicationStatusModel extends BaseModel<ApplicationStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a application status model instance should use the {@link ApplicationStatus} interface instead.
	 */

	/**
	 * Returns the primary key of this application status.
	 *
	 * @return the primary key of this application status
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this application status.
	 *
	 * @param primaryKey the primary key of this application status
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the application status ID of this application status.
	 *
	 * @return the application status ID of this application status
	 */
	public long getApplicationStatusId();

	/**
	 * Sets the application status ID of this application status.
	 *
	 * @param applicationStatusId the application status ID of this application status
	 */
	public void setApplicationStatusId(long applicationStatusId);

	/**
	 * Returns the application name of this application status.
	 *
	 * @return the application name of this application status
	 */
	@AutoEscape
	public String getApplicationName();

	/**
	 * Sets the application name of this application status.
	 *
	 * @param applicationName the application name of this application status
	 */
	public void setApplicationName(String applicationName);

	/**
	 * Returns the status ID of this application status.
	 *
	 * @return the status ID of this application status
	 */
	@AutoEscape
	public String getStatusId();

	/**
	 * Sets the status ID of this application status.
	 *
	 * @param statusId the status ID of this application status
	 */
	public void setStatusId(String statusId);

	/**
	 * Returns the name of this application status.
	 *
	 * @return the name of this application status
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this application status.
	 *
	 * @param name the name of this application status
	 */
	public void setName(String name);

	/**
	 * Returns the description of this application status.
	 *
	 * @return the description of this application status
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this application status.
	 *
	 * @param description the description of this application status
	 */
	public void setDescription(String description);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		es.davinciti.liferay.model.ApplicationStatus applicationStatus);

	@Override
	public int hashCode();

	@Override
	public CacheModel<es.davinciti.liferay.model.ApplicationStatus> toCacheModel();

	@Override
	public es.davinciti.liferay.model.ApplicationStatus toEscapedModel();

	@Override
	public es.davinciti.liferay.model.ApplicationStatus toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}