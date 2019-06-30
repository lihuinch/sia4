package com.lihuinch.sia4.chap3.spel.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lihuinch
 * @date 2019/6/30 17:44
 */
@Data
@Component
public class SpelBean {

    @Value("#{'SpelBean'}")
    private String value;
}
