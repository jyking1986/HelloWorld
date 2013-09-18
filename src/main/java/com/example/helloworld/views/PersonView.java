package com.example.helloworld.views;


import com.example.helloworld.core.Person;
import com.yammer.dropwizard.views.View;

public class PersonView extends View {
    private final Person person;

    public PersonView(Person person) {

        super("/views/person.ftl");
        //super("/Users/ethan.wang/Documents/develop/java/HelloWorld/src/main/resources/views/person.ftl");
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
