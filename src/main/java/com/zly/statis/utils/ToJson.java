package com.zly.statis.utils;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ToJson {
    private static final ObjectMapper mapper = new ObjectMapper();



    /**
     * getJSON:(对象转换成JSON)
     * @param object
     * @return String
     */
    public static String getJson(Object object) {
        try {
            return mapper.writeValueAsString(object);
            } catch (IOException e) {
            e.printStackTrace();
            }
        return null;
        }

    /**
     * 传入一个json以及需要填充的对象，输出一个对象
     * @param json
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getBean(String json, Class<T> t) {
        try {
            return mapper.readValue(json, t);
            } catch (IOException e) {
            e.printStackTrace();
            }
        return null;
        }

}
