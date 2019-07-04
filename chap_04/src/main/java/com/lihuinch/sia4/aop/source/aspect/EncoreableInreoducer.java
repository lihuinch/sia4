package com.lihuinch.sia4.aop.source.aspect;

import com.lihuinch.sia4.aop.source.bean.DefaultEncoreable;
import com.lihuinch.sia4.aop.source.bean.Encoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author lihuinch
 * @date 2019/7/4 19:41
 */
@Component
@Aspect
public class EncoreableInreoducer {

    @DeclareParents(value = "com.lihuinch.sia4.aop.source.bean.Performance", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
