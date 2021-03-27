package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    NOBLES(001,"Nobles"), DOLIO(002,"Dolio"), YOUNGER(003,"Younger");

    private Instructor instructor;
    private double timeWorked;

    Educator(long id,String name){
        this.instructor = new Instructor(id,name);
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for(Learner i : learners){
            i.learn(numberOfHours/ learners.length);
        }
    }


}
