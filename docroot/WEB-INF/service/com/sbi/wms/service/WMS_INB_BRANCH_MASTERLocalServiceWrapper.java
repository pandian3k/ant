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
 * This class is a wrapper for {@link WMS_INB_BRANCH_MASTERLocalService}.
 * </p>
 *
 * @author    Syed
 * @see       WMS_INB_BRANCH_MASTERLocalService
 * @generated
 */
public class WMS_INB_BRANCH_MASTERLocalServiceWrapper
	implements WMS_INB_BRANCH_MASTERLocalService,
		ServiceWrapper<WMS_INB_BRANCH_MASTERLocalService> {
	public WMS_INB_BRANCH_MASTERLocalServiceWrapper(
		WMS_INB_BRANCH_MASTERLocalService wms_inb_branch_masterLocalService) {
		_wms_inb_branch_masterLocalService = wms_inb_branch_masterLocalService;
	}

	/**
	* Adds the w m s_ i n b_ b r a n c h_ m a s t e r to the database. Also notifies the appropriate model listeners.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER addWMS_INB_BRANCH_MASTER(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.addWMS_INB_BRANCH_MASTER(wms_inb_branch_master);
	}

	/**
	* Creates a new w m s_ i n b_ b r a n c h_ m a s t e r with the primary key. Does not add the w m s_ i n b_ b r a n c h_ m a s t e r to the database.
	*
	* @param REC_ID the primary key for the new w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the new w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER createWMS_INB_BRANCH_MASTER(
		long REC_ID) {
		return _wms_inb_branch_masterLocalService.createWMS_INB_BRANCH_MASTER(REC_ID);
	}

	/**
	* Deletes the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was removed
	* @throws PortalException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER deleteWMS_INB_BRANCH_MASTER(
		long REC_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.deleteWMS_INB_BRANCH_MASTER(REC_ID);
	}

	/**
	* Deletes the w m s_ i n b_ b r a n c h_ m a s t e r from the database. Also notifies the appropriate model listeners.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER deleteWMS_INB_BRANCH_MASTER(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.deleteWMS_INB_BRANCH_MASTER(wms_inb_branch_master);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wms_inb_branch_masterLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER fetchWMS_INB_BRANCH_MASTER(
		long REC_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.fetchWMS_INB_BRANCH_MASTER(REC_ID);
	}

	/**
	* Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r
	* @throws PortalException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER getWMS_INB_BRANCH_MASTER(
		long REC_ID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.getWMS_INB_BRANCH_MASTER(REC_ID);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @param end the upper bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs (not inclusive)
	* @return the range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> getWMS_INB_BRANCH_MASTERs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.getWMS_INB_BRANCH_MASTERs(start,
			end);
	}

	/**
	* Returns the number of w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* @return the number of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	public int getWMS_INB_BRANCH_MASTERsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.getWMS_INB_BRANCH_MASTERsCount();
	}

	/**
	* Updates the w m s_ i n b_ b r a n c h_ m a s t e r in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER updateWMS_INB_BRANCH_MASTER(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.updateWMS_INB_BRANCH_MASTER(wms_inb_branch_master);
	}

	/**
	* Updates the w m s_ i n b_ b r a n c h_ m a s t e r in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	* @param merge whether to merge the w m s_ i n b_ b r a n c h_ m a s t e r with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.sbi.wms.model.WMS_INB_BRANCH_MASTER updateWMS_INB_BRANCH_MASTER(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wms_inb_branch_masterLocalService.updateWMS_INB_BRANCH_MASTER(wms_inb_branch_master,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _wms_inb_branch_masterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wms_inb_branch_masterLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _wms_inb_branch_masterLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public WMS_INB_BRANCH_MASTERLocalService getWrappedWMS_INB_BRANCH_MASTERLocalService() {
		return _wms_inb_branch_masterLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedWMS_INB_BRANCH_MASTERLocalService(
		WMS_INB_BRANCH_MASTERLocalService wms_inb_branch_masterLocalService) {
		_wms_inb_branch_masterLocalService = wms_inb_branch_masterLocalService;
	}

	public WMS_INB_BRANCH_MASTERLocalService getWrappedService() {
		return _wms_inb_branch_masterLocalService;
	}

	public void setWrappedService(
		WMS_INB_BRANCH_MASTERLocalService wms_inb_branch_masterLocalService) {
		_wms_inb_branch_masterLocalService = wms_inb_branch_masterLocalService;
	}

	private WMS_INB_BRANCH_MASTERLocalService _wms_inb_branch_masterLocalService;
}