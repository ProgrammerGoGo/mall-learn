package com.example.mall.common;

/**
 * @Author programmerGoGo
 * @Description
 */
public enum ResultCode {
    SUCCESS(200, "成功"),
    ;
    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
