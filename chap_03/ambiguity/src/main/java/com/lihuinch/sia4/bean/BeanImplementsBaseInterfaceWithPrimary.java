package com.lihuinch.sia4.bean;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 使用primary注解
 *
 * @author lihuinch
 * @date 2019/4/10 7:27
 */
@Data
@Component
@Primary
public class BeanImplementsBaseInterfaceWithPrimary implements BaseInteface {
}
