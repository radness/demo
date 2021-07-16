package com.radness.demo.aop.entity;

public class ExamImpl implements Exam {

    private int korean;
    private int english;
    private int math;
    private int compute;

    public ExamImpl() {
    }

    public ExamImpl(int korean, int english, int math, int compute) {
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.compute = compute;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getCompute() {
        return compute;
    }

    public void setCompute(int compute) {
        this.compute = compute;
    }

    @Override
    public int sum() {

        int result = korean + english + math + compute;

        return result;
    }

    @Override
    public float avg() {

        float result = sum() / 4.0f;

        return result;
    }

    @Override
    public String toString() {
        return "ExamImpl{" +
                "korean=" + korean +
                ", english=" + english +
                ", math=" + math +
                 ", compute=" + compute +
                '}';
    }

}
