package com.rollenholt.pear.base;

import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * rollenholt
 * 2015/6/11.
 */
public abstract class StrategyContext<T extends Strategy> {

    protected abstract Map<Object, T> getContext();

    public T fetch(Object key){
        Map<Object, T> context = getContext();
        checkNotNull(key);
        checkNotNull(context);

        T t = context.get(key);
        if(t == null){
            throw new RuntimeException("can not fetch startegy for input key: " + key.toString());
        }
        return t;
    }

}
