public class ListBox extends UIController {
    UIController ui;
    
    @Override
    public void setContent(String content){
        this.content = content;
        ui.setContent(content);
    }

    public ListBox(UIController ui) {
        this.ui = ui;
    }
}
