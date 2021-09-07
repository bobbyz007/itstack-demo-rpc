package org.itstack.demo.rpc.network.msg;

/**
 * http://www.itstack.org
 * create by fuzhengwei on 2019/5/6
 */
public class Request {

    private String requestId;
    private Object param;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

}
