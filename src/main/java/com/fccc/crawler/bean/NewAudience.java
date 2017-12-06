package com.fccc.crawler.bean;

/**
 * Created by fccc on 2017/12/5.
 */

public class NewAudience {
    private int uid;//用户id
    private String snick;//昵称
    private int level;//
    private int rid;//房间号

    public NewAudience(int uid, String snick,  int level, int rid) {
        this.uid = uid;
        this.snick = snick;
        this.level = level;
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "NewAudience{" +
                "uid=" + uid +
                ", snick='" + snick + '\'' +
                ", level='" + level + '\'' +
                ", rid=" + rid +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSnick() {
        return snick;
    }

    public void setSnick(String snick) {
        this.snick = snick;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}
