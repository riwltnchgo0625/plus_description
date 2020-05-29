package com.example.cardview_example;

public class Course {
    private String Title;
    private String Category;
    private String Description;
    private int Thumbnail;

    /*
    public Course() {
    }
    */

    public Course(String title, String category, String description,String description2,String description3,String description4, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Description = description2;
        Description = description3;
        Description = description4;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }
    public String getDescription2() {
        return Description;
    }
    public String getDescription3() {
        return Description;
    }
    public String getDescription4() {
        return Description;
    }


    public int getThumbnail() {
        return Thumbnail;
    }

    /*
    // 안 쓰는 거 같아서 일단 주석처리 해둠
    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
    */
}

