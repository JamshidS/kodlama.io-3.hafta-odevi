package odev3.business;

import odev3.core.logging.MainLogger;
import odev3.dataAccess.InstructorDao;
import odev3.entities.Instructor;

public class InstructorManager {

    InstructorDao instructorDao;
    MainLogger[] loggers;

    public InstructorManager(InstructorDao instructorDao,MainLogger[] loggers){
        this.instructorDao=instructorDao;
        this.loggers=loggers;
    }
    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(MainLogger logger:loggers){
            logger.log(instructor.getInstructorName());
        }
    }
}
