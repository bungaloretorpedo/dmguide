/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khalo.dmguide.dmgtables;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jagermeister
 */
public class dmg_tbl_NonHumanCharacterAge extends AbstractTableModel {
    String[] columns={"Race","Cleric","Fighter","Magic-User","Thief"};
    String[][] ages={
        {"dwarf"       ,"250 + 2d20" ,"40+5d4"   ,"_"         ,"75 + 3d6 "},
        {"elf"         ,"500 + 10d10","130 + 5d6","150 + 5d6" ,"100 + 5d6"},
        {"gnome"       ,"300 + 3d12" ,"60 + 5d4" ,"100 + 2d12","80 + 5d4 "},
        {"half-elf"    ,"40 + 2d4"   ,"22 + 3d4" ,"30 + 2d8"  ,"22 + 3d8 "},
        {"halfling"    ,"_"          ,"20 + 3d4" ,"_"         ,"40 + 2d4 "},
        {"half-orc"    ,"20 + 1d4"   ,"13 + 1d4" ,"_"         ,"20 + 2d4 "}
    };
    @Override
    public int getRowCount() {
        return ages.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return ages[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    
}
