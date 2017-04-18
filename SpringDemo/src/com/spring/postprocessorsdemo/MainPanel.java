package com.spring.postprocessorsdemo;

import java.util.Objects;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MainPanel implements InitializingBean, DisposableBean {

	private String displayName;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		this.displayName = null;
		System.out.println("value setted back to null");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		if (Objects.nonNull(this.displayName)) {
			this.displayName = this.displayName.toUpperCase();
		}
		System.out.println("Display name is assgin : "+this.displayName);
	}

}
