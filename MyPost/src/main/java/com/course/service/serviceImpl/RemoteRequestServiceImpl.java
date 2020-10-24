package com.course.service.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.course.service.RemoteRequetService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

/**
 * 发送http请求接口实现
 * @author 高越飞
 * @date 2020/9/1 13:53
 */
@Service
@Slf4j
public class RemoteRequestServiceImpl implements RemoteRequetService {

    /**
     * 发送post请求
     * @param url http请求地址
     * @param request 请求参数
     * @param returnType 返回数据类型
     * @param paramType json/null
     * @param <E>
     * @return
     */
    @Override
    public <E> E requestByPost(String url, Object request, Class<E> returnType, String paramType) {
        // 复杂构造函数的使用
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<?> formEntity =null;
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
//        requestFactory.setConnectTimeout(5000);// 设置超时
//        requestFactory.setReadTimeout(5000);
        // 利用复杂构造器可以实现超时设置，内部实际实现为 HttpClient
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        if(paramType !=null && paramType.equals("json")) {
            headers.setContentType(MediaType.parseMediaType(MediaType.APPLICATION_JSON_UTF8.toString()));
            formEntity = new HttpEntity<String>(JSON.toJSONString(request), headers);
        }else {
            formEntity=new HttpEntity<MultiValueMap<String, Object>>((LinkedMultiValueMap<String, Object>)request, headers);
        }
        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, formEntity, String.class);
        if (exchange.getStatusCode() == HttpStatus.OK) {
            log.info("请求成功：{}" ,url);
            E parseObject = JSONObject.parseObject(exchange.getBody(), returnType);
            return parseObject;
        } else {
            throw new RuntimeException("请求失败：" + exchange);
        }
    }

    /**
     * 以body方式传参的get请求
     * @param url 请求链接
     * @param request 请求参数
     * @param returnType 返回数据类型
     * @param <E>
     * @return
     */
    @Override
    public <E> E requestByGetWithBodyValue(String url, Object request, Class<E> returnType) {
        // 复杂构造函数的使用
        HttpHeaders headers = new HttpHeaders();
        HttpComponentsClientRestfulHttpRequestFactory requestFactory = new HttpComponentsClientRestfulHttpRequestFactory();
        // 利用复杂构造器可以实现超时设置，内部实际实现为 HttpClient
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        headers.setContentType(MediaType.parseMediaType(MediaType.APPLICATION_JSON_UTF8.toString()));
        HttpEntity<?> formEntity = new HttpEntity<String>(JSON.toJSONString(request), headers);
        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, formEntity, String.class);
        if (exchange.getStatusCode() == HttpStatus.OK) {
            log.info("请求成功：" + url);
            E parseObject = JSONObject.parseObject(exchange.getBody(), returnType);
            return parseObject;
        } else {
            throw new RuntimeException("请求失败：" + exchange);
        }
    }

    /**
     * 以pathValue方式传参的get请求
     * @param url 请求链接，参数站位
     * @param returnType 返回数据类型
     * @param paramMap 参数
     * @param <E>
     * @return
     */
    @Override
    public <E> E requestByGetWithPathValue(String url, Class<E> returnType, Map<String,Object> paramMap) {
        // 复杂构造函数的使用
        HttpHeaders headers = new HttpHeaders();
        HttpComponentsClientRestfulHttpRequestFactory requestFactory = new HttpComponentsClientRestfulHttpRequestFactory();
        // 利用复杂构造器可以实现超时设置，内部实际实现为 HttpClient
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        HttpEntity<?> formEntity=new HttpEntity<MultiValueMap<String, Object>>(null, headers);
        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, formEntity, String.class,paramMap);
        if (exchange.getStatusCode() == HttpStatus.OK) {
            log.info("请求成功：" + url + "," + paramMap.toString());
            E parseObject = JSONObject.parseObject(exchange.getBody(), returnType);
            return parseObject;
        } else {
            throw new RuntimeException("请求失败：" + exchange);
        }
    }


    private static final class HttpComponentsClientRestfulHttpRequestFactory extends HttpComponentsClientHttpRequestFactory {
        @Override
        protected HttpUriRequest createHttpUriRequest(HttpMethod httpMethod, URI uri) {
            if (httpMethod == HttpMethod.GET) {
                return new HttpGetRequestWithEntity(uri);
            }
            return super.createHttpUriRequest(httpMethod, uri);
        }
    }

    private static final class HttpGetRequestWithEntity extends HttpEntityEnclosingRequestBase {
        public HttpGetRequestWithEntity(final URI uri) {
            super.setURI(uri);
        }
        @Override
        public String getMethod() {
            return HttpMethod.GET.name();
        }
    }
}
