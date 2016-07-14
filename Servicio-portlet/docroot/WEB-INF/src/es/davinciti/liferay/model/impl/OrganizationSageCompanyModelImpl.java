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
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import es.davinciti.liferay.model.OrganizationSageCompany;
import es.davinciti.liferay.model.OrganizationSageCompanyModel;
import es.davinciti.liferay.model.OrganizationSageCompanySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the OrganizationSageCompany service. Represents a row in the &quot;CMES_OrganizationSageCompany&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.davinciti.liferay.model.OrganizationSageCompanyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OrganizationSageCompanyImpl}.
 * </p>
 *
 * @author Cmes
 * @see OrganizationSageCompanyImpl
 * @see es.davinciti.liferay.model.OrganizationSageCompany
 * @see es.davinciti.liferay.model.OrganizationSageCompanyModel
 * @generated
 */
@JSON(strict = true)
public class OrganizationSageCompanyModelImpl extends BaseModelImpl<OrganizationSageCompany>
	implements OrganizationSageCompanyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a organization sage company model instance should use the {@link es.davinciti.liferay.model.OrganizationSageCompany} interface instead.
	 */
	public static final String TABLE_NAME = "CMES_OrganizationSageCompany";
	public static final Object[][] TABLE_COLUMNS = {
			{ "orgsagecompanyId", Types.BIGINT },
			{ "organizationId", Types.BIGINT },
			{ "sageCompanyId", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMES_OrganizationSageCompany (orgsagecompanyId LONG not null primary key,organizationId LONG,sageCompanyId VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMES_OrganizationSageCompany";
	public static final String ORDER_BY_JPQL = " ORDER BY organizationSageCompany.orgsagecompanyId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMES_OrganizationSageCompany.orgsagecompanyId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.es.davinciti.liferay.model.OrganizationSageCompany"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.es.davinciti.liferay.model.OrganizationSageCompany"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.es.davinciti.liferay.model.OrganizationSageCompany"),
			true);
	public static long ORGANIZATIONID_COLUMN_BITMASK = 1L;
	public static long ORGSAGECOMPANYID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static OrganizationSageCompany toModel(
		OrganizationSageCompanySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		OrganizationSageCompany model = new OrganizationSageCompanyImpl();

		model.setOrgsagecompanyId(soapModel.getOrgsagecompanyId());
		model.setOrganizationId(soapModel.getOrganizationId());
		model.setSageCompanyId(soapModel.getSageCompanyId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<OrganizationSageCompany> toModels(
		OrganizationSageCompanySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<OrganizationSageCompany> models = new ArrayList<OrganizationSageCompany>(soapModels.length);

		for (OrganizationSageCompanySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_CMES_NOTAS_ORGANIZATIONSAGECOMPANIES_NAME =
		"CMES_Notas_OrganizationSageCompanies";
	public static final Object[][] MAPPING_TABLE_CMES_NOTAS_ORGANIZATIONSAGECOMPANIES_COLUMNS =
		{
			{ "notagastoId", Types.BIGINT },
			{ "orgsagecompanyId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_CMES_NOTAS_ORGANIZATIONSAGECOMPANIES_SQL_CREATE =
		"create table CMES_Notas_OrganizationSageCompanies (notagastoId LONG not null,orgsagecompanyId LONG not null,primary key (notagastoId, orgsagecompanyId))";
	public static final boolean FINDER_CACHE_ENABLED_CMES_NOTAS_ORGANIZATIONSAGECOMPANIES =
		GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.CMES_Notas_OrganizationSageCompanies"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.es.davinciti.liferay.model.OrganizationSageCompany"));

	public OrganizationSageCompanyModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _orgsagecompanyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOrgsagecompanyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orgsagecompanyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OrganizationSageCompany.class;
	}

	@Override
	public String getModelClassName() {
		return OrganizationSageCompany.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orgsagecompanyId", getOrgsagecompanyId());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("sageCompanyId", getSageCompanyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long orgsagecompanyId = (Long)attributes.get("orgsagecompanyId");

		if (orgsagecompanyId != null) {
			setOrgsagecompanyId(orgsagecompanyId);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		String sageCompanyId = (String)attributes.get("sageCompanyId");

		if (sageCompanyId != null) {
			setSageCompanyId(sageCompanyId);
		}
	}

	@JSON
	@Override
	public long getOrgsagecompanyId() {
		return _orgsagecompanyId;
	}

	@Override
	public void setOrgsagecompanyId(long orgsagecompanyId) {
		_orgsagecompanyId = orgsagecompanyId;
	}

	@JSON
	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_columnBitmask |= ORGANIZATIONID_COLUMN_BITMASK;

		if (!_setOriginalOrganizationId) {
			_setOriginalOrganizationId = true;

			_originalOrganizationId = _organizationId;
		}

		_organizationId = organizationId;
	}

	public long getOriginalOrganizationId() {
		return _originalOrganizationId;
	}

	@JSON
	@Override
	public String getSageCompanyId() {
		if (_sageCompanyId == null) {
			return StringPool.BLANK;
		}
		else {
			return _sageCompanyId;
		}
	}

	@Override
	public void setSageCompanyId(String sageCompanyId) {
		_sageCompanyId = sageCompanyId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			OrganizationSageCompany.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OrganizationSageCompany toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (OrganizationSageCompany)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OrganizationSageCompanyImpl organizationSageCompanyImpl = new OrganizationSageCompanyImpl();

		organizationSageCompanyImpl.setOrgsagecompanyId(getOrgsagecompanyId());
		organizationSageCompanyImpl.setOrganizationId(getOrganizationId());
		organizationSageCompanyImpl.setSageCompanyId(getSageCompanyId());

		organizationSageCompanyImpl.resetOriginalValues();

		return organizationSageCompanyImpl;
	}

	@Override
	public int compareTo(OrganizationSageCompany organizationSageCompany) {
		long primaryKey = organizationSageCompany.getPrimaryKey();

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

		if (!(obj instanceof OrganizationSageCompany)) {
			return false;
		}

		OrganizationSageCompany organizationSageCompany = (OrganizationSageCompany)obj;

		long primaryKey = organizationSageCompany.getPrimaryKey();

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
		OrganizationSageCompanyModelImpl organizationSageCompanyModelImpl = this;

		organizationSageCompanyModelImpl._originalOrganizationId = organizationSageCompanyModelImpl._organizationId;

		organizationSageCompanyModelImpl._setOriginalOrganizationId = false;

		organizationSageCompanyModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<OrganizationSageCompany> toCacheModel() {
		OrganizationSageCompanyCacheModel organizationSageCompanyCacheModel = new OrganizationSageCompanyCacheModel();

		organizationSageCompanyCacheModel.orgsagecompanyId = getOrgsagecompanyId();

		organizationSageCompanyCacheModel.organizationId = getOrganizationId();

		organizationSageCompanyCacheModel.sageCompanyId = getSageCompanyId();

		String sageCompanyId = organizationSageCompanyCacheModel.sageCompanyId;

		if ((sageCompanyId != null) && (sageCompanyId.length() == 0)) {
			organizationSageCompanyCacheModel.sageCompanyId = null;
		}

		return organizationSageCompanyCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{orgsagecompanyId=");
		sb.append(getOrgsagecompanyId());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", sageCompanyId=");
		sb.append(getSageCompanyId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.OrganizationSageCompany");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>orgsagecompanyId</column-name><column-value><![CDATA[");
		sb.append(getOrgsagecompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sageCompanyId</column-name><column-value><![CDATA[");
		sb.append(getSageCompanyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = OrganizationSageCompany.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			OrganizationSageCompany.class
		};
	private long _orgsagecompanyId;
	private long _organizationId;
	private long _originalOrganizationId;
	private boolean _setOriginalOrganizationId;
	private String _sageCompanyId;
	private long _columnBitmask;
	private OrganizationSageCompany _escapedModel;
}