package org.jusan.week3.exceptions;

public class KIMEPstudent extends Student{

    EatInterface eatInterface;
    StudyInterface studyInterface;
    String bachelor;

    public KIMEPstudent(String name, String surname,int age, String bachelor) {
        super(name,surname,age);
        this.bachelor = bachelor;
    }

    @Override
    public String toString() {
        return "KIMEPstudent{" +
                "name=" + super.name +
                ", surname=" + super.surname +
                ", age=" + super.age+
                ", bachelor='" + bachelor + '\'' +
                '}';
    }
}
