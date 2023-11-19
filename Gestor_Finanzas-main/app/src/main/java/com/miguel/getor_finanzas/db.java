package com.miguel.getor_finanzas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class db extends SQLiteOpenHelper {

    private static final String name_db = "Gestor_db";
    private static final int version_db=1;
    private static final String TABLE_CONSEJOS="CONSEJOS";

    public db(@Nullable Context context) {
        super(context, name_db, null, version_db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_CONSEJOS + "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                 "titulo TEXT, " +
                 "descripcion TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_CONSEJOS);
        onCreate(db);
    }

    public void AgregarConsejos(String titulo_para, String descripcion_para){
        SQLiteDatabase db2=getWritableDatabase();
        if(db2!=null){
            db2.execSQL("INSERT INTO CONSEJOS (titulo, descripcion) VALUES ('"+titulo_para+", "+descripcion_para+" ') ");
            db2.close();
        }
    }
}
