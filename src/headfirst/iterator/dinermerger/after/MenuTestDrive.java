package headfirst.iterator.dinermerger.after;

import java.util.*;

public class MenuTestDrive {
    public static void main(String args[]) {
        PancakeHouseMenu phm = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        //
        Waitress w = new Waitress(phm, dinerMenu);
        w.printMenu();
    }
}