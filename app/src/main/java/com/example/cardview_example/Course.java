package com.example.cardview_example;

public class Course {
    private String Title;
    private String Category;
    private String Description;
    private String Description2;
    private int Thumbnail;
    private int Thumbnail2;


    /*
    public Course() {
    }
    */

    public Course(String title, String category, String description,String description2, int thumbnail, int thumbnail2) {
        Title = title;
        Category = category;
        Description = description;
        Description2 = description2;
        Thumbnail2 = thumbnail2;
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
        return Description2;
    }


    public int getThumbnail2() {
        return Thumbnail2;
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

