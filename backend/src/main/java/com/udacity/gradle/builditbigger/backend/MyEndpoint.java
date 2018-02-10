package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

import exampls.com.tellingjokes.myClass;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public myClass sayHi(@Named("name") String joke) {
        /*MyBean response = new MyBean();
        response.setData("Hi, " + name);
*/
        myClass myclass = new myClass();
        //return new String("i was lighting before the thunder, thunder, thunder, thund");
        myclass.setJoke(joke);

        return myclass;
    }

}
