package com.sg.foundations.day.excersise2;
/**
 *
 * @author Paul van Sittert
 */
public class Standard {
    private Student studentClass[] = new Student[8];

    public Standard() {
        studentClass[0] = new Student(1, "Alex", 90, 91, 92);
        studentClass[1] = new Student(2, "John", 88, 100, 75);
        studentClass[2] = new Student(3, "Anna", 79, 78, 70);
        studentClass[3] = new Student(4, "Richard", 97, 87, 86);
        studentClass[4] = new Student(5, "Elizabeth", 65, 76, 87);
        studentClass[5] = new Student(6, "Janes", 79, 98, 78);
        studentClass[6] = new Student(7, "Jon", 68, 78, 84);
        studentClass[7] = new Student(8, "Steven", 93, 74, 84);
    }
    
    public String displayClass(){
        String classList = "";
        int pos = 0;
        
        while (pos < 8){
            for(int i = 0; i<8; i++){
                if(studentClass[i].getRollNo() == pos+1){
                    classList += ("Roll no: " +studentClass[i].getRollNo() + " Name: " + studentClass[i].getStudName() + "\n");
                    pos++;
                    break;
                }
            }
        }
        
        
        return classList;
    }
    
    public String highestPercentage(){
        int highestPercent = 0;
        int studentPos = 0;
        
        for(int i = 0; i<8; i++){
            if(studentClass[i].getPercentage() > highestPercent){
                studentPos = i;
                highestPercent = studentClass[i].getPercentage();
            }
        }
        
        return ("Roll no: " + studentClass[studentPos].getRollNo() + " Name: " + studentClass[studentPos].getStudName());
    }
    
    public String highestMaths(){
        int highestMark = 0;
        int studentPos = 0;
        
        for(int i = 0; i<8; i++){
            if(studentClass[i].getMarksInMaths() > highestMark){
                studentPos = i;
                highestMark = studentClass[i].getMarksInMaths();
            }
        }
        
        return ("Roll no: " + studentClass[studentPos].getRollNo() + " Name: " + studentClass[studentPos].getStudName());
    }
}
