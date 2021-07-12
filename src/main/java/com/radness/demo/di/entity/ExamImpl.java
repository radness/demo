package com.radness.demo.di.entity;

public class ExamImpl implements Exam {
    @Override
    public int sum() {
        return 0;
    }

    @Override
    public float avg() {
        return sum() / 4f;
    }
}
