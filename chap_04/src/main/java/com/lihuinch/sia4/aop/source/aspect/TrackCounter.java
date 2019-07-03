package com.lihuinch.sia4.aop.source.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lihuinch
 * @date 2019/7/3 23:03
 */
@Aspect
@Component
public class TrackCounter {

    public static Map<Integer, Integer> trackCounts = new HashMap<>();
    public static Map<Integer, Integer> trackCounts2 = new HashMap<>();

    // todo args(t)中的参数名只要和函数定义中t一样即可
    @Pointcut("execution(* com.lihuinch.sia4.aop.source.bean.BlankDisc.play(int)) && args(t) ")
    public void trackPlayed(int t) {

    }

    // todo trackPlayed(w)中的参数名只要和函数定义中w一样即可
    // 将参数带入
    @Before("trackPlayed(w) ")
    public void countTrackBefore(int w) {
        System.out.println("Before 播放歌曲" + w);

        trackCounts.putIfAbsent(w, 0);
        trackCounts.put(w, trackCounts.get(w) + 1);
    }

    // 意味着，只要目标方法有参数，所有通知都要有参数
    @AfterReturning("trackPlayed(w) ")
    public void countTrackReturn(int w) {
        System.out.println("AfterReturning 播放歌曲" + w);

        trackCounts2.putIfAbsent(w, 0);
        trackCounts2.put(w, trackCounts.get(w) + 1);
    }
}
