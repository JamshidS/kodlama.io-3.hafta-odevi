package odev3;

import odev3.business.CategoryManager;
import odev3.business.CourseManager;
import odev3.core.logging.DataBaseLogger;
import odev3.core.logging.FileLogger;
import odev3.core.logging.MainLogger;
import odev3.dataAccess.HibernateDao;
import odev3.dataAccess.JdbcDao;
import odev3.entities.Category;
import odev3.entities.Course;

public class Main {

    public static void main(String[] args) throws Exception {

        Category category = new Category("Programing",1);

        Course course = new Course("Python","Engin Demiro",500);


        MainLogger[] loggers = {new DataBaseLogger()};
        CategoryManager categoryManager = new CategoryManager(new HibernateDao(),loggers);
        CourseManager courseManager = new CourseManager(new JdbcDao(),loggers);

        categoryManager.add(category);

        courseManager.add(course);




    }
}
