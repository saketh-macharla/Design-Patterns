package chainofresponsibility.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class Container extends Component {

    protected List<Component> children;

    void add(Component child){
        if(children == null){
            children = new ArrayList<>();
        }
        children.add(child);
        child.container=this;
    }
}
