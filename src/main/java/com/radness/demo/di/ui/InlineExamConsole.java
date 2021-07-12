package com.radness.demo.di.ui;

import com.radness.demo.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

    private final Exam exam;

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("total is %d and avg is %f\n", exam.sum(), exam.avg());
    }
}
