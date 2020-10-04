package com.mysuni.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MySuniController {

    @CrossOrigin(origins = {"http://localhost:3000", "http://sagittar.com:3000"})
    @GetMapping("/test")
    public String test(){
        return "Hello World";
    }

    @CrossOrigin(origins = {"http://localhost:3000", "http://sagittar.com:3000"})
    @GetMapping("/testMap")
    public Map<String, String> testMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("test", "HelloWorld");
        return map;
    }

    @CrossOrigin(origins = {"http://localhost:3000", "http://sagittar.com:3000"})
    @PostMapping("/getPanoptoSeeking")
    public Map<String, Object> getPanoptoSeeking(String userId, String panoptoId){
        //TODO DB 연동 후 해당 동영상에 대한 마지막 재생 시간 가져오기
        //재생 이력이 없을 시 0 return
        
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("seeking_time", 100);
        return resultMap;
    }

    @CrossOrigin(origins = {"http://localhost:3000", "http://sagittar.com:3000"})
    @PostMapping("/setProgressTime")
    public Map<String, Object> setProgressTime(@RequestBody Map<String, Object> data) {
        //TODO DB 연동 후 해당 동영상의 progress time 을 update 한다

        System.out.println("//////////////////" + data.get("panoptoId").toString());
        System.out.println("//////////////////" + data.get("userId").toString());
        System.out.println("//////////////////" + data.get("type").toString());

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", "SUCCESS");

        return resultMap;
    }
}
