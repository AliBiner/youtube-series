package com.jd.ders21_30.ders25;

import java.util.UUID;

public class AccountHelper {
    
    public static String generateAccountNumber(){
        return UUID.randomUUID().toString();
    }

    public static String checkOwnerName(String ownerName){
        if(ownerName == null)
            System.out.println("");
        else if(ownerName.length()<3)
            System.out.println("");

        return ownerName;
    }
}
