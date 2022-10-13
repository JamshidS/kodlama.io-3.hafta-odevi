package odev3.business;

import odev3.core.logging.MainLogger;
import odev3.dataAccess.CourseDao;
import odev3.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private MainLogger[] loggers;
    private MainManager manager= new MainManager();

    public CourseManager(){

    }


    public CourseManager(CourseDao courseDao, MainLogger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
    }

    public void add(Course course) throws Exception {
        manager.isThereCourse(course.getCourseName());
        manager.priceControl(course.getCoursePrice());
        courseDao.add(course);
        for(MainLogger logger:loggers){
            logger.log("Course Name: "+course.getCourseName());
            logger.log("Course Price: "+ course.getCoursePrice());
        }
    }




}
