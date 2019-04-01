package com.lihuinch.sia4.conditional.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * bean创建的条件
 *
 * @author lihuinch
 * @date 2019/4/1 21:37
 */
public class BeanCreateConditional implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        return environment.acceptsProfiles("active");
    }
}
