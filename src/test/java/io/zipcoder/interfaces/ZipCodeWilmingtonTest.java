package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {


    @Test
    public void test1(){
        ZipCodeWilmington zcw = new ZipCodeWilmington();

        zcw.hostLecture(001,10.0);

        //System.out.println(zcw.getStudyMap());

    }

    @Test
    public void test2(){
        ZipCodeWilmington zcw = new ZipCodeWilmington();

        zcw.hostLecture(zcw.getInstructors().instructor2,20.0);

       //System.out.println(zcw.getStudyMap());

    }
}