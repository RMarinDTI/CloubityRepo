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

package es.davinciti.liferay.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import es.davinciti.liferay.model.SapEmployee;
import es.davinciti.liferay.model.SapEmployeeModel;
import es.davinciti.liferay.model.SapEmployeeSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SapEmployee service. Represents a row in the &quot;CMES_SapEmployee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.davinciti.liferay.model.SapEmployeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SapEmployeeImpl}.
 * </p>
 *
 * @author Cmes
 * @see SapEmployeeImpl
 * @see es.davinciti.liferay.model.SapEmployee
 * @see es.davinciti.liferay.model.SapEmployeeModel
 * @generated
 */
@JSON(strict = true)
public class SapEmployeeModelImpl extends BaseModelImpl<SapEmployee>
	implements SapEmployeeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sap employee model instance should use the {@link es.davinciti.liferay.model.SapEmployee} interface instead.
	 */
	public static final String TABLE_NAME = "CMES_SapEmployee";
	public static final Object[][] TABLE_COLUMNS = {
			{ "sapEmployeeId", Types.BIGINT },
			{ "employeeID", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "middleName", Types.VARCHAR },
			{ "gender", Types.VARCHAR },
			{ "jobTitle", Types.VARCHAR },
			{ "employeeType", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMES_SapEmployee (sapEmployeeId LONG not null primary key,employeeID LONG,userId LONG,middleName VARCHAR(75) null,gender VARCHAR(75) null,jobTitle VARCHAR(75) null,employeeType VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMES_SapEmployee";
	public static final String ORDER_BY_JPQL = " ORDER BY sapEmployee.sapEmployeeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMES_SapEmployee.sapEmployeeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.es.davinciti.liferay.model.SapEmployee"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.es.davinciti.liferay.model.SapEmployee"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.es.davinciti.liferay.model.SapEmployee"),
			true);
	public static long EMPLOYEEID_COLUMN_BITMASK = 1L;
	public static long USERID_COLUMN_BITMASK = 2L;
	public static long SAPEMPLOYEEID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SapEmployee toModel(SapEmployeeSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SapEmployee model = new SapEmployeeImpl();

		model.setSapEmployeeId(soapModel.getSapEmployeeId());
		model.setEmployeeID(soapModel.getEmployeeID());
		model.setUserId(soapModel.getUserId());
		model.setMiddleName(soapModel.getMiddleName());
		model.setGender(soapModel.getGender());
		model.setJobTitle(soapModel.getJobTitle());
		model.setEmployeeType(soapModel.getEmployeeType());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SapEmployee> toModels(SapEmployeeSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SapEmployee> models = new ArrayList<SapEmployee>(soapModels.length);

		for (SapEmployeeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.es.davinciti.liferay.model.SapEmployee"));

	public SapEmployeeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sapEmployeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSapEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sapEmployeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SapEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return SapEmployee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sapEmployeeId", getSapEmployeeId());
		attributes.put("employeeID", getEmployeeID());
		attributes.put("userId", getUserId());
		attributes.put("middleName", getMiddleName());
		attributes.put("gender", getGender());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("employeeType", getEmployeeType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sapEmployeeId = (Long)attributes.get("sapEmployeeId");

		if (sapEmployeeId != null) {
			setSapEmployeeId(sapEmployeeId);
		}

		Long employeeID = (Long)attributes.get("employeeID");

		if (employeeID != null) {
			setEmployeeID(employeeID);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String employeeType = (String)attributes.get("employeeType");

		if (employeeType != null) {
			setEmployeeType(employeeType);
		}
	}

	@JSON
	@Override
	public long getSapEmployeeId() {
		return _sapEmployeeId;
	}

	@Override
	public void setSapEmployeeId(long sapEmployeeId) {
		_sapEmployeeId = sapEmployeeId;
	}

	@JSON
	@Override
	public long getEmployeeID() {
		return _employeeID;
	}

	@Override
	public void setEmployeeID(long employeeID) {
		_columnBitmask |= EMPLOYEEID_COLUMN_BITMASK;

		if (!_setOriginalEmployeeID) {
			_setOriginalEmployeeID = true;

			_originalEmployeeID = _employeeID;
		}

		_employeeID = employeeID;
	}

	public long getOriginalEmployeeID() {
		return _originalEmployeeID;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getMiddleName() {
		if (_middleName == null) {
			return StringPool.BLANK;
		}
		else {
			return _middleName;
		}
	}

	@Override
	public void setMiddleName(String middleName) {
		_middleName = middleName;
	}

	@JSON
	@Override
	public String getGender() {
		if (_gender == null) {
			return StringPool.BLANK;
		}
		else {
			return _gender;
		}
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;
	}

	@JSON
	@Override
	public String getJobTitle() {
		if (_jobTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _jobTitle;
		}
	}

	@Override
	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	@JSON
	@Override
	public String getEmployeeType() {
		if (_employeeType == null) {
			return StringPool.BLANK;
		}
		else {
			return _employeeType;
		}
	}

	@Override
	public void setEmployeeType(String employeeType) {
		_employeeType = employeeType;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SapEmployee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SapEmployee toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SapEmployee)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SapEmployeeImpl sapEmployeeImpl = new SapEmployeeImpl();

		sapEmployeeImpl.setSapEmployeeId(getSapEmployeeId());
		sapEmployeeImpl.setEmployeeID(getEmployeeID());
		sapEmployeeImpl.setUserId(getUserId());
		sapEmployeeImpl.setMiddleName(getMiddleName());
		sapEmployeeImpl.setGender(getGender());
		sapEmployeeImpl.setJobTitle(getJobTitle());
		sapEmployeeImpl.setEmployeeType(getEmployeeType());

		sapEmployeeImpl.resetOriginalValues();

		return sapEmployeeImpl;
	}

	@Override
	public int compareTo(SapEmployee sapEmployee) {
		long primaryKey = sapEmployee.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SapEmployee)) {
			return false;
		}

		SapEmployee sapEmployee = (SapEmployee)obj;

		long primaryKey = sapEmployee.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		SapEmployeeModelImpl sapEmployeeModelImpl = this;

		sapEmployeeModelImpl._originalEmployeeID = sapEmployeeModelImpl._employeeID;

		sapEmployeeModelImpl._setOriginalEmployeeID = false;

		sapEmployeeModelImpl._originalUserId = sapEmployeeModelImpl._userId;

		sapEmployeeModelImpl._setOriginalUserId = false;

		sapEmployeeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SapEmployee> toCacheModel() {
		SapEmployeeCacheModel sapEmployeeCacheModel = new SapEmployeeCacheModel();

		sapEmployeeCacheModel.sapEmployeeId = getSapEmployeeId();

		sapEmployeeCacheModel.employeeID = getEmployeeID();

		sapEmployeeCacheModel.userId = getUserId();

		sapEmployeeCacheModel.middleName = getMiddleName();

		String middleName = sapEmployeeCacheModel.middleName;

		if ((middleName != null) && (middleName.length() == 0)) {
			sapEmployeeCacheModel.middleName = null;
		}

		sapEmployeeCacheModel.gender = getGender();

		String gender = sapEmployeeCacheModel.gender;

		if ((gender != null) && (gender.length() == 0)) {
			sapEmployeeCacheModel.gender = null;
		}

		sapEmployeeCacheModel.jobTitle = getJobTitle();

		String jobTitle = sapEmployeeCacheModel.jobTitle;

		if ((jobTitle != null) && (jobTitle.length() == 0)) {
			sapEmployeeCacheModel.jobTitle = null;
		}

		sapEmployeeCacheModel.employeeType = getEmployeeType();

		String employeeType = sapEmployeeCacheModel.employeeType;

		if ((employeeType != null) && (employeeType.length() == 0)) {
			sapEmployeeCacheModel.employeeType = null;
		}

		return sapEmployeeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{sapEmployeeId=");
		sb.append(getSapEmployeeId());
		sb.append(", employeeID=");
		sb.append(getEmployeeID());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", jobTitle=");
		sb.append(getJobTitle());
		sb.append(", employeeType=");
		sb.append(getEmployeeType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.SapEmployee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sapEmployeeId</column-name><column-value><![CDATA[");
		sb.append(getSapEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeID</column-name><column-value><![CDATA[");
		sb.append(getEmployeeID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>middleName</column-name><column-value><![CDATA[");
		sb.append(getMiddleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobTitle</column-name><column-value><![CDATA[");
		sb.append(getJobTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeType</column-name><column-value><![CDATA[");
		sb.append(getEmployeeType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SapEmployee.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SapEmployee.class
		};
	private long _sapEmployeeId;
	private long _employeeID;
	private long _originalEmployeeID;
	private boolean _setOriginalEmployeeID;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _middleName;
	private String _gender;
	private String _jobTitle;
	private String _employeeType;
	private long _columnBitmask;
	private SapEmployee _escapedModel;
}