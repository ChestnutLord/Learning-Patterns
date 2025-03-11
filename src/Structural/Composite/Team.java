package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer{
    private List<Developer> devList=new ArrayList<>();
    @Override
    public void writeCode() {
        for(Developer dev:devList){
            dev.writeCode();
        }
    }

    public void addDeveloper(Developer developer) {
        devList.add(developer);
    }
}
