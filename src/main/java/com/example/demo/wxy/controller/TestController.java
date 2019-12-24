package com.example.demo.wxy.controller;

import com.example.demo.common.Response;
import com.example.demo.wxy.service.IUserFanService;
import com.example.demo.wxy.service.IUserService;
import com.example.demo.wxy.service.IUserSignInService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author limeiqi
 * @date 2019/12/24
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private IUserFanService iUserFanService;

    @Autowired
    private IUserSignInService iUserSignInService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Response<List<Object>> getAutowiredList() throws ClassNotFoundException {

        Response<List<Object>> response = new Response<>();
        List<Object> list = Lists.newArrayList();

        response.setResult(list);

        return response;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.example.demo.wxy.controller.TestController");
        Field[] declaredFields = aClass.getDeclaredFields();
        List<Object> list = Lists.newArrayList();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.getName().contains("iUser")) {
                list.add(field.getType());
            }
        }
        list.forEach(service -> {
            Class<?> serviceClass = service.getClass();
            try {
                Method test = serviceClass.getMethod("test", Long.class);
                System.out.println(test.getReturnType().getSimpleName());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

        });

        System.out.println(list);
    }
}
