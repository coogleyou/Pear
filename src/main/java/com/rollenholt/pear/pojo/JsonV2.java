package com.rollenholt.pear.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * rollenholt
 * 2015/6/11.
 */
public class JsonV2<T> implements Serializable{

    public final int code;

    public final String msg;

    public final T data;

    @JsonCreator
    public JsonV2(@JsonProperty("code")int code, @JsonProperty("msg")String msg, @JsonProperty("data")T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
