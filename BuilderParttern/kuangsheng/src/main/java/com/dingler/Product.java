package com.dingler;

/**
 * @Version 1.0
 * @Author:屈青松
 * @Date:2020/10/27
 * @Content:产品：房子
 */
public class Product {

    //地基
     String buildA ;
    //钢筋工程
     String buildB ;
    //铺电线
     String buildC ;
    //粉刷
     String buildD ;


    public String getBuildA() {
        return buildA;
    }

    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }

    public String getBuildB() {
        return buildB;
    }

    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }

    public String getBuildC() {
        return buildC;
    }

    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }

    public String getBuildD() {
        return buildD;
    }

    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }


    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                ", buildD='" + buildD + '\''+
                '}';
    }
}
