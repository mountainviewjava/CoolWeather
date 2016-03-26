package com.htc.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.renderscript.RenderScript;

/**
 * Created by john on 2016/3/25.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    //province 建表语句
    public static final String CREATE_PROVINCE ="create table Province ("+
            "id integer primary key autoincrement,"+
            "province_name text,"+
            "province_code text)";
    //city表建表语句
    public static final String CREATE_CITY ="create table City ("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";
    //country表建表语句
    public static final String CREATE_CONTRY ="create table Country ("
            +"id integer primary key autoincrement,"
            +"contry_name text,"
            +"contry_code text,"
            +"city_id integer)";

    public CoolWeatherOpenHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,int version){
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_CONTRY);
        db.execSQL(CREATE_PROVINCE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
