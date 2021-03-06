package org.westos.aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 增强类
 * @author lwj
 * @date 2020/10/7 19:00
 */
@Aspect
@Component
public class UserServiceLogger {

    private static Logger logger = Logger.getLogger(UserServiceLogger.class);

    /**
     * 前置增强
     * @param joinPoint 连接点
     */
    @Before("execution(* org.westos.service.*.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName()
         + "方法，方法入参：" + Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 后置增强
     * @param joinPoint 连接点
     * @param result 返回值
     */
    @AfterReturning(value = "execution(* org.westos.service.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName()
                + "方法，方法返回值：" + result);
    }

    /**
     * 异常抛出增强
     * @param joinPoint 连接点
     * @param e 异常
     */
    @AfterThrowing(value = "execution(* org.westos.service.*.*(..))", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        logger.error("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName()
                + "方法，方法抛出异常：" + e);
    }

    /**
     * 最终增强
     * @param joinPoint 连接点
     */
    @After(value = "execution(* org.westos.service.*.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName()
                + "方法，方法执行结束。");
    }


    @Around(value = "execution(* org.westos.service.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName()
                + "方法，方法入参：" + Arrays.toString(joinPoint.getArgs()));
        try {
            Object result = joinPoint.proceed();
            logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName()
                    + "方法，方法返回值：" + result);
            return result;
        } catch (Throwable e) {
            logger.error("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName()
                    + "方法，方法抛出异常：" + e);
            throw e;
        } finally {
            logger.info("调用" + joinPoint.getTarget() + "的" + joinPoint.getSignature().getName()
                    + "方法，方法执行结束。");
        }
    }
}
