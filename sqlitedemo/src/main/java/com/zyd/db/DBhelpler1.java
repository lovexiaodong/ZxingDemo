package com.zyd.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 张玉栋 on 2017/2/8.
 */

public class DBhelpler1 extends SQLiteOpenHelper{

    public DBhelpler1(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DBhelpler1(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private String craeteTableSql(Class<?> clazz){
        Table table = clazz.getAnnotation(Table.class);
        String tableName = table.name();
        StringBuffer buffer = new StringBuffer();
        buffer.append("CREATE TABLE IF NOT EXISTS ");
        buffer.append(tableName);

         return buffer.toString();
    }
}
