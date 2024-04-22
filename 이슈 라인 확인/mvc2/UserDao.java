package com.springapp.mvc2;

/**
 * User:
 * Date:
 * Time:
 */
public interface UserDao {
    public void setUserName(int id, String name);
    public void doQuery(String queryParam);
    public void doQuery2(String queryParam);
}
