package com.radness.demo.di;

import com.radness.demo.di.entity.Exam;
import com.radness.demo.di.entity.ExamImpl;
import com.radness.demo.di.ui.ExamConsole;
import com.radness.demo.di.ui.InlineExamConsole;

public class DiExample {
    public static void main(String[] args) {

        /* 스프링에게 지시하는 방법으로 코드를 변경
        Exam exam = new ExamImpl();
        // InlineExamConsole 객체가 exam을 구현하고 있다.
        ExamConsole console = new InlineExamConsole(exam);  // DI
        console.print();
         */
    }
}
