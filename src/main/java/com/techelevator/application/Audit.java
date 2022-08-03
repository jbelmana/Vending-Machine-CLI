package com.techelevator.application;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Audit {

    private static File auditFile = new File("Audit.txt");

    public static void auditFile() {
        if (auditFile.exists()) {
            auditFile.delete();
        } else {
            try {
                auditFile.createNewFile();
            } catch (IOException e) {
                System.err.println("Could not create new audit file.");
            }
        }
    }

    public static void timedAudit(String event, BigDecimal currentBalance, BigDecimal balanceAfter) {
        if (!auditFile.exists()) {
            auditFile();
        } else if(auditFile.exists()){
            String date = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(new Date());
            try (PrintWriter ghostWriter = new PrintWriter(new FileOutputStream(auditFile, true))) {
                DecimalFormat bigToDec = new DecimalFormat("0.00");
                ghostWriter.println(">" + date + " " + String.format("%-19s", event)+ " $" + bigToDec.format(currentBalance) + " $" + bigToDec.format(balanceAfter));
                ghostWriter.flush();
            } catch (IOException e) {
                System.err.println("File not found.");
            }
        }
    }
}
