package com.github.alexaegis.people;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Name {

    private String preFix;
    private List<String> names;
    private String postFix;

    Name() {
        names = new ArrayList<>();
    }

    String getPreFix() {
        return preFix;
    }

    void setPreFix(String preFix) {
        this.preFix = preFix;
    }

    List<String> getNames() {
        return names;
    }

    String getFirstName() {
        return names.get(0);
    }

    String getLastName() {
        return names.get(names.size() - 1);
    }

    void setNames(List<String> names) {
        this.names = names;
    }

    void addName(String name) {
        this.names.add(name);
    }

    String getPostFix() {
        return postFix;
    }

    void setPostFix(String postFix) {
        this.postFix = postFix;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Name name = (Name) o;

        if (preFix != null ? !preFix.equals(name.preFix) : name.preFix != null) {
            return false;
        }
        if (names != null ? !names.equals(name.names) : name.names != null) {
            return false;
        }
        return postFix != null ? postFix.equals(name.postFix) : name.postFix == null;

    }

    @Override
    public int hashCode() {
        int result = preFix != null ? preFix.hashCode() : 0;
        result = 31 * result + (names != null ? names.hashCode() : 0);
        result = 31 * result + (postFix != null ? postFix.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        String result = "";

        if (this.getPreFix() != null) {
            result += this.getPreFix();
            if (this.getPostFix() != null || !this.getNames().isEmpty()) {
                result += " ";
            }
        }

        Iterator nameList = this.getNames().iterator();

        while(nameList.hasNext()) {
            result += nameList.next() + " ";
        }

        if (this.getPostFix() != null) {
            result += this.getPostFix();
        } else {
            result = result.substring(0, result.lastIndexOf(' '));
        }

        return result;
    }

}