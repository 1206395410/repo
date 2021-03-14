package com.wjj.springcloud.share;


import com.wjj.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "springcloud-provider")
public interface UserShare {
    @GetMapping("/user")
    User getUser();
}
