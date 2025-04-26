package com.mycompany.systemforreform.models;

import java.util.Date;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

@Getter
@Setter

public class ShiftClosureModels {

    private int idShiftClosur;
    private Date date;
    private String inCharge;
    private String shift;
    private double beginningBalance;
    private double income;
    private double expenses;
    private double totalExpectedCash;
    private double totalRealCash;
    private double difference;
    private double cardPayments;
    private double transferPayments;
    private double totalSalesOfTheDay;

    public ShiftClosureModels(Date date, String inCharge, String shift, double beginningBalance, double income, double expenses, double totalExpectedCash, double totalRealCash, double difference, double cardPayments, double transferPayments, double totalSalesOfTheDay) {
        this.idShiftClosur = idGenerate();
        this.date = date;
        this.inCharge = inCharge;
        this.shift = shift;
        this.beginningBalance = beginningBalance;
        this.income = income;
        this.expenses = expenses;
        this.totalExpectedCash = totalExpectedCash;
        this.totalRealCash = totalRealCash;
        this.difference = difference;
        this.cardPayments = cardPayments;
        this.transferPayments = transferPayments;
        this.totalSalesOfTheDay = totalSalesOfTheDay;
    }

    private int idGenerate() {
        Random rd = new Random();
        return rd.nextInt(999999999);
    }

    public Document toDocumentShiftClosure() {
        return new Document()
                .append("idShiftClosur", this.idShiftClosur)
                .append("date", this.date)
                .append("inCharge", this.inCharge)
                .append("shift", this.shift)
                .append("beginningBalance", this.beginningBalance)
                .append("income", this.income)
                .append("expenses", this.expenses)
                .append("totalExpectedCash", this.totalExpectedCash)
                .append("totalRealCash", this.totalRealCash)
                .append("difference", this.difference)
                .append("cardPayments", this.cardPayments)
                .append("transferPayments", this.transferPayments)
                .append("totalSalesOfTheDay", this.totalSalesOfTheDay);
    }
}
