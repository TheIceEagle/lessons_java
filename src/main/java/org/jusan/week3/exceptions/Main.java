package org.jusan.week3.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        KIMEPstudent kimepStudent = new KIMEPstudent("Almat","Almatov",18,"Economist");
        System.out.println(kimepStudent.toString());
        StudyInterface hardStudy = new HardStudyImplementation();
        StudyInterface easyStudy = new EasyStudyImplementation();
        kimepStudent.studyInterface = hardStudy;
        kimepStudent.studyInterface.study();
        kimepStudent.studyInterface = easyStudy;
        kimepStudent.studyInterface.study();
    }
}
