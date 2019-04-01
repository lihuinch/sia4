package com.lihuinch.sia4.conditional.bean;

import com.lihuinch.sia4.conditional.config.BeanCreateConditional;
import lombok.Data;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * 使用了@Conditional注解的bean
 *
 * @author lihuinch
 * @date 2019/4/1 21:36
 */
@Component
@Data
@Conditional(BeanCreateConditional.class)
public class ConditionalBean {
}
