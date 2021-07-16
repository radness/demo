package com.radness.demo.aop;

import com.radness.demo.di.entity.Exam;
import com.radness.demo.di.entity.ExamImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AopProgram {
    public static void main(String[] args) {

        Exam exam = new ExamImpl(1,1,1,1);

        Exam proxy = (Exam) Proxy.newProxyInstance(ExamImpl.class.getClassLoader(), new Class[]{Exam.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        long start = System.currentTimeMillis();

                        Object result = method.invoke(exam, args);

                        long end = System.currentTimeMillis();
                        String message = (end - start) + "ms 시간이 걸렸습니다.";
                        System.out.println(message);

                        return result;
                    }
                });

        System.out.printf("total is %d\n", proxy.sum());
    }
}
