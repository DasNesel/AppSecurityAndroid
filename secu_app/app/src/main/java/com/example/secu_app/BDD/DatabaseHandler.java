package com.example.secu_app.BDD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    public static final String ACCOUNT_KEY = "id";
    public static final String ACCOUNT_NAME = "Nom du compte";
    public static final String USER_NAME = "Prénom de l'utilisateur";
    public static final String USER_LASTNAME = "Nom de l'utilisateur";
    public static final String IBAN = "IBAN";
    public static final String AMOUNT = "montant";
    public static final String CURRENCY = "devise";

    public static final String BANKACCONT = "Compte bancaire";
    public static final String BANKACCONT_TABLE_CREATE =
            "CREATE TABLE " + BANKACCONT + " (" +
                    ACCOUNT_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    ACCOUNT_NAME + " TEXT, " +
                    USER_NAME + " TEXT, " +
                    USER_LASTNAME + " TEXT, " +
                    IBAN + " TEXT, " +
                    AMOUNT + " REAL, " +
                    CURRENCY + " TEXT" +
        ");";
    private static final String METIER_TABLE_DROP = "DROP TABLE IF EXISTS " + BANKACCONT + ";";

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(BANKACCONT_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(METIER_TABLE_DROP);
        onCreate(db);
    }
}

