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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.sbi.wms.service.ClpSerializer;
import com.sbi.wms.service.Exclusif_WMSLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Syed
 */
public class Exclusif_WMSClp extends BaseModelImpl<Exclusif_WMS>
	implements Exclusif_WMS {
	public Exclusif_WMSClp() {
	}

	public Class<?> getModelClass() {
		return Exclusif_WMS.class;
	}

	public String getModelClassName() {
		return Exclusif_WMS.class.getName();
	}

	public long getPrimaryKey() {
		return _recId;
	}

	public void setPrimaryKey(long primaryKey) {
		setRecId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_recId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getRecId() {
		return _recId;
	}

	public void setRecId(long recId) {
		_recId = recId;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setRecId", long.class);

				method.invoke(_exclusif_WMSRemoteModel, recId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_exclusif_WMSRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setCity", String.class);

				method.invoke(_exclusif_WMSRemoteModel, city);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getMobileno() {
		return _mobileno;
	}

	public void setMobileno(long mobileno) {
		_mobileno = mobileno;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setMobileno", long.class);

				method.invoke(_exclusif_WMSRemoteModel, mobileno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_exclusif_WMSRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getAgree() {
		return _agree;
	}

	public void setAgree(String agree) {
		_agree = agree;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setAgree", String.class);

				method.invoke(_exclusif_WMSRemoteModel, agree);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_exclusif_WMSRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_exclusif_WMSRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_exclusif_WMSRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_exclusif_WMSRemoteModel != null) {
			try {
				Class<?> clazz = _exclusif_WMSRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_exclusif_WMSRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getExclusif_WMSRemoteModel() {
		return _exclusif_WMSRemoteModel;
	}

	public void setExclusif_WMSRemoteModel(BaseModel<?> exclusif_WMSRemoteModel) {
		_exclusif_WMSRemoteModel = exclusif_WMSRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _exclusif_WMSRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_exclusif_WMSRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			Exclusif_WMSLocalServiceUtil.addExclusif_WMS(this);
		}
		else {
			Exclusif_WMSLocalServiceUtil.updateExclusif_WMS(this);
		}
	}

	@Override
	public Exclusif_WMS toEscapedModel() {
		return (Exclusif_WMS)ProxyUtil.newProxyInstance(Exclusif_WMS.class.getClassLoader(),
			new Class[] { Exclusif_WMS.class }, new AutoEscapeBeanHandler(this));
	}

	public Exclusif_WMS toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		Exclusif_WMSClp clone = new Exclusif_WMSClp();

		clone.setRecId(getRecId());
		clone.setName(getName());
		clone.setCity(getCity());
		clone.setMobileno(getMobileno());
		clone.setEmail(getEmail());
		clone.setAgree(getAgree());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());

		return clone;
	}

	public int compareTo(Exclusif_WMS exclusif_WMS) {
		long primaryKey = exclusif_WMS.getPrimaryKey();

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

		if (!(obj instanceof Exclusif_WMSClp)) {
			return false;
		}

		Exclusif_WMSClp exclusif_WMS = (Exclusif_WMSClp)obj;

		long primaryKey = exclusif_WMS.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{recId=");
		sb.append(getRecId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", mobileno=");
		sb.append(getMobileno());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", agree=");
		sb.append(getAgree());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.sbi.wms.model.Exclusif_WMS");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>recId</column-name><column-value><![CDATA[");
		sb.append(getRecId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobileno</column-name><column-value><![CDATA[");
		sb.append(getMobileno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>agree</column-name><column-value><![CDATA[");
		sb.append(getAgree());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _recId;
	private String _name;
	private String _city;
	private long _mobileno;
	private String _email;
	private String _agree;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private BaseModel<?> _exclusif_WMSRemoteModel;
}