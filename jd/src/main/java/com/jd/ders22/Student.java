package com.jd.ders22;

public class Student {
    String name;
    String lastName;
    String id;
    String depertmant;
    String gender;
    String birthDate;
    double average;
    int grade;
    String birthPlace; 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", lastName=").append(lastName);
        sb.append(", id=").append(id);
        sb.append(", depertmant=").append(depertmant);
        sb.append(", gender=").append(gender);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", average=").append(average);
        sb.append(", grade=").append(grade);
        sb.append(", birthPlace=").append(birthPlace);
        sb.append('}');
        return sb.toString();
    }


}
