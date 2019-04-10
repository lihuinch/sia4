package com.lihuinch.sia4.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 什么都不加，默认qualifier就是bean的类名首字母小写
 *
 * @author lihuinch
 * @date 2019/4/10 7:28
 */
@Data
@Component
public class BeanImplementsBaseInterface implements BaseInterface {
}
