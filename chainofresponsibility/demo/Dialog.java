package chainofresponsibility.demo;

public class Dialog extends Container{

    String wikiPageURL;


    public void showHelp(){
        if(wikiPageURL!= null){
            System.out.println(wikiPageURL);
        }
        else{
            super.showHelp();
        }
    }
}
