package com.radness.demo.di.ui;

import com.radness.demo.di.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;

public class GridExamConsole implements ExamConsole {

    private Exam exam;

    public GridExamConsole() {
    }

    public GridExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.println("| total | avg   |");
        System.out.printf("| %3d   | %3.2f |\n", exam.sum(), exam.avg());
    }

    @Autowired
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
