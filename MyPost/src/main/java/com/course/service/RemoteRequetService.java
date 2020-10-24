package com.course.service;

import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;

import java.util.Map;

/**
 * 发送http请求接口
 * @author 高越飞
 * @date 2020/9/1 13:51
 */
public interface RemoteRequetService {

    public <E> E requestByPost(String url, Object request, Class<E> returnType, String paramType);

    public <E> E requestByGetWithBodyValue(String url, Object request, Class<E> returnType);

    public <E> E requestByGetWithPathValue(String url, Class<E> returnType, Map<String,Object> paramMap);
}
