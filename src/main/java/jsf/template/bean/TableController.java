package jsf.template.bean;

import jsf.template.model.TableRow;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

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

        for (int i = 0; i < 20; i++) {
            // add 20 rows
            rows.add(new TableRow("Value 1" + i, "Value 2" + i, "Value 3" + i, "Value 4" + i, "Value 5" + i));
        }
    }

    public List<TableRow> getRows() {
        return rows;
    }

    public void setRows(List<TableRow> rows) {
        this.rows = rows;
    }

    public void navigateToMore() {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Navigation to more details fired", null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
