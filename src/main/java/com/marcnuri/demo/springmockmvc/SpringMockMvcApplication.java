/*
 * SpringMockMvcApplication.java
 *
 * Created on 2018-05-14, 7:00
 */
package com.marcnuri.demo.springmockmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by Marc Nuri <marc@marcnuri.com> on 2018-05-14.
 */
@SpringBootApplication
@Import({
    SpringMockMvcConfiguration.class
})
public class SpringMockMvcApplication {

//**************************************************************************************************
//  Fields
//**************************************************************************************************

//**************************************************************************************************
//  Constructors
//**************************************************************************************************

//**************************************************************************************************
//  Abstract Methods
//**************************************************************************************************

//**************************************************************************************************
//  Overridden Methods
//**************************************************************************************************

//**************************************************************************************************
//  Other Methods
//**************************************************************************************************

//**************************************************************************************************
//  Getter/Setter Methods
//**************************************************************************************************

//**************************************************************************************************
//  Static Methods
//**************************************************************************************************
public static void main(String[] args) {
  SpringApplication.run(SpringMockMvcApplication.class, args);
}

//**************************************************************************************************
//  Inner Classes
//**************************************************************************************************

}
