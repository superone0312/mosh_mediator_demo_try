public class TextForm extends UIController {
    private UIController ui;

    @Override
    public void setContent(String content) {
        ui.setStatus(true);
    }

    public TextForm(UIController ui) {
        this.ui = ui;
    }
}
