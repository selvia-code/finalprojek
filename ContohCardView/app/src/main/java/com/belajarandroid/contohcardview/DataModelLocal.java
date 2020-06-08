package com.belajarandroid.contohcardview;


public class DataModelLocal {


    String name;
    String version;
    int id_;
    int image;

    public DataModelLocal(String name, String version, int id_, int image) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image=image;
    }


    public String getName() {
        return name;
    }


    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}