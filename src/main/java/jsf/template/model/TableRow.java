package jsf.template.model;

import java.io.Serializable;

import java.util.Date;


/**
 * TableRow
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
public class TableRow implements Serializable {

    private Date column1;
    private int column2;
    private String column3;
    private String column4;
    private String column5;

    public TableRow() {
    }

    public TableRow(Date column1, int column2, String column3, String column4, String column5) {
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
        this.column4 = column4;
        this.column5 = column5;
    }

    public Date getColumn1() {
        return column1;
    }

    public void setColumn1(Date column1) {
        this.column1 = column1;
    }

    public int getColumn2() {
        return column2;
    }

    public void setColumn2(int column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4;
    }

    public String getColumn5() {
        return column5;
    }

    public void setColumn5(String column5) {
        this.column5 = column5;
    }
}
