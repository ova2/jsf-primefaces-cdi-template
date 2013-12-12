package jsf.template.bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;

import javax.inject.Named;


/**
 * Store for current selected level in master-detail.
 *
 * @author  ova / last modified by $Author: ova $
 * @version $Revision: 97278 $
 */
@Named
@ViewScoped
public class CurrentLevelData implements Serializable {

    private int currentLevel = 1;

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
}
