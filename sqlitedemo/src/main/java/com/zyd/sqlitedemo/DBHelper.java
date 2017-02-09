package com.zyd.sqlitedemo;

import android.database.sqlite.SQLiteDatabase;

import java.io.File;

/**
 * Created by 张玉栋 on 2017/2/8.
 */

public class DBHelper {

    private static DBHelper dbHelper = null;

    private SQLiteDatabase db = null;
    public static DBHelper getInstance(){
        if(dbHelper == null){
            dbHelper  = new DBHelper();
        }
        return dbHelper;
    }

    private DBHelper(){
        File file = MyApplication.getInstance().getDatabasePath("Demo");
        File dir = file.getParentFile();
        if(!dir.exists()){
            dir.mkdirs();
        }

        openDB(file.getAbsolutePath());
        init();
    }

    private void init() {
    }

    private void openDB(String name) {
        if(db != null){
            db.close();
            db = null;
        }
        db = SQLiteDatabase.openOrCreateDatabase(name, null);
    }
    
}
