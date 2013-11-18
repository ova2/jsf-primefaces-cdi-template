package jsf.template.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

import javax.faces.context.FacesContext;

import javax.inject.Named;


/**
 * NavigationContext
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@SessionScoped
public class NavigationContext implements Serializable {

    public String getMenuitemStyleClass(String page) {
        String viewId = FacesContext.getCurrentInstance().getViewRoot().getViewId();
        if (page.equals(viewId)) {
            return "ui-state-active";
        }

        return "";
    }
}
