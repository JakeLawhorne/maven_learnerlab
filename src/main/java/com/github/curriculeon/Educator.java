package com.github.curriculeon;

public enum Educator implements Teacher{
    LEON(Instructors.getInstance().findById(1)),
    KRIS(Instructors.getInstance().findById(2)),
    DOLIO(Instructors.getInstance().findById(3));

    private final Instructor instructor;
    private double timeWorked;
    private Educator(Instructor instructor){
        this.instructor = instructor;
    }
    public double getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }
    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }
}
