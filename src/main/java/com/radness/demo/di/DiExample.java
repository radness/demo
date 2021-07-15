package com.radness.demo.di;

import com.radness.demo.di.ui.ExamConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DiExample {
    public static void main(String[] args) {

        /* 스프링에게 지시하는 방법으로 코드를 변경
        Exam exam = new ExamImpl();
        // InlineExamConsole 객체가 exam 을 구현하고 있다.
        // ExamConsole 객체가 ExamImpl 객체를 사용한다.
        // 결합하는 방식은 크게 2가지로 나누어 진다.
        // 1. 생성자를 통한 결합
        ExamConsole console = new InlineExamConsole(exam);  // DI
        // 2. setter 를 통한 결합
        ExamConsole console = new GridExamConsole();
        console.setExam();

        console.print();
         */

        /* src 폴더부터가 root directory
        지시서를 넘길 객체 생성
        ApplicationContext 는 인터페이스
        ApplicationContext 의 종류
        ClassPathXmlApplicationContext
        FileSystemXmlApplicationContext
        XmlWepApplicationContext
        AnnotationConfigApplicationContext
         */
        // ApplicationContext 생성하기
        // ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"):
        ApplicationContext context =
                new ClassPathXmlApplicationContext("setting.xml");

        // ExamConsole console = (ExamConsole) context.getBean("console");
        ExamConsole console = context.getBean(ExamConsole.class);
        console.print();
    }
}
