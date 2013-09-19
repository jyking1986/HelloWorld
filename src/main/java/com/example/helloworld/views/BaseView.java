package com.example.helloworld.views;

import com.example.helloworld.core.Person;
import com.yammer.dropwizard.views.View;


public class BaseView extends View {
    private final Person person;

    public BaseView(String templateName, Person person) {
        super("/views/Pages/"+templateName+".ftl");
        this.person=person;
    }
    public Person getPerson() {
        return person;
    }
}
