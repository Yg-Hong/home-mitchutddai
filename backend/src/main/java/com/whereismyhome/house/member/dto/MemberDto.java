package com.whereismyhome.house.member.dto;

import lombok.Builder;

public class MemberDto {

    private String userId;
    private String userName;
    private String userPassword;
    private String emailId;
    private String emailDomain;
    private String joinDate;

    public MemberDto() {}

    @Builder
    public MemberDto(String userId, String userName, String userPassword, String emailId, String emailDomain, String joinDate) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.emailId = emailId;
        this.emailDomain = emailDomain;
        this.joinDate = joinDate;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getEmailDomain() {
        return emailDomain;
    }
    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }
    public String getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }


}
