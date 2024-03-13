/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algo;

import java.util.ArrayList;

/**
 *
 * @author nishc
 */
public class Test {
    ArrayList<String> a ;
    Test()
    {
       a  = new ArrayList<String>();
    }
    public static void main(String[] args) {
        Test t = new Test();
         String a ="hellow";
    String b ="Test";
    String c ="Bbye";
        t.a.add(a);
        t.a.add(b);
        t.a.add(c);
        
        t.a.forEach(x->{
        
            System.out.println(x);
            
        });
    }
}
