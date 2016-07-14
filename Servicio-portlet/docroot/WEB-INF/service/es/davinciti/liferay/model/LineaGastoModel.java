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
 * The base model interface for the LineaGasto service. Represents a row in the &quot;CMES_LineaGasto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.davinciti.liferay.model.impl.LineaGastoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.davinciti.liferay.model.impl.LineaGastoImpl}.
 * </p>
 *
 * @author Cmes
 * @see LineaGasto
 * @see es.davinciti.liferay.model.impl.LineaGastoImpl
 * @see es.davinciti.liferay.model.impl.LineaGastoModelImpl
 * @generated
 */
public interface LineaGastoModel extends BaseModel<LineaGasto> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a linea gasto model instance should use the {@link LineaGasto} interface instead.
	 */

	/**
	 * Returns the primary key of this linea gasto.
	 *
	 * @return the primary key of this linea gasto
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this linea gasto.
	 *
	 * @param primaryKey the primary key of this linea gasto
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the lineagasto ID of this linea gasto.
	 *
	 * @return the lineagasto ID of this linea gasto
	 */
	public long getLineagastoId();

	/**
	 * Sets the lineagasto ID of this linea gasto.
	 *
	 * @param lineagastoId the lineagasto ID of this linea gasto
	 */
	public void setLineagastoId(long lineagastoId);

	/**
	 * Returns the date of this linea gasto.
	 *
	 * @return the date of this linea gasto
	 */
	@AutoEscape
	public String getDate();

	/**
	 * Sets the date of this linea gasto.
	 *
	 * @param date the date of this linea gasto
	 */
	public void setDate(String date);

	/**
	 * Returns the amount of this linea gasto.
	 *
	 * @return the amount of this linea gasto
	 */
	@AutoEscape
	public String getAmount();

	/**
	 * Sets the amount of this linea gasto.
	 *
	 * @param amount the amount of this linea gasto
	 */
	public void setAmount(String amount);

	/**
	 * Returns the document ID of this linea gasto.
	 *
	 * @return the document ID of this linea gasto
	 */
	@AutoEscape
	public String getDocumentId();

	/**
	 * Sets the document ID of this linea gasto.
	 *
	 * @param documentId the document ID of this linea gasto
	 */
	public void setDocumentId(String documentId);

	/**
	 * Returns the comments of this linea gasto.
	 *
	 * @return the comments of this linea gasto
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this linea gasto.
	 *
	 * @param comments the comments of this linea gasto
	 */
	public void setComments(String comments);

	/**
	 * Returns the status of this linea gasto.
	 *
	 * @return the status of this linea gasto
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this linea gasto.
	 *
	 * @param status the status of this linea gasto
	 */
	public void setStatus(String status);

	/**
	 * Returns the price of this linea gasto.
	 *
	 * @return the price of this linea gasto
	 */
	@AutoEscape
	public String getPrice();

	/**
	 * Sets the price of this linea gasto.
	 *
	 * @param price the price of this linea gasto
	 */
	public void setPrice(String price);

	/**
	 * Returns the quantity of this linea gasto.
	 *
	 * @return the quantity of this linea gasto
	 */
	@AutoEscape
	public String getQuantity();

	/**
	 * Sets the quantity of this linea gasto.
	 *
	 * @param quantity the quantity of this linea gasto
	 */
	public void setQuantity(String quantity);

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
	public int compareTo(es.davinciti.liferay.model.LineaGasto lineaGasto);

	@Override
	public int hashCode();

	@Override
	public CacheModel<es.davinciti.liferay.model.LineaGasto> toCacheModel();

	@Override
	public es.davinciti.liferay.model.LineaGasto toEscapedModel();

	@Override
	public es.davinciti.liferay.model.LineaGasto toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}