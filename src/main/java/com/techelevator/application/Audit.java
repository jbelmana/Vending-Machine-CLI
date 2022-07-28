package com.techelevator.application;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
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

//>01/01/2016 12:00:15 PM MONEY FED:          $5.00  $10.00
//            >01/01/2016 12:00:20 PM 7Down           B4 $10.00   $6.75
//            >01/01/2016 12:01:25 PM SingleMint Gum  C2  $7.50   $4.40
//            >01/01/2016 12:01:35 PM CHANGE GIVEN:       $6.45   $0.00
//            >```

    private String getCurrentTime() {
        String date = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(new Date());
        return date;
    }

    public String timeAudit(String event, String currentBal, String  )
    try(Writer )
}


}
