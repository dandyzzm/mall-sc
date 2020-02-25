package com.dandy.mall.model;

import java.util.Date;

public class Syslog {
    private Integer id;

    private Integer userId;

    private String userInfo;

    private String targetFileName;

    private String url;

    private String requestUrl;

    private String requestUri;

    private String localAddr;

    private String localName;

    private String remoteAddr;

    private String remoteHost;

    private Integer remotePort;

    private Date createTime;

    private Date updateTime;

    public Syslog(Integer id, Integer userId, String userInfo, String targetFileName, String url, String requestUrl, String requestUri, String localAddr, String localName, String remoteAddr, String remoteHost, Integer remotePort, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.userInfo = userInfo;
        this.targetFileName = targetFileName;
        this.url = url;
        this.requestUrl = requestUrl;
        this.requestUri = requestUri;
        this.localAddr = localAddr;
        this.localName = localName;
        this.remoteAddr = remoteAddr;
        this.remoteHost = remoteHost;
        this.remotePort = remotePort;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Syslog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    public String getTargetFileName() {
        return targetFileName;
    }

    public void setTargetFileName(String targetFileName) {
        this.targetFileName = targetFileName == null ? null : targetFileName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri == null ? null : requestUri.trim();
    }

    public String getLocalAddr() {
        return localAddr;
    }

    public void setLocalAddr(String localAddr) {
        this.localAddr = localAddr == null ? null : localAddr.trim();
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName == null ? null : localName.trim();
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr == null ? null : remoteAddr.trim();
    }

    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost == null ? null : remoteHost.trim();
    }

    public Integer getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(Integer remotePort) {
        this.remotePort = remotePort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}