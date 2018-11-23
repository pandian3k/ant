/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.sbi.wms.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Exclusif_WMS}.
 * </p>
 *
 * @author    Syed
 * @see       Exclusif_WMS
 * @generated
 */
public class Exclusif_WMSWrapper implements Exclusif_WMS,
	ModelWrapper<Exclusif_WMS> {
	public Exclusif_WMSWrapper(Exclusif_WMS exclusif_WMS) {
		_exclusif_WMS = exclusif_WMS;
	}

	public Class<?> getModelClass() {
		return Exclusif_WMS.class;
	}

	public String getModelClassName() {
		return Exclusif_WMS.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("recId", getRecId());
		attributes.put("name", getName());
		attributes.put("city", getCity());
		attributes.put("mobileno", getMobileno());
		attributes.put("email", getEmail());
		attributes.put("agree", getAgree());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long recId = (Long)attributes.get("recId");

		if (recId != null) {
			setRecId(recId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		Long mobileno = (Long)attributes.get("mobileno");

		if (mobileno != null) {
			setMobileno(mobileno);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String agree = (String)attributes.get("agree");

		if (agree != null) {
			setAgree(agree);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	/**
	* Returns the primary key of this exclusif_ w m s.
	*
	* @return the primary key of this exclusif_ w m s
	*/
	public long getPrimaryKey() {
		return _exclusif_WMS.getPrimaryKey();
	}

	/**
	* Sets the primary key of this exclusif_ w m s.
	*
	* @param primaryKey the primary key of this exclusif_ w m s
	*/
	public void setPrimaryKey(long primaryKey) {
		_exclusif_WMS.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rec ID of this exclusif_ w m s.
	*
	* @return the rec ID of this exclusif_ w m s
	*/
	public long getRecId() {
		return _exclusif_WMS.getRecId();
	}

	/**
	* Sets the rec ID of this exclusif_ w m s.
	*
	* @param recId the rec ID of this exclusif_ w m s
	*/
	public void setRecId(long recId) {
		_exclusif_WMS.setRecId(recId);
	}

	/**
	* Returns the name of this exclusif_ w m s.
	*
	* @return the name of this exclusif_ w m s
	*/
	public java.lang.String getName() {
		return _exclusif_WMS.getName();
	}

	/**
	* Sets the name of this exclusif_ w m s.
	*
	* @param name the name of this exclusif_ w m s
	*/
	public void setName(java.lang.String name) {
		_exclusif_WMS.setName(name);
	}

	/**
	* Returns the city of this exclusif_ w m s.
	*
	* @return the city of this exclusif_ w m s
	*/
	public java.lang.String getCity() {
		return _exclusif_WMS.getCity();
	}

	/**
	* Sets the city of this exclusif_ w m s.
	*
	* @param city the city of this exclusif_ w m s
	*/
	public void setCity(java.lang.String city) {
		_exclusif_WMS.setCity(city);
	}

	/**
	* Returns the mobileno of this exclusif_ w m s.
	*
	* @return the mobileno of this exclusif_ w m s
	*/
	public long getMobileno() {
		return _exclusif_WMS.getMobileno();
	}

	/**
	* Sets the mobileno of this exclusif_ w m s.
	*
	* @param mobileno the mobileno of this exclusif_ w m s
	*/
	public void setMobileno(long mobileno) {
		_exclusif_WMS.setMobileno(mobileno);
	}

	/**
	* Returns the email of this exclusif_ w m s.
	*
	* @return the email of this exclusif_ w m s
	*/
	public java.lang.String getEmail() {
		return _exclusif_WMS.getEmail();
	}

	/**
	* Sets the email of this exclusif_ w m s.
	*
	* @param email the email of this exclusif_ w m s
	*/
	public void setEmail(java.lang.String email) {
		_exclusif_WMS.setEmail(email);
	}

	/**
	* Returns the agree of this exclusif_ w m s.
	*
	* @return the agree of this exclusif_ w m s
	*/
	public java.lang.String getAgree() {
		return _exclusif_WMS.getAgree();
	}

	/**
	* Sets the agree of this exclusif_ w m s.
	*
	* @param agree the agree of this exclusif_ w m s
	*/
	public void setAgree(java.lang.String agree) {
		_exclusif_WMS.setAgree(agree);
	}

	/**
	* Returns the company ID of this exclusif_ w m s.
	*
	* @return the company ID of this exclusif_ w m s
	*/
	public long getCompanyId() {
		return _exclusif_WMS.getCompanyId();
	}

	/**
	* Sets the company ID of this exclusif_ w m s.
	*
	* @param companyId the company ID of this exclusif_ w m s
	*/
	public void setCompanyId(long companyId) {
		_exclusif_WMS.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this exclusif_ w m s.
	*
	* @return the group ID of this exclusif_ w m s
	*/
	public long getGroupId() {
		return _exclusif_WMS.getGroupId();
	}

	/**
	* Sets the group ID of this exclusif_ w m s.
	*
	* @param groupId the group ID of this exclusif_ w m s
	*/
	public void setGroupId(long groupId) {
		_exclusif_WMS.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this exclusif_ w m s.
	*
	* @return the user ID of this exclusif_ w m s
	*/
	public long getUserId() {
		return _exclusif_WMS.getUserId();
	}

	/**
	* Sets the user ID of this exclusif_ w m s.
	*
	* @param userId the user ID of this exclusif_ w m s
	*/
	public void setUserId(long userId) {
		_exclusif_WMS.setUserId(userId);
	}

	/**
	* Returns the user uuid of this exclusif_ w m s.
	*
	* @return the user uuid of this exclusif_ w m s
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _exclusif_WMS.getUserUuid();
	}

	/**
	* Sets the user uuid of this exclusif_ w m s.
	*
	* @param userUuid the user uuid of this exclusif_ w m s
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_exclusif_WMS.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this exclusif_ w m s.
	*
	* @return the create date of this exclusif_ w m s
	*/
	public java.util.Date getCreateDate() {
		return _exclusif_WMS.getCreateDate();
	}

	/**
	* Sets the create date of this exclusif_ w m s.
	*
	* @param createDate the create date of this exclusif_ w m s
	*/
	public void setCreateDate(java.util.Date createDate) {
		_exclusif_WMS.setCreateDate(createDate);
	}

	public boolean isNew() {
		return _exclusif_WMS.isNew();
	}

	public void setNew(boolean n) {
		_exclusif_WMS.setNew(n);
	}

	public boolean isCachedModel() {
		return _exclusif_WMS.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_exclusif_WMS.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _exclusif_WMS.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _exclusif_WMS.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_exclusif_WMS.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _exclusif_WMS.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_exclusif_WMS.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Exclusif_WMSWrapper((Exclusif_WMS)_exclusif_WMS.clone());
	}

	public int compareTo(com.sbi.wms.model.Exclusif_WMS exclusif_WMS) {
		return _exclusif_WMS.compareTo(exclusif_WMS);
	}

	@Override
	public int hashCode() {
		return _exclusif_WMS.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.sbi.wms.model.Exclusif_WMS> toCacheModel() {
		return _exclusif_WMS.toCacheModel();
	}

	public com.sbi.wms.model.Exclusif_WMS toEscapedModel() {
		return new Exclusif_WMSWrapper(_exclusif_WMS.toEscapedModel());
	}

	public com.sbi.wms.model.Exclusif_WMS toUnescapedModel() {
		return new Exclusif_WMSWrapper(_exclusif_WMS.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _exclusif_WMS.toString();
	}

	public java.lang.String toXmlString() {
		return _exclusif_WMS.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_exclusif_WMS.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Exclusif_WMSWrapper)) {
			return false;
		}

		Exclusif_WMSWrapper exclusif_WMSWrapper = (Exclusif_WMSWrapper)obj;

		if (Validator.equals(_exclusif_WMS, exclusif_WMSWrapper._exclusif_WMS)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Exclusif_WMS getWrappedExclusif_WMS() {
		return _exclusif_WMS;
	}

	public Exclusif_WMS getWrappedModel() {
		return _exclusif_WMS;
	}

	public void resetOriginalValues() {
		_exclusif_WMS.resetOriginalValues();
	}

	private Exclusif_WMS _exclusif_WMS;
}