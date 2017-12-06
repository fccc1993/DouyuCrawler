package com.fccc.crawler.listener;

import com.fccc.crawler.config.Config;
import com.fccc.crawler.thread.CrawlerThread;
import org.springframework.web.context.ServletContextAware;

import java.util.Set;

/**
 * Created by fccc on 2017/12/5.
 */
public class StartListener implements ServletContextAware {
    @Override
    public void setServletContext(javax.servlet.ServletContext servletContext) {
        Runnable runnable = new Runnable() {
            public void run() {
                start();
            }
        };

    }

    public void start(){
        if (!Config.loadSuccess) return;

        Set<String> nameSet = Config.ROOM_MAP.keySet();

        for (String name : nameSet) {
            new Thread(new CrawlerThread(name, Config.ROOM_MAP.get(name)), "Crawler-"+name).start();
        }
    }
}
