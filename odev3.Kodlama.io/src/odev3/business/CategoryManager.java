package odev3.business;

import odev3.core.logging.MainLogger;
import odev3.dataAccess.CategoryDao;
import odev3.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private MainLogger[] loggers;
    private MainManager manager= new MainManager();

    public CategoryManager(CategoryDao categoryDao, MainLogger[] loggers){
        this.categoryDao=categoryDao;
        this.loggers=loggers;
    }

    public void add(Category category) throws Exception {
        manager.isThereCategories(category.getCategoryName());
        categoryDao.add(category);

        for(MainLogger logger: loggers){
            logger.log("Category Name: "+category.getCategoryName());

        }

    }
}
