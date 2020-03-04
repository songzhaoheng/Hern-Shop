package com.hern.listener;

import com.hern.entity.Banner;
import com.hern.service.IBannerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

/**
 * @program: hern-shop
 * @description: Banner监听启动
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-02-23 12:18
 **/
public class BannerListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		IBannerService bannerService = app.getBean(IBannerService.class);
		ServletContext application = arg0.getServletContext();
		List<Banner> bannerList = bannerService.findAllShowBanner();
		application.setAttribute("bannerList", bannerList);
	}

}
