package com.rollenholt.pear.base;

import com.google.common.collect.Table;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * rollenholt
 * 2015/6/11.
 */
public abstract class TableStartegyContext<T extends Strategy> {

    protected abstract Table<Object, Object, T> getContext();

    public T fetch(Object key1, Object key2){
        Table<Object, Object, T> context = getContext();
        checkNotNull(key1);
        checkNotNull(key2);
        checkNotNull(context);

        T t = context.get(key1, key2);
        if(t == null){
            String errMsg = String.format("can not fetch strategy for input key pair: [%s, %s]", key1.toString(), key2.toString());
            throw new RuntimeException(errMsg);
        }
        return t;
    }
}
