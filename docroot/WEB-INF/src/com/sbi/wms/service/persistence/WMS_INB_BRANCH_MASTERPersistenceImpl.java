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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException;
import com.sbi.wms.model.WMS_INB_BRANCH_MASTER;
import com.sbi.wms.model.impl.WMS_INB_BRANCH_MASTERImpl;
import com.sbi.wms.model.impl.WMS_INB_BRANCH_MASTERModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the w m s_ i n b_ b r a n c h_ m a s t e r service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Syed
 * @see WMS_INB_BRANCH_MASTERPersistence
 * @see WMS_INB_BRANCH_MASTERUtil
 * @generated
 */
public class WMS_INB_BRANCH_MASTERPersistenceImpl extends BasePersistenceImpl<WMS_INB_BRANCH_MASTER>
	implements WMS_INB_BRANCH_MASTERPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WMS_INB_BRANCH_MASTERUtil} to access the w m s_ i n b_ b r a n c h_ m a s t e r persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WMS_INB_BRANCH_MASTERImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
			WMS_INB_BRANCH_MASTERModelImpl.FINDER_CACHE_ENABLED,
			WMS_INB_BRANCH_MASTERImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
			WMS_INB_BRANCH_MASTERModelImpl.FINDER_CACHE_ENABLED,
			WMS_INB_BRANCH_MASTERImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
			WMS_INB_BRANCH_MASTERModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the w m s_ i n b_ b r a n c h_ m a s t e r in the entity cache if it is enabled.
	 *
	 * @param wms_inb_branch_master the w m s_ i n b_ b r a n c h_ m a s t e r
	 */
	public void cacheResult(WMS_INB_BRANCH_MASTER wms_inb_branch_master) {
		EntityCacheUtil.putResult(WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
			WMS_INB_BRANCH_MASTERImpl.class,
			wms_inb_branch_master.getPrimaryKey(), wms_inb_branch_master);

		wms_inb_branch_master.resetOriginalValues();
	}

	/**
	 * Caches the w m s_ i n b_ b r a n c h_ m a s t e rs in the entity cache if it is enabled.
	 *
	 * @param wms_inb_branch_masters the w m s_ i n b_ b r a n c h_ m a s t e rs
	 */
	public void cacheResult(List<WMS_INB_BRANCH_MASTER> wms_inb_branch_masters) {
		for (WMS_INB_BRANCH_MASTER wms_inb_branch_master : wms_inb_branch_masters) {
			if (EntityCacheUtil.getResult(
						WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
						WMS_INB_BRANCH_MASTERImpl.class,
						wms_inb_branch_master.getPrimaryKey()) == null) {
				cacheResult(wms_inb_branch_master);
			}
			else {
				wms_inb_branch_master.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all w m s_ i n b_ b r a n c h_ m a s t e rs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WMS_INB_BRANCH_MASTERImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WMS_INB_BRANCH_MASTERImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the w m s_ i n b_ b r a n c h_ m a s t e r.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WMS_INB_BRANCH_MASTER wms_inb_branch_master) {
		EntityCacheUtil.removeResult(WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
			WMS_INB_BRANCH_MASTERImpl.class,
			wms_inb_branch_master.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<WMS_INB_BRANCH_MASTER> wms_inb_branch_masters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (WMS_INB_BRANCH_MASTER wms_inb_branch_master : wms_inb_branch_masters) {
			EntityCacheUtil.removeResult(WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
				WMS_INB_BRANCH_MASTERImpl.class,
				wms_inb_branch_master.getPrimaryKey());
		}
	}

	/**
	 * Creates a new w m s_ i n b_ b r a n c h_ m a s t e r with the primary key. Does not add the w m s_ i n b_ b r a n c h_ m a s t e r to the database.
	 *
	 * @param REC_ID the primary key for the new w m s_ i n b_ b r a n c h_ m a s t e r
	 * @return the new w m s_ i n b_ b r a n c h_ m a s t e r
	 */
	public WMS_INB_BRANCH_MASTER create(long REC_ID) {
		WMS_INB_BRANCH_MASTER wms_inb_branch_master = new WMS_INB_BRANCH_MASTERImpl();

		wms_inb_branch_master.setNew(true);
		wms_inb_branch_master.setPrimaryKey(REC_ID);

		return wms_inb_branch_master;
	}

	/**
	 * Removes the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	 * @return the w m s_ i n b_ b r a n c h_ m a s t e r that was removed
	 * @throws com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WMS_INB_BRANCH_MASTER remove(long REC_ID)
		throws NoSuchWMS_INB_BRANCH_MASTERException, SystemException {
		return remove(Long.valueOf(REC_ID));
	}

	/**
	 * Removes the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	 * @return the w m s_ i n b_ b r a n c h_ m a s t e r that was removed
	 * @throws com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WMS_INB_BRANCH_MASTER remove(Serializable primaryKey)
		throws NoSuchWMS_INB_BRANCH_MASTERException, SystemException {
		Session session = null;

		try {
			session = openSession();

			WMS_INB_BRANCH_MASTER wms_inb_branch_master = (WMS_INB_BRANCH_MASTER)session.get(WMS_INB_BRANCH_MASTERImpl.class,
					primaryKey);

			if (wms_inb_branch_master == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWMS_INB_BRANCH_MASTERException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wms_inb_branch_master);
		}
		catch (NoSuchWMS_INB_BRANCH_MASTERException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected WMS_INB_BRANCH_MASTER removeImpl(
		WMS_INB_BRANCH_MASTER wms_inb_branch_master) throws SystemException {
		wms_inb_branch_master = toUnwrappedModel(wms_inb_branch_master);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, wms_inb_branch_master);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(wms_inb_branch_master);

		return wms_inb_branch_master;
	}

	@Override
	public WMS_INB_BRANCH_MASTER updateImpl(
		com.sbi.wms.model.WMS_INB_BRANCH_MASTER wms_inb_branch_master,
		boolean merge) throws SystemException {
		wms_inb_branch_master = toUnwrappedModel(wms_inb_branch_master);

		boolean isNew = wms_inb_branch_master.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, wms_inb_branch_master, merge);

			wms_inb_branch_master.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
			WMS_INB_BRANCH_MASTERImpl.class,
			wms_inb_branch_master.getPrimaryKey(), wms_inb_branch_master);

		return wms_inb_branch_master;
	}

	protected WMS_INB_BRANCH_MASTER toUnwrappedModel(
		WMS_INB_BRANCH_MASTER wms_inb_branch_master) {
		if (wms_inb_branch_master instanceof WMS_INB_BRANCH_MASTERImpl) {
			return wms_inb_branch_master;
		}

		WMS_INB_BRANCH_MASTERImpl wms_inb_branch_masterImpl = new WMS_INB_BRANCH_MASTERImpl();

		wms_inb_branch_masterImpl.setNew(wms_inb_branch_master.isNew());
		wms_inb_branch_masterImpl.setPrimaryKey(wms_inb_branch_master.getPrimaryKey());

		wms_inb_branch_masterImpl.setREC_ID(wms_inb_branch_master.getREC_ID());
		wms_inb_branch_masterImpl.setBRANCH_CODE(wms_inb_branch_master.getBRANCH_CODE());
		wms_inb_branch_masterImpl.setBRANCH_NAME(wms_inb_branch_master.getBRANCH_NAME());
		wms_inb_branch_masterImpl.setMAIL_ADDRESS1(wms_inb_branch_master.getMAIL_ADDRESS1());
		wms_inb_branch_masterImpl.setMAIL_ADDRESS2(wms_inb_branch_master.getMAIL_ADDRESS2());
		wms_inb_branch_masterImpl.setMAIL_ADDRESS3(wms_inb_branch_master.getMAIL_ADDRESS3());
		wms_inb_branch_masterImpl.setCITY(wms_inb_branch_master.getCITY());
		wms_inb_branch_masterImpl.setDISTRICT(wms_inb_branch_master.getDISTRICT());
		wms_inb_branch_masterImpl.setSTATE(wms_inb_branch_master.getSTATE());
		wms_inb_branch_masterImpl.setPIN(wms_inb_branch_master.getPIN());
		wms_inb_branch_masterImpl.setCIRCLE(wms_inb_branch_master.getCIRCLE());
		wms_inb_branch_masterImpl.setFOREX_TYPE(wms_inb_branch_master.getFOREX_TYPE());
		wms_inb_branch_masterImpl.setBRANCH_MANAGER(wms_inb_branch_master.getBRANCH_MANAGER());
		wms_inb_branch_masterImpl.setNO_OF_ATM(wms_inb_branch_master.getNO_OF_ATM());
		wms_inb_branch_masterImpl.setIFSC_CODE(wms_inb_branch_master.getIFSC_CODE());
		wms_inb_branch_masterImpl.setSTD_CODE(wms_inb_branch_master.getSTD_CODE());
		wms_inb_branch_masterImpl.setTELEPHONE(wms_inb_branch_master.getTELEPHONE());
		wms_inb_branch_masterImpl.setFAX_NO(wms_inb_branch_master.getFAX_NO());
		wms_inb_branch_masterImpl.setEMAIL_ID(wms_inb_branch_master.getEMAIL_ID());
		wms_inb_branch_masterImpl.setBUSSINESS_HOURS(wms_inb_branch_master.getBUSSINESS_HOURS());
		wms_inb_branch_masterImpl.setWEEKLY_HOLIDAY(wms_inb_branch_master.getWEEKLY_HOLIDAY());
		wms_inb_branch_masterImpl.setNON_BANKING_DAY(wms_inb_branch_master.getNON_BANKING_DAY());
		wms_inb_branch_masterImpl.setSUNDAY_BANKING(wms_inb_branch_master.getSUNDAY_BANKING());
		wms_inb_branch_masterImpl.setSUNDAY_BANKING_BUSSINESS(wms_inb_branch_master.getSUNDAY_BANKING_BUSSINESS());
		wms_inb_branch_masterImpl.setSWIFT_ENABLED(wms_inb_branch_master.getSWIFT_ENABLED());
		wms_inb_branch_masterImpl.setSWIFT_CODE(wms_inb_branch_master.getSWIFT_CODE());
		wms_inb_branch_masterImpl.setBRANCH_TYPE(wms_inb_branch_master.getBRANCH_TYPE());
		wms_inb_branch_masterImpl.setLOCKER(wms_inb_branch_master.getLOCKER());
		wms_inb_branch_masterImpl.setGOLD_COIN(wms_inb_branch_master.getGOLD_COIN());
		wms_inb_branch_masterImpl.setLAST_MOD_TIME(wms_inb_branch_master.getLAST_MOD_TIME());

		return wms_inb_branch_masterImpl;
	}

	/**
	 * Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	 * @return the w m s_ i n b_ b r a n c h_ m a s t e r
	 * @throws com.liferay.portal.NoSuchModelException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WMS_INB_BRANCH_MASTER findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key or throws a {@link com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException} if it could not be found.
	 *
	 * @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	 * @return the w m s_ i n b_ b r a n c h_ m a s t e r
	 * @throws com.sbi.wms.NoSuchWMS_INB_BRANCH_MASTERException if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WMS_INB_BRANCH_MASTER findByPrimaryKey(long REC_ID)
		throws NoSuchWMS_INB_BRANCH_MASTERException, SystemException {
		WMS_INB_BRANCH_MASTER wms_inb_branch_master = fetchByPrimaryKey(REC_ID);

		if (wms_inb_branch_master == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + REC_ID);
			}

			throw new NoSuchWMS_INB_BRANCH_MASTERException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				REC_ID);
		}

		return wms_inb_branch_master;
	}

	/**
	 * Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	 * @return the w m s_ i n b_ b r a n c h_ m a s t e r, or <code>null</code> if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WMS_INB_BRANCH_MASTER fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the w m s_ i n b_ b r a n c h_ m a s t e r with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param REC_ID the primary key of the w m s_ i n b_ b r a n c h_ m a s t e r
	 * @return the w m s_ i n b_ b r a n c h_ m a s t e r, or <code>null</code> if a w m s_ i n b_ b r a n c h_ m a s t e r with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public WMS_INB_BRANCH_MASTER fetchByPrimaryKey(long REC_ID)
		throws SystemException {
		WMS_INB_BRANCH_MASTER wms_inb_branch_master = (WMS_INB_BRANCH_MASTER)EntityCacheUtil.getResult(WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
				WMS_INB_BRANCH_MASTERImpl.class, REC_ID);

		if (wms_inb_branch_master == _nullWMS_INB_BRANCH_MASTER) {
			return null;
		}

		if (wms_inb_branch_master == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				wms_inb_branch_master = (WMS_INB_BRANCH_MASTER)session.get(WMS_INB_BRANCH_MASTERImpl.class,
						Long.valueOf(REC_ID));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (wms_inb_branch_master != null) {
					cacheResult(wms_inb_branch_master);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(WMS_INB_BRANCH_MASTERModelImpl.ENTITY_CACHE_ENABLED,
						WMS_INB_BRANCH_MASTERImpl.class, REC_ID,
						_nullWMS_INB_BRANCH_MASTER);
				}

				closeSession(session);
			}
		}

		return wms_inb_branch_master;
	}

	/**
	 * Returns all the w m s_ i n b_ b r a n c h_ m a s t e rs.
	 *
	 * @return the w m s_ i n b_ b r a n c h_ m a s t e rs
	 * @throws SystemException if a system exception occurred
	 */
	public List<WMS_INB_BRANCH_MASTER> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<WMS_INB_BRANCH_MASTER> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<WMS_INB_BRANCH_MASTER> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<WMS_INB_BRANCH_MASTER> list = (List<WMS_INB_BRANCH_MASTER>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WMS_INB_BRANCH_MASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WMS_INB_BRANCH_MASTER.concat(WMS_INB_BRANCH_MASTERModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<WMS_INB_BRANCH_MASTER>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<WMS_INB_BRANCH_MASTER>)QueryUtil.list(q,
							getDialect(), start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the w m s_ i n b_ b r a n c h_ m a s t e rs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (WMS_INB_BRANCH_MASTER wms_inb_branch_master : findAll()) {
			remove(wms_inb_branch_master);
		}
	}

	/**
	 * Returns the number of w m s_ i n b_ b r a n c h_ m a s t e rs.
	 *
	 * @return the number of w m s_ i n b_ b r a n c h_ m a s t e rs
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_WMS_INB_BRANCH_MASTER);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the w m s_ i n b_ b r a n c h_ m a s t e r persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.sbi.wms.model.WMS_INB_BRANCH_MASTER")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<WMS_INB_BRANCH_MASTER>> listenersList = new ArrayList<ModelListener<WMS_INB_BRANCH_MASTER>>();

				for (String listenerClassName : listenerClassNames) {
					Class<?> clazz = getClass();

					listenersList.add((ModelListener<WMS_INB_BRANCH_MASTER>)InstanceFactory.newInstance(
							clazz.getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(WMS_INB_BRANCH_MASTERImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = Exclusif_WMSPersistence.class)
	protected Exclusif_WMSPersistence exclusif_WMSPersistence;
	@BeanReference(type = WMS_INB_BRANCH_MASTERPersistence.class)
	protected WMS_INB_BRANCH_MASTERPersistence wms_inb_branch_masterPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_WMS_INB_BRANCH_MASTER = "SELECT wms_inb_branch_master FROM WMS_INB_BRANCH_MASTER wms_inb_branch_master";
	private static final String _SQL_COUNT_WMS_INB_BRANCH_MASTER = "SELECT COUNT(wms_inb_branch_master) FROM WMS_INB_BRANCH_MASTER wms_inb_branch_master";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wms_inb_branch_master.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WMS_INB_BRANCH_MASTER exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WMS_INB_BRANCH_MASTERPersistenceImpl.class);
	private static WMS_INB_BRANCH_MASTER _nullWMS_INB_BRANCH_MASTER = new WMS_INB_BRANCH_MASTERImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<WMS_INB_BRANCH_MASTER> toCacheModel() {
				return _nullWMS_INB_BRANCH_MASTERCacheModel;
			}
		};

	private static CacheModel<WMS_INB_BRANCH_MASTER> _nullWMS_INB_BRANCH_MASTERCacheModel =
		new CacheModel<WMS_INB_BRANCH_MASTER>() {
			public WMS_INB_BRANCH_MASTER toEntityModel() {
				return _nullWMS_INB_BRANCH_MASTER;
			}
		};
}