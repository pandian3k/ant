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

package com.sbi.wms.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link WMS_INB_BRANCH_MASTERService}.
 * </p>
 *
 * @author    Syed
 * @see       WMS_INB_BRANCH_MASTERService
 * @generated
 */
public class WMS_INB_BRANCH_MASTERServiceWrapper
	implements WMS_INB_BRANCH_MASTERService,
		ServiceWrapper<WMS_INB_BRANCH_MASTERService> {
	public WMS_INB_BRANCH_MASTERServiceWrapper(
		WMS_INB_BRANCH_MASTERService wms_inb_branch_masterService) {
		_wms_inb_branch_masterService = wms_inb_branch_masterService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _wms_inb_branch_masterService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wms_inb_branch_masterService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _wms_inb_branch_masterService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public WMS_INB_BRANCH_MASTERService getWrappedWMS_INB_BRANCH_MASTERService() {
		return _wms_inb_branch_masterService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedWMS_INB_BRANCH_MASTERService(
		WMS_INB_BRANCH_MASTERService wms_inb_branch_masterService) {
		_wms_inb_branch_masterService = wms_inb_branch_masterService;
	}

	public WMS_INB_BRANCH_MASTERService getWrappedService() {
		return _wms_inb_branch_masterService;
	}

	public void setWrappedService(
		WMS_INB_BRANCH_MASTERService wms_inb_branch_masterService) {
		_wms_inb_branch_masterService = wms_inb_branch_masterService;
	}

	private WMS_INB_BRANCH_MASTERService _wms_inb_branch_masterService;
}