package org.primefaces.perf;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import javax.enterprise.context.SessionScoped;

import javax.faces.bean.ViewScoped;

import javax.inject.Named;


/**
 * TableProvider
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class TableController implements Serializable {

    private List<TableRow> rows;

    @PostConstruct
    protected void initialize() {
        rows = new ArrayList<TableRow>();

        for (int i = 0; i < 25; i++) {
            // add 25 rows
            rows.add(new TableRow());
        }
    }

    public List<TableRow> getRows() {
        return rows;
    }

    public void setRows(List<TableRow> rows) {
        this.rows = rows;
    }
}
