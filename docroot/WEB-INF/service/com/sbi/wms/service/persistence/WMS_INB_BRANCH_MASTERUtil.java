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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.sbi.wms.model.WMS_INB_BRANCH_MASTER;

import java.util.List;

/**
 * The persistence utility for the w m s_ i n b_ b r a n c h_ m a s t e r service. This utility wraps {@link WMS_INB_BRANCH_MASTERPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Syed
 * @see WMS_INB_BRANCH_MASTERPersistence
 * @see WMS_INB_BRANCH_MASTERPersistenceImpl
 * @generated
 */
public class WMS_INB_BRANCH_MASTERUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(WMS_INB_BRANCH_MASTER wms_inb_branch_master) {
		getPersistence().clearCache(wms_inb_branch_master);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WMS_INB_BRANCH_MASTER> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WMS_INB_BRANCH_MASTER> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WMS_INB_BRANCH_MASTER> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static WMS_INB_BRANCH_MASTER update(
		WMS_INB_BRANCH_MASTER wms_inb_branch_master, boolean merge)
		throws SystemException {
		return getPersistence().update(wms_inb_branch_master, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static WMS_INB_BRANCH_MASTER update(
		WMS_INB_BRANCH_MASTER wms_inb_branch_master, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(wms_inb_branch_master, merge, serviceContext);
	}

	/**
	* Caches the w m s_ i n b_ b r a n c h_ m a s t e r in the entity cache if it is enabled.
	*
	* @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public static void cacheResult(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master) {
		getPersistence().cacheResult(wms_inb_branch_master);
	}

	/**
	* Caches the w m s_ i n b_ b r a n c h_ m a s t e rs in the entity cache if it is enabled.
	*
	* @param wms_inb_branch_masters the w m s_ i n b_ b r a n c h_ m a s t e rs
	*/
	public static void cacheResult(
		java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> wms_inb_branch_masters) {
		getPersistence().cacheResult(wms_inb_branch_masters);
	}

	/**
	* Creates a new w m s_ i n b_ b r a n c h_ m a s t e r with the primary key. Does not add the w m s_ i n b_ b r a n c h_ m a s t e r to the database.
	*
	* @param REC_ID the primary key for the new w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the new w m s_ i n b_ b r a n c h_ m a s t e r
	*/
	public static com.sbi.wms.model.WMS_INB_BRANCH_MASTER create(long REC_ID) {
		return getPersistence().create(REC_ID);
	}

	/**
	* Removes the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r that was removed
	* @throws com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sbi.wms.model.WMS_INB_BRANCH_MASTER remove(long REC_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException {
		return getPersistence().remove(REC_ID);
	}

	public static com.sbi.wms.model.WMS_INB_BRANCH_MASTER updateImpl(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(wms_inb_branch_master, merge);
	}

	/**
	* Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key or throws a {@link com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException} if it could not be found.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r
	* @throws com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sbi.wms.model.WMS_INB_BRANCH_MASTER findByPrimaryKey(
		long REC_ID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException {
		return getPersistence().findByPrimaryKey(REC_ID);
	}

	/**
	* Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	* @return the w m s_ i n b_ b r a n c h_ m a s t e r, or <code>null</code> if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.sbi.wms.model.WMS_INB_BRANCH_MASTER fetchByPrimaryKey(
		long REC_ID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(REC_ID);
	}

	/**
	* Returns all the w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* @return the w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @param end the upper bound of the range of w m s_ i n b_ b r a n c h_ m a s t e rs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.sbi.wms.model.WMS_INB_BRANCH_MASTER> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the w m s_ i n b_ b r a n c h_ m a s t e rs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of w m s_ i n b_ b r a n c h_ m a s t e rs.
	*
	* @return the number of w m s_ i n b_ b r a n c h_ m a s t e rs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static WMS_INB_BRANCH_MASTERPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (WMS_INB_BRANCH_MASTERPersistence)PortletBeanLocatorUtil.locate(com.sbi.wms.service.ClpSerializer.getServletContextName(),
					WMS_INB_BRANCH_MASTERPersistence.class.getName());

			ReferenceRegistry.registerReference(WMS_INB_BRANCH_MASTERUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(WMS_INB_BRANCH_MASTERPersistence persistence) {
	}

	private static WMS_INB_BRANCH_MASTERPersistence _persistence;
}