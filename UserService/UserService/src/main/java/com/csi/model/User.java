package com.csi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    private String userName;

    private String userEmailId;

    private String userAddress;

    private long userContactNumber;

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public long getUserContactNumber() {
        return userContactNumber;
    }

    public void setUserContactNumber(long userContactNumber) {
        this.userContactNumber = userContactNumber;
    }

    public User(int userId, String userName, String userEmailId, String userAddress, long userContactNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userEmailId = userEmailId;
        this.userAddress = userAddress;
        this.userContactNumber = userContactNumber;
    }

    public User() {
    }
}
