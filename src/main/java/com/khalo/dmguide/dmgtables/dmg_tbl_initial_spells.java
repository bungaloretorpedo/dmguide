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
public class dmg_tbl_initial_spells extends AbstractTableModel {
    String[] columns={"","Offensive Spells","Defensive Spells","Misc. Spells"};
    String[][] spells={
        {"1","Burning Hands","Affect Normal Fires","Comprehend Languages"},
        {"2","Charm Person","Dancing Lights","Detect Magic"},
        {"3","Enlarge","Feather Fall","Erase"},
        {"4","Friends","Hold Portal","Find Familiar"},
        {"5","Light","Jump","Identify"},
        {"6","Magic Missile","Protection From Evil","Mending"},
        {"7","Push","Shield","Message"},
        {"8","Shocking Grasp","Spider Climb","Unseen Servant"},
        {"9","Sleep","Ventriloquism","Write"},
        {"10","(choose)","(choose)","(choose)"}
    };
    @Override
    public String getValueAt(int r, int c){
        return spells[r][c];
    }
    @Override
    public int getColumnCount(){
        return columns.length ;
    }

    @Override
    public int getRowCount() {
        return spells.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/*
    @Override
    public void addTableModelListener(TableModelListener l) {
        super.addTableModelListener(l);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
/*
    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/    
}
