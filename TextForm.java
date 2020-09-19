public class TextForm extends UIController {
    private String content;
    private ListBox list;
    private SaveButton button;

    public String getContent() {
        return content;
    }

    public void setContent() {
        this.content = list.getSelectedPost();
        button.setEnabled(true);
    }

    public TextForm(ListBox list, SaveButton button) {
        this.list = list;
        this.button = button;
    }
}
