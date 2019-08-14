package com.example.demo.filters;


import com.netflix.zuul.ZuulFilter;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyPreFilters extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return RequestContext.getCurrentContext().getRequest().getRequestURI().contains("/get") ;
//		RequestContext.getCurrentContext().getRequest().getUserPrincipal().getName().equals("ADMIN");
//		return true;
	}

	@Override
	public Object run() throws ZuulException {
		log.info("=================================== PRE FILTER CALLED ===============================");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
//		return ZuulConstants.ZUUL_FILTER_PRE_PATH;
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
