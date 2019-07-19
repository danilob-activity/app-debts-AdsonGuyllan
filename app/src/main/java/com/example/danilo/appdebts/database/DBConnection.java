package com.example.danilo.appdebts.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;

import com.example.danilo.appdebts.R;

public class DBConnection {
    public static SQLiteDatabase getConnection(Context context) {
        try {
            DatabaseHelper mDataHelper = new DatabaseHelper(context);
            Log.d("Database", "Conexão realizada com sucesso");
            return mDataHelper.getWritableDatabase();
        } catch (SQLException e) {
            Log.d("Database", "Erro na conexão", e);
            return null;
        }
    }

    public static SQLiteDatabase getConnection(Context context, View v) {
        try {
            DatabaseHelper mDataHelper = new DatabaseHelper(context);
            Log.d("Database", "Conexão realizada com sucesso");
            Snackbar.make(v, R.string.sucess_conection, Snackbar.LENGTH_LONG).show();
            return mDataHelper.getWritableDatabase();
        } catch (SQLException e) {
            Log.d("Database", "Erro na conexão", e);
            Snackbar.make(v, e.toString(), Snackbar.LENGTH_LONG).show();
            return null;
        }
    }
}