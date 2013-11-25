package jsf.template.bean;

import java.io.Serializable;

import java.util.Locale;

import javax.annotation.PostConstruct;

import javax.enterprise.context.SessionScoped;

import javax.faces.context.FacesContext;

import javax.inject.Named;


/**
 * UserSettings
 *
 * @author Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@SessionScoped
public class UserSettings implements Serializable {

    private Locale locale;

    @PostConstruct
    protected void initialize() {
        locale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
