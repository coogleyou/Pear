package com.rollenholt.pear.pojo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * rollenholt
 * 2015/6/11.
 */
public class OkJson<T> implements Serializable{

    public final boolean ret = true;

    public final T data;

    @JsonCreator
    public OkJson(@JsonProperty("data") T data) {
        this.data = data;
    }
}
