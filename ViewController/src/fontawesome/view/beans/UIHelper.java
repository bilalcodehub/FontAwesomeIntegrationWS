package fontawesome.view.beans;

import javax.faces.event.ActionEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.context.AdfFacesContext;

public class UIHelper {
   

    
    private RichButton toggleButton;

    public UIHelper() {
        super();
    }

    
    public void onToggleStateChange(ActionEvent actionEvent) {
        // Add event code here...
        if ((ADFContext.getCurrent().getPageFlowScope().get("rollupToggleState") == null) ||
            (ADFContext.getCurrent().getPageFlowScope().get("rollupToggleState").equals("off"))) {
            
                ADFContext.getCurrent().getPageFlowScope().put("rollupToggleState", "on");             
                AdfFacesContext.getCurrentInstance().addPartialTarget(toggleButton);
            }
        else {
                ADFContext.getCurrent().getPageFlowScope().put("rollupToggleState", "off");  
                AdfFacesContext.getCurrentInstance().addPartialTarget(toggleButton);
            }
    }

    public void setToggleButton(RichButton toggleButton) {
        this.toggleButton = toggleButton;
    }

    public RichButton getToggleButton() {
        return toggleButton;
    }

    

}
