package com.ibm.microservices.controller;

import com.ibm.microservices.bean.MinMaxValues;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CEController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CEController.class);
    @Autowired
    private MinMaxValues values;
    //@HystrixCommand(fallbackMethod = "getExchangeMultipleFallBack")
    @GetMapping("/currency-exchange/{from}/{to}")
    public int getExchangeMultiple(@PathVariable String from, @PathVariable String to) {
        int value = values.getMin();
        LOGGER.info("{}", value);
        return value;
        //throw new RuntimeException("Not available");
    }

    //public int getExchangeMultipleFallBack(@PathVariable String from, @PathVariable String to) {
     //   return 100;
   // }
}
