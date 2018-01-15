package com.pl.hengda.app.model;

public class ReturnMsg {
    private String code;
    private Object content;
    private String errorMsg;
    private Object extra;
    public ReturnMsg(){}
    public ReturnMsg(String code, String content, String errorMsg,String extra) {
        this.code = code;
        this.content = content;
        this.errorMsg = errorMsg;
        this.extra = extra;
    }

    public String getCode() {
        return code;
    }

    public Object getContent() {
        return content;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "ReturnMsg{" +
                "code='" + code + '\'' +
                ", content=" + content +
                ", errorMsg='" + errorMsg + '\'' +
                ", extra='" + extra + '\'' +
                '}';
    }
}
