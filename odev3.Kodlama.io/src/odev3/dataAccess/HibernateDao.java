package odev3.dataAccess;

import odev3.entities.Category;
import odev3.entities.Course;
import odev3.entities.Instructor;

public class HibernateDao implements CategoryDao,CourseDao,InstructorDao{
    @Override
    public void add(Category category) {
        System.out.println("Category added to the database using Hibernate");
    }

    @Override
    public void add(Course course) {
        System.out.println("Course added to the database using Hibernate");
    }


    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added to the database using Hibernate");
    }
}
