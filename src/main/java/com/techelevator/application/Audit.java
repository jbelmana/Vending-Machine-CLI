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
                System.out.println("Could not create new audit file.");
            }
        }
    }

    private String getCurrentTime() {
        String date = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(new Date());
        return date;
    }

    public static void timeAudit(String date, String event, BigDecimal currentBalance, BigDecimal balanceAfter){
        try (PrintWriter ghostWriter =  new PrintWriter(new FileOutputStream(auditFile, true))){
            DecimalFormat bigToDec = new DecimalFormat("0.00");


      //      String event = userinput choice tbd


            ghostWriter.println(">" + date + " " + event + " " + bigToDec.format(currentBalance) + bigToDec.format(balanceAfter));
            ghostWriter.flush();
        }catch(IOException e){
            System.out.println("File not found.");
        }
    }
}

//            >01/01/2016 12:00:15 PM MONEY FED:          $5.00  $10.00
//            >01/01/2016 12:00:20 PM 7Down           B4 $10.00   $6.75
//            >01/01/2016 12:01:25 PM SingleMint Gum  C2  $7.50   $4.40
//            >01/01/2016 12:01:35 PM CHANGE GIVEN:       $6.45   $0.00
//            >```
