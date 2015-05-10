package com.example.sul.exam_shedules;




public class Exam {
    
    private String name;
    private String date;
    private  String time;
    private String classroom;
    //private String instructor;
    
    public Exam(String name, String date, String time, String classroom) {
        
        this.name = name;
        this.date = date;
        this.time = time;
        this.classroom = classroom;
        //this.instructor = instructor;
    }
    
    public String getName() {
        //returns name of exam
        return name;
    }
    
    public String getDate() {
        //returns date of exam
        return date;
    }
    
    public String getTime() {
        //gets time of exam
        return time;
    }
    
    public String getClassroom() {
        //returns classroom number
        return classroom;
    }
    
    /*public String getInstructor() {
     //returns instructor name
     return instructor;
     }*/
    
    
    
}

