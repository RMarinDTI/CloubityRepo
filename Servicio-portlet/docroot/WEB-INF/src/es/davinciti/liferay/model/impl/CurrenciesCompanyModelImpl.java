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

import es.davinciti.liferay.model.CurrenciesCompany;
import es.davinciti.liferay.model.CurrenciesCompanyModel;
import es.davinciti.liferay.model.CurrenciesCompanySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CurrenciesCompany service. Represents a row in the &quot;CMES_CurrenciesCompany&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.davinciti.liferay.model.CurrenciesCompanyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CurrenciesCompanyImpl}.
 * </p>
 *
 * @author Cmes
 * @see CurrenciesCompanyImpl
 * @see es.davinciti.liferay.model.CurrenciesCompany
 * @see es.davinciti.liferay.model.CurrenciesCompanyModel
 * @generated
 */
@JSON(strict = true)
public class CurrenciesCompanyModelImpl extends BaseModelImpl<CurrenciesCompany>
	implements CurrenciesCompanyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a currencies company model instance should use the {@link es.davinciti.liferay.model.CurrenciesCompany} interface instead.
	 */
	public static final String TABLE_NAME = "CMES_CurrenciesCompany";
	public static final Object[][] TABLE_COLUMNS = {
			{ "currenciescompanyId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "currenciesJson", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CMES_CurrenciesCompany (currenciescompanyId LONG not null primary key,companyId LONG,currenciesJson VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CMES_CurrenciesCompany";
	public static final String ORDER_BY_JPQL = " ORDER BY currenciesCompany.currenciescompanyId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CMES_CurrenciesCompany.currenciescompanyId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.es.davinciti.liferay.model.CurrenciesCompany"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.es.davinciti.liferay.model.CurrenciesCompany"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.es.davinciti.liferay.model.CurrenciesCompany"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long CURRENCIESCOMPANYID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CurrenciesCompany toModel(CurrenciesCompanySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CurrenciesCompany model = new CurrenciesCompanyImpl();

		model.setCurrenciescompanyId(soapModel.getCurrenciescompanyId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCurrenciesJson(soapModel.getCurrenciesJson());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CurrenciesCompany> toModels(
		CurrenciesCompanySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CurrenciesCompany> models = new ArrayList<CurrenciesCompany>(soapModels.length);

		for (CurrenciesCompanySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.es.davinciti.liferay.model.CurrenciesCompany"));

	public CurrenciesCompanyModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _currenciescompanyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCurrenciescompanyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _currenciescompanyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CurrenciesCompany.class;
	}

	@Override
	public String getModelClassName() {
		return CurrenciesCompany.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("currenciescompanyId", getCurrenciescompanyId());
		attributes.put("companyId", getCompanyId());
		attributes.put("currenciesJson", getCurrenciesJson());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long currenciescompanyId = (Long)attributes.get("currenciescompanyId");

		if (currenciescompanyId != null) {
			setCurrenciescompanyId(currenciescompanyId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String currenciesJson = (String)attributes.get("currenciesJson");

		if (currenciesJson != null) {
			setCurrenciesJson(currenciesJson);
		}
	}

	@JSON
	@Override
	public long getCurrenciescompanyId() {
		return _currenciescompanyId;
	}

	@Override
	public void setCurrenciescompanyId(long currenciescompanyId) {
		_currenciescompanyId = currenciescompanyId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public String getCurrenciesJson() {
		if (_currenciesJson == null) {
			return StringPool.BLANK;
		}
		else {
			return _currenciesJson;
		}
	}

	@Override
	public void setCurrenciesJson(String currenciesJson) {
		_currenciesJson = currenciesJson;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CurrenciesCompany.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CurrenciesCompany toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CurrenciesCompany)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CurrenciesCompanyImpl currenciesCompanyImpl = new CurrenciesCompanyImpl();

		currenciesCompanyImpl.setCurrenciescompanyId(getCurrenciescompanyId());
		currenciesCompanyImpl.setCompanyId(getCompanyId());
		currenciesCompanyImpl.setCurrenciesJson(getCurrenciesJson());

		currenciesCompanyImpl.resetOriginalValues();

		return currenciesCompanyImpl;
	}

	@Override
	public int compareTo(CurrenciesCompany currenciesCompany) {
		long primaryKey = currenciesCompany.getPrimaryKey();

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

		if (!(obj instanceof CurrenciesCompany)) {
			return false;
		}

		CurrenciesCompany currenciesCompany = (CurrenciesCompany)obj;

		long primaryKey = currenciesCompany.getPrimaryKey();

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
		CurrenciesCompanyModelImpl currenciesCompanyModelImpl = this;

		currenciesCompanyModelImpl._originalCompanyId = currenciesCompanyModelImpl._companyId;

		currenciesCompanyModelImpl._setOriginalCompanyId = false;

		currenciesCompanyModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CurrenciesCompany> toCacheModel() {
		CurrenciesCompanyCacheModel currenciesCompanyCacheModel = new CurrenciesCompanyCacheModel();

		currenciesCompanyCacheModel.currenciescompanyId = getCurrenciescompanyId();

		currenciesCompanyCacheModel.companyId = getCompanyId();

		currenciesCompanyCacheModel.currenciesJson = getCurrenciesJson();

		String currenciesJson = currenciesCompanyCacheModel.currenciesJson;

		if ((currenciesJson != null) && (currenciesJson.length() == 0)) {
			currenciesCompanyCacheModel.currenciesJson = null;
		}

		return currenciesCompanyCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{currenciescompanyId=");
		sb.append(getCurrenciescompanyId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", currenciesJson=");
		sb.append(getCurrenciesJson());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("es.davinciti.liferay.model.CurrenciesCompany");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>currenciescompanyId</column-name><column-value><![CDATA[");
		sb.append(getCurrenciescompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currenciesJson</column-name><column-value><![CDATA[");
		sb.append(getCurrenciesJson());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CurrenciesCompany.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CurrenciesCompany.class
		};
	private long _currenciescompanyId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private String _currenciesJson;
	private long _columnBitmask;
	private CurrenciesCompany _escapedModel;
}