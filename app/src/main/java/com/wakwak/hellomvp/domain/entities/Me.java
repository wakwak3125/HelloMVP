package com.wakwak.hellomvp.domain.entities;

/**
 * Created by Ryo on 2016/01/17.
 */
public class Me {

    private String mFirstName;
    private String mLastName;
    private long mAge;

    public Me() {
    }

    public Me(String firstName, String lastName, long age) {
        mFirstName = firstName;
        mLastName = lastName;
        mAge = age;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public long getAge() {
        return mAge;
    }

    public void setAge(long age) {
        mAge = age;
    }
}
