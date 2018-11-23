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

package com.sbi.wms.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.sbi.wms.model.WMS_INB_BRANCH_MASTER;
import com.sbi.wms.service.WMS_INB_BRANCH_MASTERLocalServiceUtil;

/**
 * @author Syed
 * @generated
 */
public abstract class WMS_INB_BRANCH_MASTERActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public WMS_INB_BRANCH_MASTERActionableDynamicQuery()
		throws SystemException {
		setBaseLocalService(WMS_INB_BRANCH_MASTERLocalServiceUtil.getService());
		setClass(WMS_INB_BRANCH_MASTER.class);

		setClassLoader(com.sbi.wms.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("REC_ID");
	}
}