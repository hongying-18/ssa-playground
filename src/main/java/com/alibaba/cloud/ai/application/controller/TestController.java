package com.alibaba.cloud.ai.application.controller;

import com.alibaba.cloud.ai.application.entity.result.Result;

@RestController
@Tag(name = "Audio APIs")
@RequestMapping("/api/v1/")
public class TestController {

    @UserIp
    @GetMapping("/test")
    public Result<String> test() {
        return Result.success("hello world");
    }
}
