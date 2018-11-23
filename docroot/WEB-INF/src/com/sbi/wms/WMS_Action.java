package com.sbi.wms;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sbi.wms.model.Exclusif_WMS;
import com.sbi.wms.model.impl.Exclusif_WMSImpl;
import com.sbi.wms.service.Exclusif_WMSLocalServiceUtil;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

public class WMS_Action extends MVCPortlet{
	
	
	public void add(ActionRequest actionrequest, ActionResponse actionresponse) throws IOException, PortletException, SystemException{
		
		
		ThemeDisplay themeDisplay =(ThemeDisplay)actionrequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUserId();
		
		
		String name =ParamUtil.getString(actionrequest, "name");
		String city = ParamUtil.getString(actionrequest, "city");
		long   mobileno = ParamUtil.getLong(actionrequest, "mobileno");
		String email = ParamUtil.getString(actionrequest, "email");
	    String agree =ParamUtil.getString(actionrequest, "agree");
	    
	    long PrimarykeyId =CounterLocalServiceUtil.increment();
	    
	    Exclusif_WMS exclusif = null;		
	    exclusif = new Exclusif_WMSImpl();
	    
	    exclusif.setRecId(PrimarykeyId);
	    exclusif.setName(name);
	    exclusif.setCity(city);
	    exclusif.setMobileno(mobileno);
	    exclusif.setEmail(email);
	    exclusif.setAgree(agree);
	   
	    exclusif.setCompanyId(companyId);
	    exclusif.setGroupId(groupId);
	    exclusif.setUserId(userId);
	    exclusif.setCreateDate(new Date());
	    exclusif=Exclusif_WMSLocalServiceUtil.addExclusif_WMS(exclusif);	    
		
	}
	
	
	

}
