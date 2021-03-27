package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public ZipCodeWilmington(){

    }

    public Instructors getInstructors(){
        return instructors;
    }

    public Students getStudents(){
        return students;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours){
        Student[] studentArr = new Student[students.numberOfStudents()];
        for(int i=0;i<studentArr.length;i++){
            studentArr[i] = students.getStudent(i);
        }

        teacher.lecture(studentArr,numberOfHours);
    }

    public void hostLecture(long id, Double numberOfHours){
        Student[] studentArr = new Student[students.numberOfStudents()];
        for(int i=0;i<studentArr.length;i++){
            studentArr[i] = students.getStudent(i);
        }

        instructors.getInstructorByID(id).lecture(studentArr,numberOfHours);
    }

    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> studyMap = new HashMap<Student, Double>();

        for(int i=0;i< students.numberOfStudents();i++){
            studyMap.put(students.getStudent(i),students.getStudent(i).getTotalStudyTime());
        }

        return studyMap;
    }

}
