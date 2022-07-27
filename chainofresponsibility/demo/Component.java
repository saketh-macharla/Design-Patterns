package chainofresponsibility.demo;

public abstract  class Component implements ComponentWithContextualHelp{

    String tooltipText;
    protected Container container;

    @Override
    public void showHelp() {
        if(tooltipText != null){
            System.out.println(tooltipText);
        }
        else{
            container.showHelp();
        }
    }
}
