package com.rollenholt.pear.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * rollenholt
 * 2015/6/11.
 */
public class ErrorJson<T> {

    public final boolean ret = false;

    public final String errMsg;

    public final T data;

    @JsonCreator
    public ErrorJson(@JsonProperty("errMsg")String errMsg, @JsonProperty("data")T data) {
        this.errMsg = errMsg;
        this.data = data;
    }
}
