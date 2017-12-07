package com.fccc.crawler.db;


import com.fccc.crawler.bean.Danmaku;
import com.fccc.crawler.util.DBUtil;
import com.fccc.crawler.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brucezz on 2016/01/06.
 * DouyuCrawler
 */
public class DanmakuDao {

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS ta_danmaku(id INT PRIMARY KEY AUTO_INCREMENT,uid VARCHAR(12) NOT NULL,level INT NOT NULL,snick VARCHAR(64) NOT NULL,content VARCHAR(256) NOT NULL,date DATETIME NOT NULL,rid VARCHAR(10) NOT NULL);";

    private static final String SQL_INSERT_DANMAKU = "INSERT INTO ta_danmaku(uid,level,snick,content, date,rid) VALUES('%s', %d,'%s', '%s', '%s', '%s') ";

    public static void createTable() {
        DBUtil.execSQL(SQL_CREATE_TABLE);
    }

    /**
     * 保存弹幕数据到数据库
     */
    public static boolean saveDanmaku(List<Danmaku> danmakuList) {
        List<String> sqlList = new ArrayList<String>();
        for (Danmaku danmaku : danmakuList) {
            sqlList.add(String.format(
                    SQL_INSERT_DANMAKU,
                    danmaku.getUid(),
                    danmaku.getLevel(),
                    danmaku.getSnick(),
                    danmaku.getContent(),
                    DateUtil.datetime(danmaku.getDate()),
                    danmaku.getRid()
                    )
            );
        }
        return DBUtil.execSQL(sqlList);
    }

}
