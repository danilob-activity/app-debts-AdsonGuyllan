package com.example.danilo.appdebts.database;

import android.database.sqlite.SQLiteDatabase;

import com.example.danilo.appdebts.dao.CategoryDAO;
import com.example.danilo.appdebts.dao.DebtsDAO;
import com.example.danilo.appdebts.classes.Category;
import com.example.danilo.appdebts.classes.Debts;

public class Seeder {
    public static void seed(SQLiteDatabase connection) {
        CategoryDAO categoryDAO = new CategoryDAO(connection);
        DebtsDAO debtDAO = new DebtsDAO(connection);

        Category cat1 = categoryDAO.insert(new Category("Alimentação"));
        Category cat2 = categoryDAO.insert(new Category("Pagamentos"));
        Category cat3 = categoryDAO.insert(new Category("Moradia"));
        Category cat4 = categoryDAO.insert(new Category("Roupas"));
        Category cat5 = categoryDAO.insert(new Category("Lazer"));

        Debts debt1 = new Debts();
        debt1.setDescription("Lanche faculdade");
        debt1.setValue(7.50);
        debt1.setPayDate("28/06/2019");
        debt1.setCategory(cat1);
        debtDAO.insert(debt1);

        Debts debt2 = new Debts();
        debt2.setDescription("Janta Lunático");
        debt2.setValue(43.0);
        debt2.setPayDate("29/06/2019");
        debt2.setCategory(cat1);
        debtDAO.insert(debt2);

        Debts debt3 = new Debts();
        debt3.setDescription("Cartão NuBank");
        debt3.setValue(268.24);
        debt3.setPayDate("17/06/2019");
        debt3.setCategory(cat2);
        debtDAO.insert(debt3);

        Debts debt4 = new Debts();
        debt4.setDescription("Cartão Riachuelo");
        debt4.setValue(31.21);
        debt4.setPayDate("13/06/2019");
        debt4.setCategory(cat2);
        debtDAO.insert(debt4);

        Debts debt5 = new Debts();
        debt5.setDescription("Água");
        debt5.setValue(43.17);
        debt5.setPayDate("23/06/2019");
        debt5.setCategory(cat3);
        debtDAO.insert(debt5);

        Debts debt6 = new Debts();
        debt6.setDescription("Internet");
        debt6.setValue(100.0);
        debt6.setPayDate("20/06/2019");
        debt6.setCategory(cat3);
        debtDAO.insert(debt6);

        Debts debt7 = new Debts();
        debt7.setDescription("Roupa Natal");
        debt7.setValue(86.99);
        debt7.setPayDate("20/12/2018");
        debt7.setCategory(cat4);
        debtDAO.insert(debt7);

        Debts debt8 = new Debts();
        debt8.setDescription("Roupa São João");
        debt8.setValue(51.60);
        debt8.setPayDate("29/06/2019");
        debt8.setCategory(cat4);
        debtDAO.insert(debt8);

        Debts debt9 = new Debts();
        debt9.setDescription("Candeeiro");
        debt9.setValue(65.12);
        debt9.setPayDate("22/06/2019");
        debt9.setCategory(cat5);
        debtDAO.insert(debt9);

        Debts debt10 = new Debts();
        debt10.setDescription("Festa São João");
        debt10.setValue(41.0);
        debt10.setPayDate("29/06/2019");
        debt10.setCategory(cat5);
        debtDAO.insert(debt10);
    }
}