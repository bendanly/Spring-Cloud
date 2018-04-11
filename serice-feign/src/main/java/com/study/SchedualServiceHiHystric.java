package com.study;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by liyang on 2017/11/2.
 */
@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
