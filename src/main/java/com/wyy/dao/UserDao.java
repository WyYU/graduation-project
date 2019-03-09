package com.wyy.dao;

/**
 * Created by dell on 2019/3/9 0009.
 */
public interface UserDao {
    public void add(String name ,String pwd);
    public void queryId(int id);
    public void queryName(String name);
    public void del(String name);
    public void updata(int id);
    public void joinTeam(int uid,int tid);
    public void exitTeam(int uid);

}
