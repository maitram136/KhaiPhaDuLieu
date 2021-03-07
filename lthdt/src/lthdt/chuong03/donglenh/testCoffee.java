/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong03.coffeelogic.CoffeeShop;
import lthdt.chuong03.coffeelogic.Manager;

/**
 *
 * @author USER
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[]{
            new CoffeeShop("Kha Coffee", "2 Nguyễn Huệ"),
            new CoffeeShop("White garden", "4 Nguyễn Huệ"),
            new CoffeeShop("Hoàng Trúc Viên", "3 Nguyễn Huệ")};
        Manager[] managers = new Manager[]{
            new Manager(a, 1000, "Lê Thị A", 0, df.parse("12-12-1999")),
            new Manager(new CoffeeShop[]{
                new CoffeeShop("Hoàng Hảo", "12 Nguyễn Huệ")
            },
                    2000, "Nguyễn Văn B", 1, df.parse("12-12-2000"))
        };
        System.out.println(Arrays.toString(managers));
}
    
}
