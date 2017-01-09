package com.taotao.common.service;

public interface Function<T, E> {
    // T返回值类型；E传入参数类型
    public T callback(E e);
    
}
