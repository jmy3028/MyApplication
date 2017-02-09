package com.example.student.myapplication.models;

import java.io.Serializable;

/**
 * Created by Student on 2017-02-08.
 */

public class Account implements Serializable {

    private String mAccountId;
    private String mAccountPassword;
    private String mAccountBalance;

    public Account(String mAccountId, String mAccountPassword, String mAccountBalance) {
        this.mAccountId = mAccountId;
        this.mAccountPassword = mAccountPassword;
        this.mAccountBalance = mAccountBalance;
    }

    public String getmAccountId() {
        return mAccountId;
    }

    public void setmAccountId(String mAccountId) {
        this.mAccountId = mAccountId;
    }

    public String getmAccountPassword() {
        return mAccountPassword;
    }

    public void setmAccountPassword(String mAccountPassword) {
        this.mAccountPassword = mAccountPassword;
    }

    public String getmAccountBalance() {
        return mAccountBalance;
    }

    public void setmAccountBalance(String mAccountBalance) {
        this.mAccountBalance = mAccountBalance;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Account{");
        sb.append("mAccountId='").append(mAccountId).append('\'');
        sb.append(", mAccountPassword='").append(mAccountPassword).append('\'');
        sb.append(", mAccountBalance='").append(mAccountBalance).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
