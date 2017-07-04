package com.open.micro.service.config.interceptors;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoggerInteceptor implements HandlerInterceptor{
	private static final Logger LOGGER = LoggerFactory.getLogger( LoggerInteceptor.class );
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOGGER.info( request.getRequestURI() +"?" +request.getQueryString() );
		TraceIdHelper.setTraceId( UUID.randomUUID().toString() );
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		TraceIdHelper.clear();
	}
	
	

}
