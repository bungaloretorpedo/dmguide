/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalo.dmguide;

/**
 *
 * @author jagermeister
 */
public abstract class Spell {
    public static String Name;
    MagicType[] MagicType;
    Boolean Reversible;
    int Level;
    int Range;
    int Duration;
    Object AreaOfEffect;
    SpellComponents[] Components;
    int CastingTime;
    Object SavingThrow;
    String description;
    public Spell(){
        
    }
    public void cast(){
        
    }
}
