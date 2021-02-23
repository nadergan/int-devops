package com.github.alexaegis.people;

import java.util.Arrays;

import com.github.alexaegis.people.exceptions.IllegalNameException;

public class NameBuilder {

    private Name name;

    public NameBuilder() {
        this.name = new Name();
    }

    public NameBuilder(String names) throws IllegalNameException {
        this();
        if(names.isEmpty()) {
            throw new IllegalNameException();
        }
        Arrays.asList(names.split(" ")).forEach(s -> {
            try {
                this.addName(s);
            } catch (IllegalNameException e) {
                e.printStackTrace();
            }
        });
        if (this.name.getNames().size() < 2) {
            throw new IllegalNameException();
        }
    }

    public NameBuilder addPrefix(String prefix) throws IllegalNameException {
        if(prefix.isEmpty()) {
            throw new IllegalNameException();
        } else {
            this.name.setPreFix(prefix);
            return this;
        }
    }

    public NameBuilder addName(String name) throws IllegalNameException {
        if(name.isEmpty() || Character.isLowerCase(name.charAt(0))) {
            throw new IllegalNameException();
        } else {
            this.name.addName(name);
            return this;
        }
    }

    public NameBuilder addPostFix(String postfix) throws IllegalNameException {
        if(postfix.isEmpty()) {
            throw new IllegalNameException();
        } else {
            this.name.setPostFix(postfix);
            return this;
        }
    }

    public Name getName() {
        return this.name;
    }

}