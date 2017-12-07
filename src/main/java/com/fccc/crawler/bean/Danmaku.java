package com.fccc.crawler.bean;

import java.util.Date;

/**
 * Created by Brucezz on 2016/01/03.
 * DouyuCrawler
 */
public class Danmaku {

    private String uid;//用户id
    private String snick;//昵称
    private String content;//内容
    private Date date;//发布时间
    private String rid;//房间号
    private int level;//用户等级

    public Danmaku(String uid, String snick, String content, String rid, int level) {
        this.uid = uid;
        this.snick = snick;
        this.content = content;
        this.date = new Date();
        this.rid = rid;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Danmaku{" +
                "uid=" + uid +
                ", snick='" + snick + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", rid=" + rid +
                ", level=" + level +
                '}';
    }


    public String getSnick() {
        return snick;
    }

    public void setSnick(String snick) {
        this.snick = snick;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }
}
