package com.company;

/*

1302 Beer-2. Return
Add the Drink interface to the AlcoholicBeer class and implement all of its methods.
Requirements:
1. The AlcoholicBeer class must implement the (implements) Drink interface.
2. In the AlcoholicBeer class, all methods of the Drink interface must be implemented.
3. The AlcoholicBeer class should contain only two methods.
4. The isAlcoholic method should return true, because beer contains alcohol.
5. The program should display the type of drink depending on what the isAlcoholic method returns.



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }
        }
        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
}
