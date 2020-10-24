package com.course.controller;

import com.course.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 屈青松
 * @date 2020/9/9 18:21
 */

@RestController
@Api(value = "/", description = "这是我全部的post请求")
public class MyPostMethodController {
    //这个变量用来装我们的cookies信息
    private static Cookie cookie;
    //模拟场景：用户登录成功获取到cookies,然后访问其他接口获取到列表

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public Map getmap(@RequestBody Map body){
        return body;
    }
    /**
     * 模拟用户登录场景
     * @param response
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功登录后获取cookies", httpMethod = "POST")
    public String login(HttpServletResponse response, @RequestParam(value = "username", required = true) String userName,
                        // @RequestParam(value = "username1",required = true)String userName,
                        // @RequestParam传递的参数格式是param格式
                        // username1和前端传递的参数一致，
                        //String userName,可以和前端不一致
                        @RequestParam(value = "password", required = true) String password) {
        if (userName.equals("zhangshan") && password.equals("111111")) {
            cookie = new Cookie("login", "true");
            response.addCookie(cookie);
            return "恭喜你登录成功";
        } else {
            return "用户名或密码错误";

        }
    }

    @RequestMapping(value = "/test/opengate1",method = RequestMethod.POST)
    public Map<String,String> opengate1(@RequestParam(value = "id",required = true) Integer id,@RequestBody String token){
        Map<String,String> opengatemap1=new LinkedHashMap<>();
        String gatestatus ="开启指令已发出,远程设备正在开启中";
        int offset=1;
//        gateWriteService.writeHoldingRegister(gateHost,gatePort,1,offset-1, opengate1, DataType.TWO_BYTE_INT_SIGNED);
        opengatemap1.put("gatestatus",gatestatus);
        System.out.println(opengatemap1.toString());
        return opengatemap1;
    }
    /**
     * 携带cookie的指定用户获取用户列表信息
     * @param str
     * @return
     */
    @RequestMapping(value = "/getUserListstring",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public String getUserString(@RequestBody String str){
//必须写上HttpServletRequest reques，或者cookie 值无法带上cookie值  @RequestBody需要传递的参数格式应该是json格式
        System.out.println(str);
        return str;
    }


    /**
         * 携带cookie的指定用户获取用户列表信息
         * @param userList
         * @return
         */
        @RequestMapping(value = "/getUserListmessage",method = RequestMethod.POST)
        @ApiOperation(value = "获取用户列表", httpMethod = "POST")
        public List<User> getUserListMessage(@RequestBody List<User> userList){
//必须写上HttpServletRequest reques，或者cookie 值无法带上cookie值  @RequestBody需要传递的参数格式应该是json格式
            System.out.println(userList.toString());
            return userList;
        }

    /**
     * 携带cookie的指定用户获取用户列表信息
     * @param user
     * @return
     */
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public User getUserListUser(@RequestBody User user){
//必须写上HttpServletRequest reques，或者cookie 值无法带上cookie值  @RequestBody需要传递的参数格式应该是json格式
        System.out.println(user.getAge());
        return user;
    }


    /**
     * 携带cookie的指定用户获取用户列表信息
     * @param httpServletRequest
     * @param user
     * @return
     */
    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public String getUserList(HttpServletRequest httpServletRequest,@RequestBody User user){
//必须写上HttpServletRequest reques，或者cookie 值无法带上cookie值  @RequestBody需要传递的参数格式应该是json格式

        //获取cookies
        User user1 = new User();
        Cookie[] cookies = httpServletRequest.getCookies();//获取cookie值
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login") && cookie.getValue().equals("true") &&
                    user1.getName().equals("zhangshan") && user1.getPassword().equals("111111")) {

                user1.setUsername("lisi");
                user1.setAge(18);

                return user1.toString();
            }

        }

        return "参数不合法";

    }
}
