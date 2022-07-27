package chainofresponsibility.demo;

public class Panel extends Container{

    String modalHelpText;

    public void showHelp(){
        if(modalHelpText!= null){
            System.out.println(modalHelpText);
        }
        else{
            super.showHelp();
        }
    }
}
