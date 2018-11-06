package com.manekineko.recyclerview_example;

public class Info {
    public int type;
    public int star;
    public String date;
    public String title;
    public String detail;
    public static final int TYPE1=0;
    public static final int TYPE2=0;
    public Info(int type, int star, String date, String title, String detail){
        this.type = type;
        this.star = star;
        this.date = date;
        this.title = title;
        this.detail = detail;
    }

}
