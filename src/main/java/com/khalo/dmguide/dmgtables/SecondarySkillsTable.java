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
public class SecondarySkillsTable extends AbstractTableModel {
    String[] columns={"Dice Score","Result"};
    String[][] skills={
        {"01","Armorer"},
        {"03","Bowyer/fletcher"},
        {"05","Farmer/gardener"},
        {"11","Fisher (netting)"},
        {"15","Forester"},
        {"21","Gambler"},
        {"24","Hunter/fisher (hook and line)"},
        {"28","Husbandman (animal husbandry)"},
        {"33","Jeweler/lapidary"},
        {"35","Leather worker/tanner"},
        {"38","Limner/painter"},
        {"40","Mason/carpenter"},
        {"43","Miner"},
        {"45","Navigator (fresh or salt water)"},
        {"47","Sailor (fresh or salt)"},
        {"50","Shipwright (boats or ships)"},
        {"52","Tailor/weaver"},
        {"55","Teamster/freighter"},
        {"58","Trader/barterer"},
        {"61","Trapper/furrier"},
        {"65","Woodworker/cabinetmaker"},
        {"68","NO SKILL OF MEASURABLE WORTH"},
        {"86","ROLL TWICE IGNORING THIS RESULT HEREAFTER"}
    };
    @Override
    public int getRowCount() {
        return skills.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return skills[rowIndex][columnIndex];
    }
    
}
