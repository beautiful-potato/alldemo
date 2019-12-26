package com.channelsoft.demo.controller;

import com.channelsoft.demo.service.AddToBlackListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/loading")
public class LoadingController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private AddToBlackListService addToBlackListService;
    @RequestMapping("/showloading")
    public List<String> showloading(){
        List<String> list = new ArrayList();
        logger.info("发送查询");
        list = addToBlackListService.queryRepeatTelephone("2019-10-11 10:00:00", "2019-12-11 10:00:00");
        logger.info("查询到"+list);


        return  list;
    }

}
