package com.radness.demo.di.ui;

import com.radness.demo.di.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;

public class InlineExamConsole implements ExamConsole {

    private Exam exam;

    public InlineExamConsole() {
    }

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("total is %d and avg is %f\n", exam.sum(), exam.avg());
    }

    @Autowired
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }

}
