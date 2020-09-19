public class Main {
    public static void main(String[] args) {
        var list = new ListBox();
        var button = new SaveButton();
        var form = new TextForm(list, button);

        list.setSelectedPost("This post is selected");
        System.out.println(list.getSelectedPost());

        form.setContent();
        String content = form.getContent();
        System.out.println("Content in editting: " + content);
        
        if (button.isEnabled()) {
            System.out.println("Button is enabled");
        }

    }
}