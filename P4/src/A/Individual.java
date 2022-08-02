package MTQuestionEight;

import java.util.ArrayList;

public class Individual {

    String fName;
    String lName;

    Individual mother;
    Individual father;

    ArrayList<Individual> siblings;
    ArrayList<Individual> children;

    public Individual(String first, String last){
        this.fName = first;
        this.lName = last;

        if(siblings == null){
            siblings = new ArrayList<Individual>();
        }

        if(children == null){
            children = new ArrayList<Individual>();
        }
    }

    public Individual(Individual f, Individual m, String first){
        this.mother = m;
        this.father = f;
        this.fName = first;
        this.lName = f.getLastName();

        if(siblings == null){
            siblings = new ArrayList<Individual>();
        }

        if(children == null){
            children = new ArrayList<Individual>();
        }

        mother.addChild(this);
        father.addChild(this);

        if(father.children != null){
            siblings = father.getChildren();
        }
    }

    public String getFullName(){
        return fName + " " + lName;
    }

    public String getLastName(){
        return this.lName;
    }

    public Individual getMother(){
        return mother;
    }

    public Individual getFather(){
        return father;
    }

    public ArrayList<Individual> getSiblings() {
        return siblings;
    }

    public ArrayList<Individual> getChildren() {
        return children;
    }

    public void addSibling(Individual sibling){
        siblings.add(sibling);
    }

    public void addChild(Individual child){
        children.add(child);
    }

    public String toString(){
        String familyInfo = getFullName() + "\n\n" +
                            "Mother: " + mother.getFullName() + "\n" +
                            "Father: " + father.getFullName() + "\n";

        familyInfo += "\nChildren: \n";
        for(int i = 0; i < children.size(); i++){
            familyInfo += children.get(i).getFullName() + "\n";
        }

        familyInfo += "\nSiblings: \n";
        for(int i = 0; i < siblings.size(); i++){
            if(!siblings.get(i).getFullName().equals(this.getFullName())) {
                familyInfo += siblings.get(i).getFullName() + "\n";
            }
        }

        return familyInfo;
    }
}
