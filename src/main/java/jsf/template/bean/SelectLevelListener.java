package jsf.template.bean;

import org.primefaces.extensions.component.masterdetail.SelectLevelEvent;

import javax.enterprise.context.RequestScoped;

import javax.inject.Named;


/**
 * SelectLevelListener
 *
 * @author  ova / last modified by $Author: ova $
 * @version $Revision: 96279 $
 */
@Named
@RequestScoped
public class SelectLevelListener {

    private boolean errorOccured = false;

    public int handleNavigation(SelectLevelEvent selectLevelEvent) {
        if (errorOccured) {
            return 2;
        } else {
            return selectLevelEvent.getNewLevel();
        }
    }

    public void setErrorOccured(boolean errorOccured) {
        this.errorOccured = errorOccured;
    }
}
