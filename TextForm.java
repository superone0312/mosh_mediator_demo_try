public class TextForm extends UIController {
    private UIController list;
    private UIController button;

    @Override
    public void setContent(String content) {
        this.content = list.getContent();
        button.setStatus(true);
    }

    public TextForm(UIController list, UIController button) {
        this.list = list;
        this.button = button;
    }
}
