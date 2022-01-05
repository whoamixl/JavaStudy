package com.whoami.springcloud.controller;


import com.whoami.springcloud.pojo.Dept;
import com.whoami.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//提供restFul服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //获取信息,得到微服务的信息
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }


    //注册进来的微服务- 获取一些信息
    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的信息
        List<String> services = discoveryClient.getServices();
        System.out.println("services:"+services);

        //获取具体某个微服务的信息，通过微服务id，也就是微服务的名字   查看getInstances函数参数
        List<ServiceInstance> instances = discoveryClient.getInstances("springcloud-provider-dept");
        for (ServiceInstance instance : instances) {

            System.out.println(instance.getHost()+"\t"+instance.getServiceId()+"\t"+instance.getPort()+"\t"+instance.getPort());
        }

        return this.discoveryClient;
    }
}
