package com.recoded.arrayadapter;

/**
 * Created by paytekht on 10-10-2017.
 */

public class ReportCard {
    private  String name;
    private int stage;
    private int dgree_java;
    private int dgree_math;
    private int dgree_english;

    public ReportCard(String name, int stage, int dgree_java, int dgree_math, int dgree_english) {
        this.name = name;
        this.stage = stage;
        this.dgree_java = dgree_java;
        this.dgree_math = dgree_math;
        this.dgree_english = dgree_english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getDgree_java() {
        return dgree_java;
    }

    public void setDgree_java(int dgree_java) {
        this.dgree_java = dgree_java;
    }

    public int getDgree_math() {
        return dgree_math;
    }

    public void setDgree_math(int dgree_math) {
        this.dgree_math = dgree_math;
    }

    public int getDgree_english() {
        return dgree_english;
    }

    public void setDgree_english(int dgree_english) {
        this.dgree_english = dgree_english;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "name='" + name + '\'' +
                ", stage=" + stage +
                ", dgree_java=" + dgree_java +
                ", dgree_math=" + dgree_math +
                ", dgree_english=" + dgree_english +
                '}';
    }
}
