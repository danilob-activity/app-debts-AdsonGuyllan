package com.example.danilo.appdebts.dao;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.danilo.appdebts.classes.Debts;

/**
 * Created by aluno on 27/06/19.
 */

public class DebtsDAO {
    private SQLiteDatabase mConnection;
    private DebtsDAO(SQLiteDatabase connection){
        mConnection = connection;
    }

    private void insert(Debts debts) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("valor", debts.getValue());
        contentValues.put("description",debts.getDescription());
        contentValues.put("data_vencimento",debts.getMpaymentDate());
        contentValues.put("data_pagamento",debts.getMpayDate());
        contentValues.put("cod_cat",debts.getId());
        mConnection.insertOrThrow("dividas", null,contentValues);
        Log.d("DebtsDAO", "Inserção realizada com sucesso");
    }

    public void remove(long id){
        String[] params = new String[1];
        params[0] = String.valueOf(id);
        mConnection.delete("Debts", "id=?", params);
    }

    public void alter (Debts debts) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("valor", debts.getValue());
        contentValues.put("description", debts.getDescription());
        contentValues.put("data_vencimento", debts.getMpaymentDate());
        contentValues.put("data_pagamento", debts.getMpayDate());
        contentValues.put("cod_cat", debts.getId());
        String[] params = new String[1];
        params[0] = String.valueOf(debts.getId());
        mConnection.update("Debts", contentValues, "id=?", params);
    }
}
