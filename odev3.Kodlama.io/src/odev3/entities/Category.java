package odev3.entities;

public class Category {
    public Category(String categoryName,int desk){
        this.desk=desk;
        this.categoryName=categoryName;
    }
    private String categoryName;
    private int desk;


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
