package chainofresponsibility.demo;

public class Demo {
    public static void main(String[] args) {
        Dialog dialog =  new Dialog();
        dialog.wikiPageURL = "https://refactoring.guru/design-patterns/chain-of-responsibility";
        Panel panel = new Panel();
//        panel.modalHelpText= "This panel does.....";
        Button ok = new Button();
//        ok.tooltipText= "This is an OK button that...";

        panel.add(ok);
        dialog.add(panel);

        ok.showHelp();
    }
}
