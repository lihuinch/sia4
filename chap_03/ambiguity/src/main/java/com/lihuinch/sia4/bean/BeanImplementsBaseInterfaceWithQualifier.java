package com.lihuinch.sia4.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 使用@Qualifier注解
 *
 * @author lihuinch
 * @date 2019/4/10 7:34
 */
@Data
@Component
@Qualifier("qualifier")
public class BeanImplementsBaseInterfaceWithQualifier implements BaseInteface {
}
