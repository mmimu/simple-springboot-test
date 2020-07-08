package com.mimu.springboot.springboottest2.controller;


import com.alibaba.fastjson.JSONObject;
import com.mimu.simple.comn.http.SimpleHttpClient;
import com.mimu.springboot.springboottest2.model.SchoolSchoolInfo;
import com.mimu.springboot.springboottest2.request.RpcRequest;
import com.mimu.springboot.springboottest2.service.SkyWalkingTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkyWalkingTestController {

    private SkyWalkingTestService skyWalkingTestService;

    @Autowired
    public void setSkyWalkingTestService(SkyWalkingTestService skyWalkingTestService) {
        this.skyWalkingTestService = skyWalkingTestService;
    }

    @RequestMapping(value = "/rpc1/info.do")
    public String getRpc1Info(RpcRequest request) {
        try {
            String url = "http://localhost:9092/rpc4/info.do?serial=%s";
            String s = SimpleHttpClient.get(String.format(url, request.getSerial()));
            return s;
        } catch (Exception e) {
            return "";
        }
    }


    @RequestMapping(value = "/rpc2/info.do")
    public String getRpc2Info(RpcRequest request) {
        try {
            String url = "http://localhost:9093/rpc4/info.do?serial=%s";
            String s = SimpleHttpClient.get(String.format(url, request.getSerial()));
            return s;
        } catch (Exception e) {
            return "";
        }
    }

    @RequestMapping(value = "/rpc3/info.do")
    public String getRpc3Info(RpcRequest request) {
        try {
            String url = "http://localhost:9093/rpc4/info.do?serial=%s";
            String s = SimpleHttpClient.get(String.format(url, request.getSerial()));
            return s;
        } catch (Exception e) {
            return "";
        }
    }

    @RequestMapping(value = "/rpc4/info.do")
    public String getRpc4Info(RpcRequest request) {
        try {
            SchoolSchoolInfo schoolInfo = skyWalkingTestService.getSchoolInfo(request.getSerial());
            return JSONObject.toJSONString(schoolInfo);
        } catch (Exception e) {
            return "";
        }
    }
}
