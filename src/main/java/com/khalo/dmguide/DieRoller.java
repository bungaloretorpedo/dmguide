/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalo.dmguide;
import static java.lang.Integer.signum;
import java.security.SecureRandom;
//import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author jagermeister
 */
public class DieRoller {
    private static int DieCount;
    private static int Sides;
    private static int Bonus;
    private static SecureRandom rand = new SecureRandom();
    
    public DieRoller(int diecount,int sides,int bonus){
        DieCount=diecount;
        Sides=sides;
        Bonus=bonus;
    }
    public DieRoller(String dString){
        setRollString(dString);
    }
    private static void setRollString(String dString){
        var p = Pattern.compile("(\\d)*(d)(\\d)+(([+-])(\\d+))?");
        var m = p.matcher(dString);
        if (m.find()){
            /*
            System.out.println(m.groupCount()+" groups found");
            for (int i=0;i<=m.groupCount();i++){
                System.out.println(i+": "+m.group(i));
            }
               */
            DieCount = Integer.parseInt(m.group(1));
            Sides = Integer.parseInt(m.group(3));
            if (m.group(4)==null){
                Bonus=0;
            }
            else{
                Bonus=Integer.parseInt(m.group(4));
            }
        }
    }
    
    public String getRollString(){
        //String s;
        return switch (signum(Bonus)) {
            case 1 -> String.valueOf(DieCount)+"d"+String.valueOf(Sides)+"+"+Bonus;
            case -1 -> String.valueOf(DieCount)+"d"+String.valueOf(Sides)+"-"+Bonus;
            default -> String.valueOf(DieCount)+"d"+String.valueOf(Sides);
        };
    }

    /**
     *
     * @return
     */
    public static int Roll(){
        int rv=0;
        for (int i=0;i<DieCount;i++){
            rv+=1+(rand.nextInt(Sides));
        }
        rv+=Bonus;
        return rv;
    }

    
    public static int Roll(String rollString){
        setRollString(rollString);
        return Roll();
    }
}
