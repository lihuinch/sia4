package com.lihuinch.sia4.bean;

import com.lihuinch.sia4.annotation.CustomAnnotation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 使用自定义注解
 *
 * @author lihuinch
 * @date 2019/4/10 12:54
 */
@Data
@Component
@CustomAnnotation
public class BeanImplementsBaseInterfaceWithCustomQualifierAnnotations implements BaseInterface {
}
