package com.skills.formationservice.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "auth-service")
public interface AuthServiceFeignClient {

}
