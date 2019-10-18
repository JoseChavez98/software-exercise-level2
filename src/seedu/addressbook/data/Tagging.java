package seedu.addressbook.data;

import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.tag.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tagging {
    private List<String> tagList = new ArrayList<>();

    public Tagging(){}

    public void addTag(Person toAdd){
        Set<Tag> tagSet=toAdd.getTags();

        for(Tag tag : tagSet){
            this.tagList.add("+ "+toAdd.getName()+" ["+tag.tagName +"]");
        }
    }

    public void removeTag(ReadOnlyPerson toRemove){
        Set<Tag> tagSet=toRemove.getTags();

        for(Tag tag : tagSet){
            this.tagList.add("- "+toRemove.getName()+" ["+tag.tagName +"]");
        }
    }

    public void print(){
        for(String string: tagList){
            System.out.println(string);
        }
    }
}
