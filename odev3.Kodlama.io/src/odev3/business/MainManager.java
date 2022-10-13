package odev3.business;


import odev3.entities.Course;

import java.util.ArrayList;

public class MainManager {
    private Course course;
    ArrayList<String> courses = new ArrayList<>();
    ArrayList <String> categories = new ArrayList<>();


    //this function will check is there any previous course exists with same name or not.
    public void isThereCourse(String course) throws Exception {


        for(int i=0;i<courses.size();i++) {
            if (courses.get(i) == course) {
                throw new Exception("There is a course already with this name");
            }
        }
        courses.add(course);
    }
    //this function will check is there any previous category exists with same name or not.
    public void isThereCategories(String category) throws Exception {



        for(int i=0;i<categories.size();i++) {
            if (categories.get(i) == category) {
                throw new Exception("There is a category already with this name");
            }
        }
        categories.add(category);

    }

    public void priceControl(double coursePrice) throws Exception {
        if(coursePrice<0){
            throw new Exception("The course price can not be less than 0");
        }
    }

}

