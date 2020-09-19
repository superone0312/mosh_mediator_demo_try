public class Main {
    public static void main(String[] args) {
        var button = new SaveButton();
        var form = new TextForm(button);
        var list = new ListBox(form);

        list.setContent("This post is selected");
        System.out.println(list.getContent());

    //    form.setContent("placeholder");
        String content = form.getContent();
        System.out.println("Content in editting: " + content);

        if (button.getStatus()) {
            System.out.println("Button is enabled");
        }

    }
}