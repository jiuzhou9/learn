package com.test.domain;

/**
 * Created by 01210368 on 2017/6/29.
 */
public class Result<W> {

    private static final long serialVersionUID = 1L;

    private boolean statu;
    private String code;
    private String msg;
    private W object;

    /**
     * @return the object
     */
    public W getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(W object) {
        this.object = object;
    }

    /**
     * @return the statu
     */
    public boolean isStatu() {
        return statu;
    }

    /**
     * @param statu the statu to set
     */
    public void setStatu(boolean statu) {
        this.statu = statu;
    }
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static <W> Result<W> buildSuccess() {
        return buildResult(true, null, "Success", null);
    }

    public static <W> Result<W> buildSuccess(W obj) {
        return buildResult(true, null, "Success", obj);
    }

    public static <W> Result<W> buildFailed(String msg) {
        return buildResult(false, null, msg, null);
    }

    public static <W> Result<W> buildFailed(String code, String msg) {
        return buildResult(false, code, msg, null);
    }

    public static <W> Result<W> buildResult(boolean statu, String code, String msg, W obj) {
        if(code ==  null){
            code="0";
        }
        Result<W> r = new Result<W>();
        r.setCode(code);
        r.setMsg(msg);
        r.setStatu(statu);
        r.setObject(obj);
        return r;
    }
    @Override
    public String toString(){
        return "{'statu':'"+this.isStatu()+"','code':'"+this.getCode()+"','msg':'"+this.getMsg()+"','object':'"+this.getObject()+"'}";
    }
}